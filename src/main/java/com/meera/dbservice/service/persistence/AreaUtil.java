package com.meera.dbservice.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.meera.dbservice.model.Area;

import java.util.List;

/**
 * The persistence utility for the area service. This utility wraps {@link AreaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LiferayFarmer
 * @see AreaPersistence
 * @see AreaPersistenceImpl
 * @generated
 */
public class AreaUtil {
    private static AreaPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Area area) {
        getPersistence().clearCache(area);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Area> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Area> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Area> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Area update(Area area) throws SystemException {
        return getPersistence().update(area);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Area update(Area area, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(area, serviceContext);
    }

    /**
    * Returns all the areas where areaId = &#63;.
    *
    * @param areaId the area ID
    * @return the matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.meera.dbservice.model.Area> findByareaId(
        long areaId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByareaId(areaId);
    }

    /**
    * Returns a range of all the areas where areaId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.dbservice.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param areaId the area ID
    * @param start the lower bound of the range of areas
    * @param end the upper bound of the range of areas (not inclusive)
    * @return the range of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.meera.dbservice.model.Area> findByareaId(
        long areaId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByareaId(areaId, start, end);
    }

    /**
    * Returns an ordered range of all the areas where areaId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.dbservice.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param areaId the area ID
    * @param start the lower bound of the range of areas
    * @param end the upper bound of the range of areas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.meera.dbservice.model.Area> findByareaId(
        long areaId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByareaId(areaId, start, end, orderByComparator);
    }

    /**
    * Returns the first area in the ordered set where areaId = &#63;.
    *
    * @param areaId the area ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area
    * @throws com.meera.dbservice.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.meera.dbservice.model.Area findByareaId_First(
        long areaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meera.dbservice.NoSuchAreaException {
        return getPersistence().findByareaId_First(areaId, orderByComparator);
    }

    /**
    * Returns the first area in the ordered set where areaId = &#63;.
    *
    * @param areaId the area ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.meera.dbservice.model.Area fetchByareaId_First(
        long areaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByareaId_First(areaId, orderByComparator);
    }

    /**
    * Returns the last area in the ordered set where areaId = &#63;.
    *
    * @param areaId the area ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area
    * @throws com.meera.dbservice.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.meera.dbservice.model.Area findByareaId_Last(
        long areaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meera.dbservice.NoSuchAreaException {
        return getPersistence().findByareaId_Last(areaId, orderByComparator);
    }

    /**
    * Returns the last area in the ordered set where areaId = &#63;.
    *
    * @param areaId the area ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.meera.dbservice.model.Area fetchByareaId_Last(
        long areaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByareaId_Last(areaId, orderByComparator);
    }

    /**
    * Removes all the areas where areaId = &#63; from the database.
    *
    * @param areaId the area ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByareaId(long areaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByareaId(areaId);
    }

    /**
    * Returns the number of areas where areaId = &#63;.
    *
    * @param areaId the area ID
    * @return the number of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static int countByareaId(long areaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByareaId(areaId);
    }

    /**
    * Caches the area in the entity cache if it is enabled.
    *
    * @param area the area
    */
    public static void cacheResult(com.meera.dbservice.model.Area area) {
        getPersistence().cacheResult(area);
    }

    /**
    * Caches the areas in the entity cache if it is enabled.
    *
    * @param areas the areas
    */
    public static void cacheResult(
        java.util.List<com.meera.dbservice.model.Area> areas) {
        getPersistence().cacheResult(areas);
    }

    /**
    * Creates a new area with the primary key. Does not add the area to the database.
    *
    * @param areaId the primary key for the new area
    * @return the new area
    */
    public static com.meera.dbservice.model.Area create(long areaId) {
        return getPersistence().create(areaId);
    }

    /**
    * Removes the area with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param areaId the primary key of the area
    * @return the area that was removed
    * @throws com.meera.dbservice.NoSuchAreaException if a area with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.meera.dbservice.model.Area remove(long areaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meera.dbservice.NoSuchAreaException {
        return getPersistence().remove(areaId);
    }

    public static com.meera.dbservice.model.Area updateImpl(
        com.meera.dbservice.model.Area area)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(area);
    }

    /**
    * Returns the area with the primary key or throws a {@link com.meera.dbservice.NoSuchAreaException} if it could not be found.
    *
    * @param areaId the primary key of the area
    * @return the area
    * @throws com.meera.dbservice.NoSuchAreaException if a area with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.meera.dbservice.model.Area findByPrimaryKey(long areaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meera.dbservice.NoSuchAreaException {
        return getPersistence().findByPrimaryKey(areaId);
    }

    /**
    * Returns the area with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param areaId the primary key of the area
    * @return the area, or <code>null</code> if a area with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.meera.dbservice.model.Area fetchByPrimaryKey(long areaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(areaId);
    }

    /**
    * Returns all the areas.
    *
    * @return the areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.meera.dbservice.model.Area> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the areas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.dbservice.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of areas
    * @param end the upper bound of the range of areas (not inclusive)
    * @return the range of areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.meera.dbservice.model.Area> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the areas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.dbservice.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of areas
    * @param end the upper bound of the range of areas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.meera.dbservice.model.Area> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the areas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of areas.
    *
    * @return the number of areas
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static AreaPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (AreaPersistence) PortletBeanLocatorUtil.locate(com.meera.dbservice.service.ClpSerializer.getServletContextName(),
                    AreaPersistence.class.getName());

            ReferenceRegistry.registerReference(AreaUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(AreaPersistence persistence) {
    }
}
