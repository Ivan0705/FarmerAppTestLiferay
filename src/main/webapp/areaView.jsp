
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%request.setCharacterEncoding("UTF-8");%>
<portlet:defineObjects/>
<portlet:renderURL var="addArea">
    <portlet:param name="mvcPath" value="/add_area.jsp"/>
</portlet:renderURL>
<a href="<%=addArea.toString()%>">
Добавить район
</a>

