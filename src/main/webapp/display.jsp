<%@page import="com.meera.dbservice.model.Farmer" %>
<%@page import="com.meera.dbservice.service.FarmerLocalServiceUtil" %>
<%@ include file="init.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%request.setCharacterEncoding("UTF-8");%>
<portlet:defineObjects/>
<h2>Информация о фермере</h2>
<%
    String redirect = ParamUtil.getString(request, "backURL");
    long farmerId = ParamUtil.getLong(request, "farmerId");
    Farmer selectedFarmerObject = null;
    if (farmerId > 0) {
        selectedFarmerObject = FarmerLocalServiceUtil.getFarmer(farmerId);
    }
%>
<a href="<%=redirect %>">Назад</a><br/><br/>
<%if (selectedFarmerObject != null) {%>
Название:<%=selectedFarmerObject.getName() + "&nbsp;"%>
<br/>
юридический статус: <%=selectedFarmerObject.getOrganization_legal() %>
ИНН: <%=selectedFarmerObject.getITN() %><br/>
КПП: <%=selectedFarmerObject.getIEC() %><br/>
ОГРН: <%=selectedFarmerObject.getPSRN()%><br/>
Район регистрации: <%=selectedFarmerObject.getArea_registration()%><br/>
Посевные поля: <%=selectedFarmerObject.getArea_fields()%><br/>
Дата регистрации: <%=selectedFarmerObject.getDate_registration()%><br/>
Архив: <%=selectedFarmerObject.getArchive() == 1 ? "Нет" : "Да"%>
<br/>
<%}%>