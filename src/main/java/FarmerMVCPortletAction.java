import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.meera.dbservice.model.Farmer;
import com.meera.dbservice.model.impl.FarmerImpl;
import com.meera.dbservice.service.FarmerLocalServiceUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import java.io.IOException;

public class FarmerMVCPortletAction extends MVCPortlet {
    public void addFarmer(ActionRequest actionRequest,
                          ActionResponse actionResponse) throws IOException, PortletException {
        try {
            String name = ParamUtil.getString(actionRequest, "name");
            String organizationLegal = ParamUtil.getString(actionRequest, "organization_legal");
            long ITN = ParamUtil.getLong(actionRequest, "ITN");
            long IEC = ParamUtil.getLong(actionRequest, "IEC");
            long PSRN = ParamUtil.getLong(actionRequest, "PSRN");
            String areaRegistration = ParamUtil.getString(actionRequest, "area_registration");
            String areaFields = ParamUtil.getString(actionRequest, "area_fields");
            String dateRegistration = ParamUtil.getString(actionRequest, "date_registration");

            int archive = ParamUtil.getInteger(actionRequest, "archive", 1);
            long farmerId = CounterLocalServiceUtil.increment();

            Farmer farmer = null;
            farmer = new FarmerImpl();
            farmer = FarmerLocalServiceUtil.createFarmer(farmerId);

            farmer.setName(name);
            farmer.setOrganization_legal(organizationLegal);
            farmer.setITN(ITN);
            farmer.setIEC(IEC);
            farmer.setPSRN(PSRN);
            farmer.setArea_registration(areaRegistration);
            farmer.setArea_fields(areaFields);
            farmer.setDate_registration(dateRegistration);
            farmer.setArchive(archive);

            farmer = FarmerLocalServiceUtil.addFarmer(farmer);

            if (farmer != null) {

                SessionMessages.add(actionRequest.getPortletSession(),
                        "farmer-add-success");
                _log.info("Farmer have been added successfylly");
            } else {
                SessionErrors.add(actionRequest.getPortletSession(),
                        "farmer-add-error");
                _log.error("There is an Erron in adding Farmer");
            }

            actionResponse.setRenderParameter("mvcPath",
                    "/add_farmer.jsp");
        } catch (Exception e) {
            SessionErrors.add(actionRequest.getPortletSession(),
                    "farmer-add-error");
            e.printStackTrace();
        }
    }

    public void updateFarmer(ActionRequest actionRequest,
                             ActionResponse actionResponse) {
        try {
            long farmerId = ParamUtil.getLong(actionRequest, "farmerId");
            String name = ParamUtil.getString(actionRequest, "name");
            String organizationLegal = ParamUtil.getString(actionRequest, "organization_legal");
            long ITN = ParamUtil.getLong(actionRequest, "ITN");
            long IEC = ParamUtil.getLong(actionRequest, "IEC");
            long PSRN = ParamUtil.getLong(actionRequest, "PSRN");
            String areaRegistration = ParamUtil.getString(actionRequest, "area_registration");
            String areaFields = ParamUtil.getString(actionRequest, "area_fields");
            String dateRegistration = ParamUtil.getString(actionRequest, "date_registration");

            int archive = ParamUtil.getInteger(actionRequest, "archive", 1);
            Farmer farmer = FarmerLocalServiceUtil.getFarmer(farmerId);
            if (farmer != null) {

                farmer.setName(name);
                farmer.setOrganization_legal(organizationLegal);
                farmer.setITN(ITN);
                farmer.setIEC(IEC);
                farmer.setPSRN(PSRN);
                farmer.setArea_registration(areaRegistration);
                farmer.setArea_fields(areaFields);
                farmer.setDate_registration(dateRegistration);
                farmer.setArchive(archive);
                farmer = FarmerLocalServiceUtil.updateFarmer(farmer);
                if (farmer != null) {

                    SessionMessages.add(actionRequest.getPortletSession(),
                            "farmer-update-success");
                    _log.info("Farmer have been updated successfully");
                } else {
                    SessionErrors.add(actionRequest.getPortletSession(),
                            "farmer-update-error");
                    _log.error("There is an Erron in delete Farmer");
                }
            } else {
                SessionErrors.add(actionRequest.getPortletSession(),
                        "farmer-update-error");
                _log.error("Could not find farmer.");
            }
            actionResponse.setRenderParameter("mvcPath",
                    "/update_farmer.jsp");
        } catch (Exception e) {
            SessionErrors.add(actionRequest.getPortletSession(),
                    "farmer-update-error");
            e.printStackTrace();
        }
    }

    public void getFarmer(ActionRequest actionRequest,
                            ActionResponse actionResponse) throws IOException, PortletException {
        try {
            long farmerId = ParamUtil.getLong(actionRequest, "farmerId");
            String cmd = ParamUtil.getString(actionRequest, "cmd");
            Farmer farmer = FarmerLocalServiceUtil.getFarmer(farmerId);
            if (farmer != null) {
                actionRequest.setAttribute("farmerObject", farmer);
                _log.info("Farmer have been found for specific primary key successfylly");
            } else {
                _log.error("Farmer not found");
            }
            if (cmd.equals("UPDATE")) {
                actionResponse.setRenderParameter("mvcPath",
                        "/update_farmer.jsp");
            }
            if (cmd.equals("VIEW")) {
                actionResponse.setRenderParameter("mvcPath",
                        "/display.jsp");
            }

        } catch (Exception e) {
            SessionErrors.add(actionRequest.getPortletSession(),
                    "farmer-add-error");
            e.printStackTrace();
        }
    }

    private static Log _log = LogFactoryUtil
            .getLog(FarmerMVCPortletAction.class);
}

