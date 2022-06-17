<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="aui" uri="http://alloy.liferay.com/tld/aui" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%request.setCharacterEncoding("UTF-8");%>
<script src="https://cdn.alloyui.com/3.0.1/aui/aui-min.js"></script>
<link href="https://cdn.alloyui.com/3.0.1/aui-css/css/bootstrap.min.css" rel="stylesheet"/>
<portlet:defineObjects/>
<portlet:renderURL var="homeURL">
    <portlet:param name="mvcPath" value="/view.jsp"/>
</portlet:renderURL>

<portlet:actionURL var="addFarmerActionURL" windowState="normal"
                   name="addFarmer">
</portlet:actionURL>

<h2>Добавление записи фермера</h2>
<a href="<%=homeURL.toString() %>">Назад</a><br/><br/>

<aui:form name="farmerForm" action="<%=addFarmerActionURL%>" method="POST"></
    <aui:input type="text" name="name" label="Введите название" title="name">
        <aui:validator name="required"/>
        <aui:validator name="alpha" errorMessage="Enter characters that exist in the alphabet next time, please."/>
    </aui:input>

    <aui:select name="organization_legal" label="Выберите из списка юр.статус">
        <aui:option value="ЮР">ЮР</aui:option>
        <aui:option value="ИП">ИП</aui:option>
        <aui:option value="ФЛ">ФЛ</aui:option>
    </aui:select>
    <aui:input type="text" name="ITN" label="Введите ИНН" title="ITN">
        <aui:validator name="required"/>
        <aui:validator name="number" errorMessage="Enter characters that exist in the alphabet next time, please."/>
        <aui:validator name="range"
                       errorMessage="From 99999999999 to 999999999999">[99999999999, 999999999999]</aui:validator>
    </aui:input>
    <aui:input type="text" name="IEC" label="Введите КПП" title="IEC">
        <aui:validator name="required"/>
        <aui:validator name="number" errorMessage="Enter characters that exist in the alphabet next time, please."/>
    </aui:input>
    <aui:input type="number" name="PSRN" label="Введите ОГРН" title="PSRN">
        <aui:validator name="required"/>
        <aui:validator name="number" errorMessage="Enter characters that exist in the alphabet next time, please."/>
    </aui:input>
    <aui:select name="area_registration" label="Выберите из списка район регистрации">
        <aui:option value="AA">AA</aui:option>
        <aui:option value="BB">BB</aui:option>
        <aui:option value="CC">CC</aui:option>
    </aui:select>
    <aui:select name="area_fields" label="Выберите посевные поля из списка">
        <aui:option value="a">a</aui:option>
        <aui:option value="b">b</aui:option>
        <aui:option value="c">c</aui:option>
        <aui:option value="d">d</aui:option>
    </aui:select>
    <aui:input type="textarea" name="date_registration" label=" Введите дату регистрацию:" title="date_registration"/>
    <b>Архив:</b><br/>
    <input type="radio" name="<portlet:namespace/>archive" value="1">Не добавлять в архив<br>
    <input type="radio" name="<portlet:namespace/>archive" value="0">Добавить в архив<br/>
    <aui:button-row><aui:button type="submit" name="addFarmer" value="Добавить"/></aui:button-row>
</aui:form>
<script>
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

