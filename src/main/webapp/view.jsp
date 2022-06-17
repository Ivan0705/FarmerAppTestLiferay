<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.meera.dbservice.model.Farmer" %>
<%@ page import="com.meera.dbservice.service.FarmerLocalServiceUtil" %><%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%request.setCharacterEncoding("UTF-8");%>
<%@ include file="/init.jsp"%>
<portlet:defineObjects/>
<script src="https://cdn.alloyui.com/3.0.1/aui/aui-min.js"></script>
<link href="https://cdn.alloyui.com/3.0.1/aui-css/css/bootstrap.min.css" rel="stylesheet"/>
<h1>Farmer</h1>
<portlet:renderURL var="addFarmer">
    <portlet:param name="mvcPath" value="/add_farmer.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="updateFarmer">
    <portlet:param name="mvcPath" value="/update_farmer.jsp"/>
</portlet:renderURL>

<a href="<%=addFarmer.toString()%>">Добавить запись фермера</a><br/>
<a href="<%=updateFarmer.toString()%>">Обновить запись фермера</a><br/>

<liferay-portlet:renderURL varImpl="iteratorURL">
</liferay-portlet:renderURL>
<div class="separator"></div>
<liferay-ui:search-container emptyResultsMessage="there-are-no-students"
                             headerNames="Название,Юр.статус,ИНН,КПП,ОГРН,Место регистрации, Поля для посева,Дата для посева, Статус архива"
                             iteratorURL="<%=iteratorURL %>"
                             delta="5"
                             deltaConfigurable="true"
>
    <liferay-ui:search-container-results>
        <%
            total = FarmerLocalServiceUtil.getFarmersCount();
            results=FarmerLocalServiceUtil.getFarmers(searchContainer.getStart(), searchContainer.getEnd());
            searchContainer.setTotal(total);
            searchContainer.setResults(results);
        %>
    </liferay-ui:search-container-results>
    <liferay-ui:search-container-row className="com.meera.dbservice.model.Farmer"
                                     keyProperty="farmerId" modelVar="currentFarmer">
        <liferay-portlet:renderURL varImpl="rowURL">
            <portlet:param name="backURL" value="<%= currentURL%>" />
            <portlet:param name="mvcPath" value="/display.jsp" />
            <portlet:param name="farmerId"
                           value="<%= String.valueOf(currentFarmer.getFarmerId()) %>" />
        </liferay-portlet:renderURL>
        <liferay-ui:search-container-row-parameter
                name="rowURL"
                value="<%= rowURL.toString() %>"/>
        <liferay-ui:search-container-column-text href="<%= rowURL %>"
                                                 name="name" property="name" />

        <liferay-ui:search-container-column-text href="<%= rowURL %>"
                                                 name="organization_legal" property="organization_legal" />

        <liferay-ui:search-container-column-text href="<%= rowURL %>"
                                                 name="ITN" property="ITN" />
        <liferay-ui:search-container-column-text href="<%= rowURL %>"
                                                 name="IEC" property="IEC" />

        <liferay-ui:search-container-column-text href="<%= rowURL %>"
                                                 name="PSRN" property="PSRN" />
        <liferay-ui:search-container-column-text href="<%= rowURL %>"
                                                 name="IEC" property="IEC" />
        <liferay-ui:search-container-column-text href="<%= rowURL %>"
                                                 name="area_registration" property="area_registration" />

        <liferay-ui:search-container-column-text href="<%= rowURL %>"
                                                 name="area_fields" property="area_fields" />
        <liferay-ui:search-container-column-text href="<%= rowURL %>"
                                                 name="date_registration" property="date_registration" />
        <liferay-ui:search-container-column-text href="<%= rowURL %>"
                                                 name="archive"
                                                 value='<%=currentFarmer.getArchive()==1?"Не в архиве":"в архиве"%>' />

    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator searchContainer="<%=searchContainer %>" />
</liferay-ui:search-container>