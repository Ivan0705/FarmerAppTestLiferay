package com.meera.dbservice.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.meera.dbservice.model.Field;

/**
 * The persistence interface for the field service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LiferayFarmer
 * @see FieldPersistenceImpl
 * @see FieldUtil
 * @generated
 */
public interface FieldPersistence extends BasePersistence<Field> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link FieldUtil} to access the field persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the fields where fieldId = &#63;.
    *
    * @param fieldId the field ID
    * @return the matching fields
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.meera.dbservice.model.Field> findByfieldId(
        long fieldId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the fields where fieldId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.dbservice.model.impl.FieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param fieldId the field ID
    * @param start the lower bound of the range of fields
    * @param end the upper bound of the range of fields (not inclusive)
    * @return the range of matching fields
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.meera.dbservice.model.Field> findByfieldId(
        long fieldId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the fields where fieldId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.dbservice.model.impl.FieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param fieldId the field ID
    * @param start the lower bound of the range of fields
    * @param end the upper bound of the range of fields (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching fields
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.meera.dbservice.model.Field> findByfieldId(
        long fieldId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first field in the ordered set where fieldId = &#63;.
    *
    * @param fieldId the field ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching field
    * @throws com.meera.dbservice.NoSuchFieldException if a matching field could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meera.dbservice.model.Field findByfieldId_First(long fieldId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meera.dbservice.NoSuchFieldException;

    /**
    * Returns the first field in the ordered set where fieldId = &#63;.
    *
    * @param fieldId the field ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching field, or <code>null</code> if a matching field could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meera.dbservice.model.Field fetchByfieldId_First(long fieldId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last field in the ordered set where fieldId = &#63;.
    *
    * @param fieldId the field ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching field
    * @throws com.meera.dbservice.NoSuchFieldException if a matching field could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meera.dbservice.model.Field findByfieldId_Last(long fieldId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meera.dbservice.NoSuchFieldException;

    /**
    * Returns the last field in the ordered set where fieldId = &#63;.
    *
    * @param fieldId the field ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching field, or <code>null</code> if a matching field could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meera.dbservice.model.Field fetchByfieldId_Last(long fieldId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the fields where fieldId = &#63; from the database.
    *
    * @param fieldId the field ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByfieldId(long fieldId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of fields where fieldId = &#63;.
    *
    * @param fieldId the field ID
    * @return the number of matching fields
    * @throws SystemException if a system exception occurred
    */
    public int countByfieldId(long fieldId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the field in the entity cache if it is enabled.
    *
    * @param field the field
    */
    public void cacheResult(com.meera.dbservice.model.Field field);

    /**
    * Caches the fields in the entity cache if it is enabled.
    *
    * @param fields the fields
    */
    public void cacheResult(
        java.util.List<com.meera.dbservice.model.Field> fields);

    /**
    * Creates a new field with the primary key. Does not add the field to the database.
    *
    * @param fieldId the primary key for the new field
    * @return the new field
    */
    public com.meera.dbservice.model.Field create(long fieldId);

    /**
    * Removes the field with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param fieldId the primary key of the field
    * @return the field that was removed
    * @throws com.meera.dbservice.NoSuchFieldException if a field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meera.dbservice.model.Field remove(long fieldId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meera.dbservice.NoSuchFieldException;

    public com.meera.dbservice.model.Field updateImpl(
        com.meera.dbservice.model.Field field)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the field with the primary key or throws a {@link com.meera.dbservice.NoSuchFieldException} if it could not be found.
    *
    * @param fieldId the primary key of the field
    * @return the field
    * @throws com.meera.dbservice.NoSuchFieldException if a field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meera.dbservice.model.Field findByPrimaryKey(long fieldId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meera.dbservice.NoSuchFieldException;

    /**
    * Returns the field with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param fieldId the primary key of the field
    * @return the field, or <code>null</code> if a field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meera.dbservice.model.Field fetchByPrimaryKey(long fieldId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the fields.
    *
    * @return the fields
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.meera.dbservice.model.Field> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.meera.dbservice.model.Field> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the fields.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.dbservice.model.impl.FieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of fields
    * @param end the upper bound of the range of fields (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of fields
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.meera.dbservice.model.Field> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the fields from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of fields.
    *
    * @return the number of fields
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
