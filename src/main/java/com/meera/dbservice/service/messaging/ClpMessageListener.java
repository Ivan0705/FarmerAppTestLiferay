package com.meera.dbservice.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.meera.dbservice.service.AreaLocalServiceUtil;
import com.meera.dbservice.service.AreaServiceUtil;
import com.meera.dbservice.service.ClpSerializer;
import com.meera.dbservice.service.FarmerLocalServiceUtil;
import com.meera.dbservice.service.FarmerServiceUtil;
import com.meera.dbservice.service.FieldLocalServiceUtil;
import com.meera.dbservice.service.FieldServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            AreaLocalServiceUtil.clearService();

            AreaServiceUtil.clearService();
            FarmerLocalServiceUtil.clearService();

            FarmerServiceUtil.clearService();
            FieldLocalServiceUtil.clearService();

            FieldServiceUtil.clearService();
        }
    }
}
