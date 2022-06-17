<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<portlet:defineObjects/>
<portlet:renderURL var="homeURL">
    <portlet:param name="mvcPath" value="/areaView.jsp"/>
</portlet:renderURL>

<portlet:actionURL var="addAreaActionURL" windowState="normal"
                   name="addArea">
</portlet:actionURL>

<h2>Добавление записи района</h2>
<a href="<%=homeURL.toString() %>">Назад</a><br/><br/>

<aui:form name="areaForm" action="<%=addAreaActionURL%>" method="POST"></
    <aui:input type="text" name="areaName" label="Введите название района" title="areaName">
        <aui:validator name="required"/>
        <aui:validator name="alpha" errorMessage="Enter characters that exist in the alphabet next time, please."/>
    </aui:input>
    <b>Архив:</b><br/>
    <input type="radio" name="<portlet:namespace/>archive" value="1">Не добавлять в архив<br>
    <input type="radio" name="<portlet:namespace/>archive" value="0">Добавить в архив<br/>
    <aui:button-row><aui:button type="submit" name="addArea" value="Добавить"/></aui:button-row>
</aui:form>
