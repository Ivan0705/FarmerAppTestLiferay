package com.meera.dbservice.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.meera.dbservice.model.Area;
import com.meera.dbservice.model.AreaModel;
import com.meera.dbservice.model.AreaSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Area service. Represents a row in the &quot;LS_Area&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.meera.dbservice.model.AreaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AreaImpl}.
 * </p>
 *
 * @author LiferayFarmer
 * @see AreaImpl
 * @see com.meera.dbservice.model.Area
 * @see com.meera.dbservice.model.AreaModel
 * @generated
 */
@JSON(strict = true)
public class AreaModelImpl extends BaseModelImpl<Area> implements AreaModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a area model instance should use the {@link com.meera.dbservice.model.Area} interface instead.
     */
    public static final String TABLE_NAME = "LS_Area";
    public static final Object[][] TABLE_COLUMNS = {
            { "areaId", Types.BIGINT },
            { "areaName", Types.VARCHAR },
            { "archive", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table LS_Area (areaId LONG not null primary key,areaName VARCHAR(75) null,archive INTEGER)";
    public static final String TABLE_SQL_DROP = "drop table LS_Area";
    public static final String ORDER_BY_JPQL = " ORDER BY area.areaId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY LS_Area.areaId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.meera.dbservice.model.Area"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.meera.dbservice.model.Area"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.meera.dbservice.model.Area"),
            true);
    public static long AREAID_COLUMN_BITMASK = 1L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.meera.dbservice.model.Area"));
    private static ClassLoader _classLoader = Area.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { Area.class };
    private long _areaId;
    private long _originalAreaId;
    private boolean _setOriginalAreaId;
    private String _areaName;
    private int _archive;
    private long _columnBitmask;
    private Area _escapedModel;

    public AreaModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Area toModel(AreaSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Area model = new AreaImpl();

        model.setAreaId(soapModel.getAreaId());
        model.setAreaName(soapModel.getAreaName());
        model.setArchive(soapModel.getArchive());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Area> toModels(AreaSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Area> models = new ArrayList<Area>(soapModels.length);

        for (AreaSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _areaId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setAreaId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _areaId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Area.class;
    }

    @Override
    public String getModelClassName() {
        return Area.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("areaId", getAreaId());
        attributes.put("areaName", getAreaName());
        attributes.put("archive", getArchive());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long areaId = (Long) attributes.get("areaId");

        if (areaId != null) {
            setAreaId(areaId);
        }

        String areaName = (String) attributes.get("areaName");

        if (areaName != null) {
            setAreaName(areaName);
        }

        Integer archive = (Integer) attributes.get("archive");

        if (archive != null) {
            setArchive(archive);
        }
    }

    @JSON
    @Override
    public long getAreaId() {
        return _areaId;
    }

    @Override
    public void setAreaId(long areaId) {
        _columnBitmask = -1L;

        if (!_setOriginalAreaId) {
            _setOriginalAreaId = true;

            _originalAreaId = _areaId;
        }

        _areaId = areaId;
    }

    public long getOriginalAreaId() {
        return _originalAreaId;
    }

    @JSON
    @Override
    public String getAreaName() {
        if (_areaName == null) {
            return StringPool.BLANK;
        } else {
            return _areaName;
        }
    }

    @Override
    public void setAreaName(String areaName) {
        _areaName = areaName;
    }

    @JSON
    @Override
    public int getArchive() {
        return _archive;
    }

    @Override
    public void setArchive(int archive) {
        _archive = archive;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Area.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Area toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Area) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        AreaImpl areaImpl = new AreaImpl();

        areaImpl.setAreaId(getAreaId());
        areaImpl.setAreaName(getAreaName());
        areaImpl.setArchive(getArchive());

        areaImpl.resetOriginalValues();

        return areaImpl;
    }

    @Override
    public int compareTo(Area area) {
        int value = 0;

        if (getAreaId() < area.getAreaId()) {
            value = -1;
        } else if (getAreaId() > area.getAreaId()) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Area)) {
            return false;
        }

        Area area = (Area) obj;

        long primaryKey = area.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        AreaModelImpl areaModelImpl = this;

        areaModelImpl._originalAreaId = areaModelImpl._areaId;

        areaModelImpl._setOriginalAreaId = false;

        areaModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Area> toCacheModel() {
        AreaCacheModel areaCacheModel = new AreaCacheModel();

        areaCacheModel.areaId = getAreaId();

        areaCacheModel.areaName = getAreaName();

        String areaName = areaCacheModel.areaName;

        if ((areaName != null) && (areaName.length() == 0)) {
            areaCacheModel.areaName = null;
        }

        areaCacheModel.archive = getArchive();

        return areaCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{areaId=");
        sb.append(getAreaId());
        sb.append(", areaName=");
        sb.append(getAreaName());
        sb.append(", archive=");
        sb.append(getArchive());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.meera.dbservice.model.Area");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>areaId</column-name><column-value><![CDATA[");
        sb.append(getAreaId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>areaName</column-name><column-value><![CDATA[");
        sb.append(getAreaName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>archive</column-name><column-value><![CDATA[");
        sb.append(getArchive());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
