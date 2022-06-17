<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@ page import="com.liferay.portal.kernel.dao.search.DisplayTerms" %>
<%@ include file="/init.jsp" %>
<%
    SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
    DisplayTerms displayTerms = searchContainer.getDisplayTerms();
%>
<liferay-ui:search-toggle
        buttonLabel="Farmer Search"
        displayTerms="<%= displayTerms %>"
        id="toggle_id_farmer_search">
    <aui:input label="Имя" name="name" value="<%=name %>" />
    <aui:input label="Юр.статус" name="organization_legal" value="<%=organizationLegal %>" />
    <aui:input label="ИНН" name="INT" value="<%=ITN %>" />
    <aui:input label="КПП" name="IEC" value="<%=IEC %>" />
    <aui:input label="ОГРН" name="PSNR" value="<%= PSRN %>" />
    <aui:input label="Место регистрации" name="area_registration" value="<%=areaRegistration %>" />
    <aui:input label="Поля для посева" name="area_fields" value="<%=areaFields %>" />
    <aui:input label="Дата регистрации" name="archive" value="<%=dateRegistration %>" />
    <aui:select name="archive">
        <aui:option label="Не добавлен в архив" value="1"></aui:option>
        <aui:option label="В архиве" value="0"></aui:option>
    </aui:select>
</liferay-ui:search-toggle>