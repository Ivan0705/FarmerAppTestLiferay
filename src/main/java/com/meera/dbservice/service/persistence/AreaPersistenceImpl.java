package com.meera.dbservice.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.meera.dbservice.NoSuchAreaException;
import com.meera.dbservice.model.Area;
import com.meera.dbservice.model.impl.AreaImpl;
import com.meera.dbservice.model.impl.AreaModelImpl;
import com.meera.dbservice.service.persistence.AreaPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the area service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LiferayFarmer
 * @see AreaPersistence
 * @see AreaUtil
 * @generated
 */
public class AreaPersistenceImpl extends BasePersistenceImpl<Area>
    implements AreaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link AreaUtil} to access the area persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = AreaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_AREAID = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByareaId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AREAID =
        new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByareaId",
            new String[] { Long.class.getName() },
            AreaModelImpl.AREAID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_AREAID = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByareaId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_AREAID_AREAID_2 = "area.areaId = ?";
    private static final String _SQL_SELECT_AREA = "SELECT area FROM Area area";
    private static final String _SQL_SELECT_AREA_WHERE = "SELECT area FROM Area area WHERE ";
    private static final String _SQL_COUNT_AREA = "SELECT COUNT(area) FROM Area area";
    private static final String _SQL_COUNT_AREA_WHERE = "SELECT COUNT(area) FROM Area area WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "area.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Area exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Area exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(AreaPersistenceImpl.class);
    private static Area _nullArea = new AreaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Area> toCacheModel() {
                return _nullAreaCacheModel;
            }
        };

    private static CacheModel<Area> _nullAreaCacheModel = new CacheModel<Area>() {
            @Override
            public Area toEntityModel() {
                return _nullArea;
            }
        };

    public AreaPersistenceImpl() {
        setModelClass(Area.class);
    }

    /**
     * Returns all the areas where areaId = &#63;.
     *
     * @param areaId the area ID
     * @return the matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findByareaId(long areaId) throws SystemException {
        return findByareaId(areaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Area> findByareaId(long areaId, int start, int end)
        throws SystemException {
        return findByareaId(areaId, start, end, null);
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
    @Override
    public List<Area> findByareaId(long areaId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AREAID;
            finderArgs = new Object[] { areaId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_AREAID;
            finderArgs = new Object[] { areaId, start, end, orderByComparator };
        }

        List<Area> list = (List<Area>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Area area : list) {
                if ((areaId != area.getAreaId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_AREA_WHERE);

            query.append(_FINDER_COLUMN_AREAID_AREAID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AreaModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(areaId);

                if (!pagination) {
                    list = (List<Area>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Area>(list);
                } else {
                    list = (List<Area>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Area findByareaId_First(long areaId,
        OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = fetchByareaId_First(areaId, orderByComparator);

        if (area != null) {
            return area;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("areaId=");
        msg.append(areaId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaException(msg.toString());
    }

    /**
     * Returns the first area in the ordered set where areaId = &#63;.
     *
     * @param areaId the area ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area, or <code>null</code> if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchByareaId_First(long areaId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Area> list = findByareaId(areaId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Area findByareaId_Last(long areaId,
        OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = fetchByareaId_Last(areaId, orderByComparator);

        if (area != null) {
            return area;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("areaId=");
        msg.append(areaId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaException(msg.toString());
    }

    /**
     * Returns the last area in the ordered set where areaId = &#63;.
     *
     * @param areaId the area ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area, or <code>null</code> if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchByareaId_Last(long areaId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByareaId(areaId);

        if (count == 0) {
            return null;
        }

        List<Area> list = findByareaId(areaId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Removes all the areas where areaId = &#63; from the database.
     *
     * @param areaId the area ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByareaId(long areaId) throws SystemException {
        for (Area area : findByareaId(areaId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(area);
        }
    }

    /**
     * Returns the number of areas where areaId = &#63;.
     *
     * @param areaId the area ID
     * @return the number of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByareaId(long areaId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_AREAID;

        Object[] finderArgs = new Object[] { areaId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_AREA_WHERE);

            query.append(_FINDER_COLUMN_AREAID_AREAID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(areaId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the area in the entity cache if it is enabled.
     *
     * @param area the area
     */
    @Override
    public void cacheResult(Area area) {
        EntityCacheUtil.putResult(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaImpl.class, area.getPrimaryKey(), area);

        area.resetOriginalValues();
    }

    /**
     * Caches the areas in the entity cache if it is enabled.
     *
     * @param areas the areas
     */
    @Override
    public void cacheResult(List<Area> areas) {
        for (Area area : areas) {
            if (EntityCacheUtil.getResult(AreaModelImpl.ENTITY_CACHE_ENABLED,
                        AreaImpl.class, area.getPrimaryKey()) == null) {
                cacheResult(area);
            } else {
                area.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all areas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(AreaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(AreaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the area.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Area area) {
        EntityCacheUtil.removeResult(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaImpl.class, area.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Area> areas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Area area : areas) {
            EntityCacheUtil.removeResult(AreaModelImpl.ENTITY_CACHE_ENABLED,
                AreaImpl.class, area.getPrimaryKey());
        }
    }

    /**
     * Creates a new area with the primary key. Does not add the area to the database.
     *
     * @param areaId the primary key for the new area
     * @return the new area
     */
    @Override
    public Area create(long areaId) {
        Area area = new AreaImpl();

        area.setNew(true);
        area.setPrimaryKey(areaId);

        return area;
    }

    /**
     * Removes the area with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param areaId the primary key of the area
     * @return the area that was removed
     * @throws com.meera.dbservice.NoSuchAreaException if a area with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area remove(long areaId) throws NoSuchAreaException, SystemException {
        return remove((Serializable) areaId);
    }

    /**
     * Removes the area with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the area
     * @return the area that was removed
     * @throws com.meera.dbservice.NoSuchAreaException if a area with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area remove(Serializable primaryKey)
        throws NoSuchAreaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Area area = (Area) session.get(AreaImpl.class, primaryKey);

            if (area == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchAreaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(area);
        } catch (NoSuchAreaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Area removeImpl(Area area) throws SystemException {
        area = toUnwrappedModel(area);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(area)) {
                area = (Area) session.get(AreaImpl.class,
                        area.getPrimaryKeyObj());
            }

            if (area != null) {
                session.delete(area);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (area != null) {
            clearCache(area);
        }

        return area;
    }

    @Override
    public Area updateImpl(com.meera.dbservice.model.Area area)
        throws SystemException {
        area = toUnwrappedModel(area);

        boolean isNew = area.isNew();

        AreaModelImpl areaModelImpl = (AreaModelImpl) area;

        Session session = null;

        try {
            session = openSession();

            if (area.isNew()) {
                session.save(area);

                area.setNew(false);
            } else {
                session.merge(area);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !AreaModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((areaModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AREAID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { areaModelImpl.getOriginalAreaId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AREAID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AREAID,
                    args);

                args = new Object[] { areaModelImpl.getAreaId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AREAID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AREAID,
                    args);
            }
        }

        EntityCacheUtil.putResult(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaImpl.class, area.getPrimaryKey(), area);

        return area;
    }

    protected Area toUnwrappedModel(Area area) {
        if (area instanceof AreaImpl) {
            return area;
        }

        AreaImpl areaImpl = new AreaImpl();

        areaImpl.setNew(area.isNew());
        areaImpl.setPrimaryKey(area.getPrimaryKey());

        areaImpl.setAreaId(area.getAreaId());
        areaImpl.setAreaName(area.getAreaName());
        areaImpl.setArchive(area.getArchive());

        return areaImpl;
    }

    /**
     * Returns the area with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the area
     * @return the area
     * @throws com.meera.dbservice.NoSuchAreaException if a area with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area findByPrimaryKey(Serializable primaryKey)
        throws NoSuchAreaException, SystemException {
        Area area = fetchByPrimaryKey(primaryKey);

        if (area == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchAreaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return area;
    }

    /**
     * Returns the area with the primary key or throws a {@link com.meera.dbservice.NoSuchAreaException} if it could not be found.
     *
     * @param areaId the primary key of the area
     * @return the area
     * @throws com.meera.dbservice.NoSuchAreaException if a area with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area findByPrimaryKey(long areaId)
        throws NoSuchAreaException, SystemException {
        return findByPrimaryKey((Serializable) areaId);
    }

    /**
     * Returns the area with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the area
     * @return the area, or <code>null</code> if a area with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Area area = (Area) EntityCacheUtil.getResult(AreaModelImpl.ENTITY_CACHE_ENABLED,
                AreaImpl.class, primaryKey);

        if (area == _nullArea) {
            return null;
        }

        if (area == null) {
            Session session = null;

            try {
                session = openSession();

                area = (Area) session.get(AreaImpl.class, primaryKey);

                if (area != null) {
                    cacheResult(area);
                } else {
                    EntityCacheUtil.putResult(AreaModelImpl.ENTITY_CACHE_ENABLED,
                        AreaImpl.class, primaryKey, _nullArea);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(AreaModelImpl.ENTITY_CACHE_ENABLED,
                    AreaImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return area;
    }

    /**
     * Returns the area with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param areaId the primary key of the area
     * @return the area, or <code>null</code> if a area with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchByPrimaryKey(long areaId) throws SystemException {
        return fetchByPrimaryKey((Serializable) areaId);
    }

    /**
     * Returns all the areas.
     *
     * @return the areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Area> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Area> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Area> list = (List<Area>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_AREA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_AREA;

                if (pagination) {
                    sql = sql.concat(AreaModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Area>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Area>(list);
                } else {
                    list = (List<Area>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the areas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Area area : findAll()) {
            remove(area);
        }
    }

    /**
     * Returns the number of areas.
     *
     * @return the number of areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_AREA);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the area persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.meera.dbservice.model.Area")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Area>> listenersList = new ArrayList<ModelListener<Area>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Area>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(AreaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
