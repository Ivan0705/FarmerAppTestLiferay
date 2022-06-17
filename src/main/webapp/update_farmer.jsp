<%@page import="com.liferay.portal.kernel.exception.SystemException" %>
<%@page import="com.liferay.portal.kernel.servlet.SessionErrors" %>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages" %>
<%@page import="com.meera.dbservice.model.Farmer" %>
<%@ page import="java.util.List" %>
<%@ page import="static com.meera.dbservice.service.FarmerLocalServiceUtil.getFarmers" %>
<%@ page import="static com.meera.dbservice.service.FarmerLocalServiceUtil.getFarmersCount" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%request.setCharacterEncoding("UTF-8");%>
<script src="https://cdn.alloyui.com/3.0.1/aui/aui-min.js"></script>
<link href="https://cdn.alloyui.com/3.0.1/aui-css/css/bootstrap.min.css" rel="stylesheet"/>
<portlet:defineObjects/>
<portlet:renderURL var="homeURL"/>
<portlet:actionURL var="updateFarmerActionURL" windowState="normal"
                   name="updateFarmer">
</portlet:actionURL>
<portlet:actionURL var="getFarmerActionURL" windowState="normal" name="getFarmer">
    <portlet:param name="cmd" value="UPDATE"/>
</portlet:actionURL>
<h2>Обновление записи фермера</h2>
<a href="<%=homeURL %>">Назад</a><br/><br/>
<% if (SessionMessages.contains(renderRequest.getPortletSession(), "farmer-update-success")) {%>
<liferay-ui:success key="farmer-update-success" message="Selected Farmer
 information have been updated successfully."/>
<%} %>
<% if (SessionErrors.contains(renderRequest.getPortletSession(),
        "farmer-update-error")) {%>
<liferay-ui:error key="farmer-update-error" message="There is an
Error occurred while updating farmer please try again"/>
<%} %>

<%
    List<Farmer> farmerList = null;
    try {
        farmerList = getFarmers(0, getFarmersCount());
    } catch (SystemException e) {
        e.printStackTrace();
    }
    Farmer selectedFarmerObject = (Farmer) renderRequest.getAttribute("farmerObject");
%>
<form action="<%=getFarmerActionURL.toString()%>" name="farmerForm" method="POST">
    <b>Select Farmer ID</b><br>
    <select name="<portlet:namespace/>farmerId" onchange="submitform(this.value);">
        <option value="-1">--Выбирайте--</option>
        <%for (Farmer farmer : farmerList) {%>
        <option
                value="<%=farmer.getFarmerId()%>" <%=selectedFarmerObject != null && selectedFarmerObject.getFarmerId() ==
                farmer.getFarmerId() ? "selected" : ""%>>
            <%=farmer.getFarmerId()%>
        </option>
        <%} %>
    </select><br>
    <%if (selectedFarmerObject != null) {%>
    <b>Имя</b><br/>
    <input type="text" name="<portlet:namespace/>name"
           id="<portlet:namespace/>name"
           value="<%=selectedFarmerObject.getName()%>"/><br/>
    <b>Юридический статус</b><br/>
    <select name="<portlet:namespace/>organization_legal"
            id="<portlet:namespace/>organization_legal"
            value="<%=selectedFarmerObject.getOrganization_legal()%>">
        <option value="ЮР">ЮР</option>
        <option value="ИП">ИП</option>
        <option value="ФЛ">ФЛ</option>
    </select><br/>
    <b>ИНН</b><br/>
    <input type="text" name="<portlet:namespace/>ITN"
           id="<portlet:namespace/>ITN"
           value="<%=selectedFarmerObject.getITN()%>"/><br/>
    <b>КПП</b>
    <input type="text" name="<portlet:namespace/>IEC"
           id="<portlet:namespace/>IEC"
           value="<%=selectedFarmerObject.getIEC()%>"/><br/>
    <b>ОГРН</b>
    <input type="text" name="<portlet:namespace/>PSRN"
           id="<portlet:namespace/>PSRN"
           value="<%=selectedFarmerObject.getPSRN()%>"/><br/>
    <b>Место регистрации</b>
    <select type="text" name="<portlet:namespace/>area_registration"
            id="<portlet:namespace/>area_registration"
            value="<%=selectedFarmerObject.getArea_registration()%>">
        <option value="AA">AA</option>
        <option value="BB">BB</option>
        <option value="CC">CC</option>
    </select><br/>
    <b>Посевные поля</b>
    <select name="<portlet:namespace/>area_fields"
            id="<portlet:namespace/>area_fields"
            value="<%=selectedFarmerObject.getArea_fields()%>">
        <option value="a">a</option>
        <option value="b">b</option>
        <option value="c">c</option>
        <option value="d">d</option>
    </select><br/>
    <b>Дата регистрации</b>
    <textarea name="<portlet:namespace/>date_registration"
              id="<portlet:namespace/>date_registration"
              value="<%=selectedFarmerObject.getDate_registration()%>"></textarea><br/>

    <input type="button" name="updateFarmer" id="updateFarmer"
           value="Update Farmer" onclick="updateFarmerRecord();"/>
    <%}%>
</form>
<script>
    function submitform(selectedValue) {
        if (selectedValue != "-1") {
            document.farmerForm.submit();
        }

    }

    function updateFarmerRecord() {
        document.farmerForm.action = "<%=updateFarmerActionURL.toString()%>"
        document.farmerForm.submit();
    }

    YUI().use(
        'aui-datepicker',
        function (Y) {
            new Y.DatePicker(
                {
                    trigger: 'textarea',
                    mask: '%d/%m/%y',
                    calendar: {
                        selectionMode: 'multiple'
                    },
                    popover: {
                        zIndex: 1
                    },
                    panes: 2
                }
            );
        }
    );
</script>

