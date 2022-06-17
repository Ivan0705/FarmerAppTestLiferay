import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.meera.dbservice.model.Area;
import com.meera.dbservice.model.impl.AreaImpl;
import com.meera.dbservice.service.AreaLocalServiceUtil;


import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

public class AreaMVCPortletAction extends MVCPortlet {
    public void addArea(ActionRequest actionRequest,
                        ActionResponse actionResponse){
        try {
            String areaName = ParamUtil.getString(actionRequest, "areaName");
            int archive = ParamUtil.getInteger(actionRequest, "archive", 1);
            long areaId = CounterLocalServiceUtil.increment();

            Area area = null;
            area = new AreaImpl();
            area = AreaLocalServiceUtil.createArea(areaId);

            area.setAreaName(areaName);
            area.setArchive(archive);

            area = AreaLocalServiceUtil.addArea(area);

            if (area != null) {

                SessionMessages.add(actionRequest.getPortletSession(),
                        "area-add-success");
                _log.info("Area have been added successfully");
            } else {
                SessionErrors.add(actionRequest.getPortletSession(),
                        "area-add-error");
                _log.error("There is an Erron in adding Area");
            }

            actionResponse.setRenderParameter("mvcPath",
                    "/add_area.jsp");
        } catch (Exception e) {
            SessionErrors.add(actionRequest.getPortletSession(),
                    "area-add-error");
            e.printStackTrace();
        }

    }


    private static Log _log = LogFactoryUtil
            .getLog(FarmerMVCPortletAction.class);
}
