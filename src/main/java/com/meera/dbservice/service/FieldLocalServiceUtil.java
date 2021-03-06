package com.meera.dbservice.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Field. This utility wraps
 * {@link com.meera.dbservice.service.impl.FieldLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LiferayFarmer
 * @see FieldLocalService
 * @see com.meera.dbservice.service.base.FieldLocalServiceBaseImpl
 * @see com.meera.dbservice.service.impl.FieldLocalServiceImpl
 * @generated
 */
public class FieldLocalServiceUtil {
    private static FieldLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.meera.dbservice.service.impl.FieldLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the field to the database. Also notifies the appropriate model listeners.
    *
    * @param field the field
    * @return the field that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.meera.dbservice.model.Field addField(
        com.meera.dbservice.model.Field field)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addField(field);
    }

    /**
    * Creates a new field with the primary key. Does not add the field to the database.
    *
    * @param fieldId the primary key for the new field
    * @return the new field
    */
    public static com.meera.dbservice.model.Field createField(long fieldId) {
        return getService().createField(fieldId);
    }

    /**
    * Deletes the field with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param fieldId the primary key of the field
    * @return the field that was removed
    * @throws PortalException if a field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.meera.dbservice.model.Field deleteField(long fieldId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteField(fieldId);
    }

    /**
    * Deletes the field from the database. Also notifies the appropriate model listeners.
    *
    * @param field the field
    * @return the field that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.meera.dbservice.model.Field deleteField(
        com.meera.dbservice.model.Field field)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteField(field);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.dbservice.model.impl.FieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.dbservice.model.impl.FieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.meera.dbservice.model.Field fetchField(long fieldId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchField(fieldId);
    }

    /**
    * Returns the field with the primary key.
    *
    * @param fieldId the primary key of the field
    * @return the field
    * @throws PortalException if a field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.meera.dbservice.model.Field getField(long fieldId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getField(fieldId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the fields.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.dbservice.model.impl.FieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of fields
    * @param end the upper bound of the range of fields (not inclusive)
    * @return the range of fields
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.meera.dbservice.model.Field> getFields(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFields(start, end);
    }

    /**
    * Returns the number of fields.
    *
    * @return the number of fields
    * @throws SystemException if a system exception occurred
    */
    public static int getFieldsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFieldsCount();
    }

    /**
    * Updates the field in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param field the field
    * @return the field that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.meera.dbservice.model.Field updateField(
        com.meera.dbservice.model.Field field)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateField(field);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static FieldLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    FieldLocalService.class.getName());

            if (invokableLocalService instanceof FieldLocalService) {
                _service = (FieldLocalService) invokableLocalService;
            } else {
                _service = new FieldLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(FieldLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(FieldLocalService service) {
    }
}
