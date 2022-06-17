package com.meera.dbservice.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.meera.dbservice.model.Field;
import com.meera.dbservice.service.FieldLocalServiceUtil;

/**
 * @author LiferayFarmer
 * @generated
 */
public abstract class FieldActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public FieldActionableDynamicQuery() throws SystemException {
        setBaseLocalService(FieldLocalServiceUtil.getService());
        setClass(Field.class);

        setClassLoader(com.meera.dbservice.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("fieldId");
    }
}
