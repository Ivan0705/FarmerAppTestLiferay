<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@
        taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@
        taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@
        taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@
        taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@
        taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<portlet:defineObjects/>
<liferay-theme:defineObjects/>
<%
    String currentURL = PortalUtil.getCurrentURL(request);
    String name = ParamUtil.getString(request, "name");
    String organizationLegal = ParamUtil.getString(request, "organization_legal");
    long ITN = ParamUtil.getLong(request, "ITN");
    long IEC = ParamUtil.getLong(request, "IEC");
    long PSRN = ParamUtil.getLong(request, "PSRN");
    String areaRegistration = ParamUtil.getString(request, "area_registration");
    String areaFields = ParamUtil.getString(request, "area_fields");
    String dateRegistration = ParamUtil.getString(request, "date_registration");
    int archive = ParamUtil.getInteger(request, "archive");%>

