package com.meera.dbservice.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.meera.dbservice.model.Area;

/**
 * The persistence interface for the area service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LiferayFarmer
 * @see AreaPersistenceImpl
 * @see AreaUtil
 * @generated
 */
public interface AreaPersistence extends BasePersistence<Area> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link AreaUtil} to access the area persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the areas where areaId = &#63;.
    *
    * @param areaId the area ID
    * @return the matching areas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.meera.dbservice.model.Area> findByareaId(
        long areaId) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.meera.dbservice.model.Area> findByareaId(
        long areaId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.meera.dbservice.model.Area> findByareaId(
        long areaId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first area in the ordered set where areaId = &#63;.
    *
    * @param areaId the area ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area
    * @throws com.meera.dbservice.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meera.dbservice.model.Area findByareaId_First(long areaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meera.dbservice.NoSuchAreaException;

    /**
    * Returns the first area in the ordered set where areaId = &#63;.
    *
    * @param areaId the area ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meera.dbservice.model.Area fetchByareaId_First(long areaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last area in the ordered set where areaId = &#63;.
    *
    * @param areaId the area ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area
    * @throws com.meera.dbservice.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meera.dbservice.model.Area findByareaId_Last(long areaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meera.dbservice.NoSuchAreaException;

    /**
    * Returns the last area in the ordered set where areaId = &#63;.
    *
    * @param areaId the area ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meera.dbservice.model.Area fetchByareaId_Last(long areaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the areas where areaId = &#63; from the database.
    *
    * @param areaId the area ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByareaId(long areaId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of areas where areaId = &#63;.
    *
    * @param areaId the area ID
    * @return the number of matching areas
    * @throws SystemException if a system exception occurred
    */
    public int countByareaId(long areaId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the area in the entity cache if it is enabled.
    *
    * @param area the area
    */
    public void cacheResult(com.meera.dbservice.model.Area area);

    /**
    * Caches the areas in the entity cache if it is enabled.
    *
    * @param areas the areas
    */
    public void cacheResult(
        java.util.List<com.meera.dbservice.model.Area> areas);

    /**
    * Creates a new area with the primary key. Does not add the area to the database.
    *
    * @param areaId the primary key for the new area
    * @return the new area
    */
    public com.meera.dbservice.model.Area create(long areaId);

    /**
    * Removes the area with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param areaId the primary key of the area
    * @return the area that was removed
    * @throws com.meera.dbservice.NoSuchAreaException if a area with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meera.dbservice.model.Area remove(long areaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meera.dbservice.NoSuchAreaException;

    public com.meera.dbservice.model.Area updateImpl(
        com.meera.dbservice.model.Area area)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the area with the primary key or throws a {@link com.meera.dbservice.NoSuchAreaException} if it could not be found.
    *
    * @param areaId the primary key of the area
    * @return the area
    * @throws com.meera.dbservice.NoSuchAreaException if a area with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meera.dbservice.model.Area findByPrimaryKey(long areaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meera.dbservice.NoSuchAreaException;

    /**
    * Returns the area with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param areaId the primary key of the area
    * @return the area, or <code>null</code> if a area with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meera.dbservice.model.Area fetchByPrimaryKey(long areaId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the areas.
    *
    * @return the areas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.meera.dbservice.model.Area> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.meera.dbservice.model.Area> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.meera.dbservice.model.Area> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the areas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of areas.
    *
    * @return the number of areas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
