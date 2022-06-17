package com.meera.dbservice.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.meera.dbservice.model.Field;
import com.meera.dbservice.service.FieldLocalService;
import com.meera.dbservice.service.persistence.AreaPersistence;
import com.meera.dbservice.service.persistence.FarmerPersistence;
import com.meera.dbservice.service.persistence.FieldPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the field local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.meera.dbservice.service.impl.FieldLocalServiceImpl}.
 * </p>
 *
 * @author LiferayFarmer
 * @see com.meera.dbservice.service.impl.FieldLocalServiceImpl
 * @see com.meera.dbservice.service.FieldLocalServiceUtil
 * @generated
 */
public abstract class FieldLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements FieldLocalService, IdentifiableBean {
    @BeanReference(type = com.meera.dbservice.service.AreaLocalService.class)
    protected com.meera.dbservice.service.AreaLocalService areaLocalService;
    @BeanReference(type = com.meera.dbservice.service.AreaService.class)
    protected com.meera.dbservice.service.AreaService areaService;
    @BeanReference(type = AreaPersistence.class)
    protected AreaPersistence areaPersistence;
    @BeanReference(type = com.meera.dbservice.service.FarmerLocalService.class)
    protected com.meera.dbservice.service.FarmerLocalService farmerLocalService;
    @BeanReference(type = com.meera.dbservice.service.FarmerService.class)
    protected com.meera.dbservice.service.FarmerService farmerService;
    @BeanReference(type = FarmerPersistence.class)
    protected FarmerPersistence farmerPersistence;
    @BeanReference(type = com.meera.dbservice.service.FieldLocalService.class)
    protected com.meera.dbservice.service.FieldLocalService fieldLocalService;
    @BeanReference(type = com.meera.dbservice.service.FieldService.class)
    protected com.meera.dbservice.service.FieldService fieldService;
    @BeanReference(type = FieldPersistence.class)
    protected FieldPersistence fieldPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private FieldLocalServiceClpInvoker _clpInvoker = new FieldLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.meera.dbservice.service.FieldLocalServiceUtil} to access the field local service.
     */

    /**
     * Adds the field to the database. Also notifies the appropriate model listeners.
     *
     * @param field the field
     * @return the field that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Field addField(Field field) throws SystemException {
        field.setNew(true);

        return fieldPersistence.update(field);
    }

    /**
     * Creates a new field with the primary key. Does not add the field to the database.
     *
     * @param fieldId the primary key for the new field
     * @return the new field
     */
    @Override
    public Field createField(long fieldId) {
        return fieldPersistence.create(fieldId);
    }

    /**
     * Deletes the field with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param fieldId the primary key of the field
     * @return the field that was removed
     * @throws PortalException if a field with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Field deleteField(long fieldId)
        throws PortalException, SystemException {
        return fieldPersistence.remove(fieldId);
    }

    /**
     * Deletes the field from the database. Also notifies the appropriate model listeners.
     *
     * @param field the field
     * @return the field that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Field deleteField(Field field) throws SystemException {
        return fieldPersistence.remove(field);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Field.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return fieldPersistence.findWithDynamicQuery(dynamicQuery);
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
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return fieldPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return fieldPersistence.findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return fieldPersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection the projection to apply to the query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return fieldPersistence.countWithDynamicQuery(dynamicQuery, projection);
    }

    @Override
    public Field fetchField(long fieldId) throws SystemException {
        return fieldPersistence.fetchByPrimaryKey(fieldId);
    }

    /**
     * Returns the field with the primary key.
     *
     * @param fieldId the primary key of the field
     * @return the field
     * @throws PortalException if a field with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Field getField(long fieldId) throws PortalException, SystemException {
        return fieldPersistence.findByPrimaryKey(fieldId);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return fieldPersistence.findByPrimaryKey(primaryKeyObj);
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
    @Override
    public List<Field> getFields(int start, int end) throws SystemException {
        return fieldPersistence.findAll(start, end);
    }

    /**
     * Returns the number of fields.
     *
     * @return the number of fields
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getFieldsCount() throws SystemException {
        return fieldPersistence.countAll();
    }

    /**
     * Updates the field in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param field the field
     * @return the field that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Field updateField(Field field) throws SystemException {
        return fieldPersistence.update(field);
    }

    /**
     * Returns the area local service.
     *
     * @return the area local service
     */
    public com.meera.dbservice.service.AreaLocalService getAreaLocalService() {
        return areaLocalService;
    }

    /**
     * Sets the area local service.
     *
     * @param areaLocalService the area local service
     */
    public void setAreaLocalService(
        com.meera.dbservice.service.AreaLocalService areaLocalService) {
        this.areaLocalService = areaLocalService;
    }

    /**
     * Returns the area remote service.
     *
     * @return the area remote service
     */
    public com.meera.dbservice.service.AreaService getAreaService() {
        return areaService;
    }

    /**
     * Sets the area remote service.
     *
     * @param areaService the area remote service
     */
    public void setAreaService(
        com.meera.dbservice.service.AreaService areaService) {
        this.areaService = areaService;
    }

    /**
     * Returns the area persistence.
     *
     * @return the area persistence
     */
    public AreaPersistence getAreaPersistence() {
        return areaPersistence;
    }

    /**
     * Sets the area persistence.
     *
     * @param areaPersistence the area persistence
     */
    public void setAreaPersistence(AreaPersistence areaPersistence) {
        this.areaPersistence = areaPersistence;
    }

    /**
     * Returns the farmer local service.
     *
     * @return the farmer local service
     */
    public com.meera.dbservice.service.FarmerLocalService getFarmerLocalService() {
        return farmerLocalService;
    }

    /**
     * Sets the farmer local service.
     *
     * @param farmerLocalService the farmer local service
     */
    public void setFarmerLocalService(
        com.meera.dbservice.service.FarmerLocalService farmerLocalService) {
        this.farmerLocalService = farmerLocalService;
    }

    /**
     * Returns the farmer remote service.
     *
     * @return the farmer remote service
     */
    public com.meera.dbservice.service.FarmerService getFarmerService() {
        return farmerService;
    }

    /**
     * Sets the farmer remote service.
     *
     * @param farmerService the farmer remote service
     */
    public void setFarmerService(
        com.meera.dbservice.service.FarmerService farmerService) {
        this.farmerService = farmerService;
    }

    /**
     * Returns the farmer persistence.
     *
     * @return the farmer persistence
     */
    public FarmerPersistence getFarmerPersistence() {
        return farmerPersistence;
    }

    /**
     * Sets the farmer persistence.
     *
     * @param farmerPersistence the farmer persistence
     */
    public void setFarmerPersistence(FarmerPersistence farmerPersistence) {
        this.farmerPersistence = farmerPersistence;
    }

    /**
     * Returns the field local service.
     *
     * @return the field local service
     */
    public com.meera.dbservice.service.FieldLocalService getFieldLocalService() {
        return fieldLocalService;
    }

    /**
     * Sets the field local service.
     *
     * @param fieldLocalService the field local service
     */
    public void setFieldLocalService(
        com.meera.dbservice.service.FieldLocalService fieldLocalService) {
        this.fieldLocalService = fieldLocalService;
    }

    /**
     * Returns the field remote service.
     *
     * @return the field remote service
     */
    public com.meera.dbservice.service.FieldService getFieldService() {
        return fieldService;
    }

    /**
     * Sets the field remote service.
     *
     * @param fieldService the field remote service
     */
    public void setFieldService(
        com.meera.dbservice.service.FieldService fieldService) {
        this.fieldService = fieldService;
    }

    /**
     * Returns the field persistence.
     *
     * @return the field persistence
     */
    public FieldPersistence getFieldPersistence() {
        return fieldPersistence;
    }

    /**
     * Sets the field persistence.
     *
     * @param fieldPersistence the field persistence
     */
    public void setFieldPersistence(FieldPersistence fieldPersistence) {
        this.fieldPersistence = fieldPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("com.meera.dbservice.model.Field",
            fieldLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.meera.dbservice.model.Field");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Field.class;
    }

    protected String getModelClassName() {
        return Field.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = fieldPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}