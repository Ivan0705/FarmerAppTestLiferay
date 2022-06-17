package com.meera.dbservice.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.meera.dbservice.model.Area;
import com.meera.dbservice.service.AreaLocalServiceUtil;

/**
 * @author LiferayFarmer
 * @generated
 */
public abstract class AreaActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AreaActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AreaLocalServiceUtil.getService());
        setClass(Area.class);

        setClassLoader(com.meera.dbservice.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("areaId");
    }
}
