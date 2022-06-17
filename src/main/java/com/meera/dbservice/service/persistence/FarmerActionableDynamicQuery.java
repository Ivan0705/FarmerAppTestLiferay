package com.meera.dbservice.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.meera.dbservice.model.Farmer;
import com.meera.dbservice.service.FarmerLocalServiceUtil;

/**
 * @author LiferayFarmer
 * @generated
 */
public abstract class FarmerActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public FarmerActionableDynamicQuery() throws SystemException {
        setBaseLocalService(FarmerLocalServiceUtil.getService());
        setClass(Farmer.class);

        setClassLoader(com.meera.dbservice.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("farmerId");
    }
}
