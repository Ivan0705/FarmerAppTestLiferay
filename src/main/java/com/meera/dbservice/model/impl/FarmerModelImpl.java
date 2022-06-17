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

import com.meera.dbservice.model.Farmer;
import com.meera.dbservice.model.FarmerModel;
import com.meera.dbservice.model.FarmerSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Farmer service. Represents a row in the &quot;LS_Farmer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.meera.dbservice.model.FarmerModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FarmerImpl}.
 * </p>
 *
 * @author LiferayFarmer
 * @see FarmerImpl
 * @see com.meera.dbservice.model.Farmer
 * @see com.meera.dbservice.model.FarmerModel
 * @generated
 */
@JSON(strict = true)
public class FarmerModelImpl extends BaseModelImpl<Farmer>
    implements FarmerModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a farmer model instance should use the {@link com.meera.dbservice.model.Farmer} interface instead.
     */
    public static final String TABLE_NAME = "LS_Farmer";
    public static final Object[][] TABLE_COLUMNS = {
            { "farmerId", Types.BIGINT },
            { "name", Types.VARCHAR },
            { "organization_legal", Types.VARCHAR },
            { "ITN", Types.BIGINT },
            { "IEC", Types.BIGINT },
            { "PSRN", Types.BIGINT },
            { "area_registration", Types.VARCHAR },
            { "area_fields", Types.VARCHAR },
            { "date_registration", Types.VARCHAR },
            { "archive", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table LS_Farmer (farmerId LONG not null primary key,name VARCHAR(75) null,organization_legal VARCHAR(75) null,ITN LONG,IEC LONG,PSRN LONG,area_registration VARCHAR(75) null,area_fields VARCHAR(75) null,date_registration VARCHAR(75) null,archive INTEGER)";
    public static final String TABLE_SQL_DROP = "drop table LS_Farmer";
    public static final String ORDER_BY_JPQL = " ORDER BY farmer.farmerId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY LS_Farmer.farmerId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.meera.dbservice.model.Farmer"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.meera.dbservice.model.Farmer"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.meera.dbservice.model.Farmer"),
            true);
    public static long FARMERID_COLUMN_BITMASK = 1L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.meera.dbservice.model.Farmer"));
    private static ClassLoader _classLoader = Farmer.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { Farmer.class };
    private long _farmerId;
    private long _originalFarmerId;
    private boolean _setOriginalFarmerId;
    private String _name;
    private String _organization_legal;
    private long _ITN;
    private long _IEC;
    private long _PSRN;
    private String _area_registration;
    private String _area_fields;
    private String _date_registration;
    private int _archive;
    private long _columnBitmask;
    private Farmer _escapedModel;

    public FarmerModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Farmer toModel(FarmerSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Farmer model = new FarmerImpl();

        model.setFarmerId(soapModel.getFarmerId());
        model.setName(soapModel.getName());
        model.setOrganization_legal(soapModel.getOrganization_legal());
        model.setITN(soapModel.getITN());
        model.setIEC(soapModel.getIEC());
        model.setPSRN(soapModel.getPSRN());
        model.setArea_registration(soapModel.getArea_registration());
        model.setArea_fields(soapModel.getArea_fields());
        model.setDate_registration(soapModel.getDate_registration());
        model.setArchive(soapModel.getArchive());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Farmer> toModels(FarmerSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Farmer> models = new ArrayList<Farmer>(soapModels.length);

        for (FarmerSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _farmerId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setFarmerId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _farmerId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Farmer.class;
    }

    @Override
    public String getModelClassName() {
        return Farmer.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("farmerId", getFarmerId());
        attributes.put("name", getName());
        attributes.put("organization_legal", getOrganization_legal());
        attributes.put("ITN", getITN());
        attributes.put("IEC", getIEC());
        attributes.put("PSRN", getPSRN());
        attributes.put("area_registration", getArea_registration());
        attributes.put("area_fields", getArea_fields());
        attributes.put("date_registration", getDate_registration());
        attributes.put("archive", getArchive());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long farmerId = (Long) attributes.get("farmerId");

        if (farmerId != null) {
            setFarmerId(farmerId);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String organization_legal = (String) attributes.get(
                "organization_legal");

        if (organization_legal != null) {
            setOrganization_legal(organization_legal);
        }

        Long ITN = (Long) attributes.get("ITN");

        if (ITN != null) {
            setITN(ITN);
        }

        Long IEC = (Long) attributes.get("IEC");

        if (IEC != null) {
            setIEC(IEC);
        }

        Long PSRN = (Long) attributes.get("PSRN");

        if (PSRN != null) {
            setPSRN(PSRN);
        }

        String area_registration = (String) attributes.get("area_registration");

        if (area_registration != null) {
            setArea_registration(area_registration);
        }

        String area_fields = (String) attributes.get("area_fields");

        if (area_fields != null) {
            setArea_fields(area_fields);
        }

        String date_registration = (String) attributes.get("date_registration");

        if (date_registration != null) {
            setDate_registration(date_registration);
        }

        Integer archive = (Integer) attributes.get("archive");

        if (archive != null) {
            setArchive(archive);
        }
    }

    @JSON
    @Override
    public long getFarmerId() {
        return _farmerId;
    }

    @Override
    public void setFarmerId(long farmerId) {
        _columnBitmask = -1L;

        if (!_setOriginalFarmerId) {
            _setOriginalFarmerId = true;

            _originalFarmerId = _farmerId;
        }

        _farmerId = farmerId;
    }

    public long getOriginalFarmerId() {
        return _originalFarmerId;
    }

    @JSON
    @Override
    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    @JSON
    @Override
    public String getOrganization_legal() {
        if (_organization_legal == null) {
            return StringPool.BLANK;
        } else {
            return _organization_legal;
        }
    }

    @Override
    public void setOrganization_legal(String organization_legal) {
        _organization_legal = organization_legal;
    }

    @JSON
    @Override
    public long getITN() {
        return _ITN;
    }

    @Override
    public void setITN(long ITN) {
        _ITN = ITN;
    }

    @JSON
    @Override
    public long getIEC() {
        return _IEC;
    }

    @Override
    public void setIEC(long IEC) {
        _IEC = IEC;
    }

    @JSON
    @Override
    public long getPSRN() {
        return _PSRN;
    }

    @Override
    public void setPSRN(long PSRN) {
        _PSRN = PSRN;
    }

    @JSON
    @Override
    public String getArea_registration() {
        if (_area_registration == null) {
            return StringPool.BLANK;
        } else {
            return _area_registration;
        }
    }

    @Override
    public void setArea_registration(String area_registration) {
        _area_registration = area_registration;
    }

    @JSON
    @Override
    public String getArea_fields() {
        if (_area_fields == null) {
            return StringPool.BLANK;
        } else {
            return _area_fields;
        }
    }

    @Override
    public void setArea_fields(String area_fields) {
        _area_fields = area_fields;
    }

    @JSON
    @Override
    public String getDate_registration() {
        if (_date_registration == null) {
            return StringPool.BLANK;
        } else {
            return _date_registration;
        }
    }

    @Override
    public void setDate_registration(String date_registration) {
        _date_registration = date_registration;
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
            Farmer.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Farmer toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Farmer) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        FarmerImpl farmerImpl = new FarmerImpl();

        farmerImpl.setFarmerId(getFarmerId());
        farmerImpl.setName(getName());
        farmerImpl.setOrganization_legal(getOrganization_legal());
        farmerImpl.setITN(getITN());
        farmerImpl.setIEC(getIEC());
        farmerImpl.setPSRN(getPSRN());
        farmerImpl.setArea_registration(getArea_registration());
        farmerImpl.setArea_fields(getArea_fields());
        farmerImpl.setDate_registration(getDate_registration());
        farmerImpl.setArchive(getArchive());

        farmerImpl.resetOriginalValues();

        return farmerImpl;
    }

    @Override
    public int compareTo(Farmer farmer) {
        int value = 0;

        if (getFarmerId() < farmer.getFarmerId()) {
            value = -1;
        } else if (getFarmerId() > farmer.getFarmerId()) {
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

        if (!(obj instanceof Farmer)) {
            return false;
        }

        Farmer farmer = (Farmer) obj;

        long primaryKey = farmer.getPrimaryKey();

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
        FarmerModelImpl farmerModelImpl = this;

        farmerModelImpl._originalFarmerId = farmerModelImpl._farmerId;

        farmerModelImpl._setOriginalFarmerId = false;

        farmerModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Farmer> toCacheModel() {
        FarmerCacheModel farmerCacheModel = new FarmerCacheModel();

        farmerCacheModel.farmerId = getFarmerId();

        farmerCacheModel.name = getName();

        String name = farmerCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            farmerCacheModel.name = null;
        }

        farmerCacheModel.organization_legal = getOrganization_legal();

        String organization_legal = farmerCacheModel.organization_legal;

        if ((organization_legal != null) && (organization_legal.length() == 0)) {
            farmerCacheModel.organization_legal = null;
        }

        farmerCacheModel.ITN = getITN();

        farmerCacheModel.IEC = getIEC();

        farmerCacheModel.PSRN = getPSRN();

        farmerCacheModel.area_registration = getArea_registration();

        String area_registration = farmerCacheModel.area_registration;

        if ((area_registration != null) && (area_registration.length() == 0)) {
            farmerCacheModel.area_registration = null;
        }

        farmerCacheModel.area_fields = getArea_fields();

        String area_fields = farmerCacheModel.area_fields;

        if ((area_fields != null) && (area_fields.length() == 0)) {
            farmerCacheModel.area_fields = null;
        }

        farmerCacheModel.date_registration = getDate_registration();

        String date_registration = farmerCacheModel.date_registration;

        if ((date_registration != null) && (date_registration.length() == 0)) {
            farmerCacheModel.date_registration = null;
        }

        farmerCacheModel.archive = getArchive();

        return farmerCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{farmerId=");
        sb.append(getFarmerId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", organization_legal=");
        sb.append(getOrganization_legal());
        sb.append(", ITN=");
        sb.append(getITN());
        sb.append(", IEC=");
        sb.append(getIEC());
        sb.append(", PSRN=");
        sb.append(getPSRN());
        sb.append(", area_registration=");
        sb.append(getArea_registration());
        sb.append(", area_fields=");
        sb.append(getArea_fields());
        sb.append(", date_registration=");
        sb.append(getDate_registration());
        sb.append(", archive=");
        sb.append(getArchive());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("com.meera.dbservice.model.Farmer");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>farmerId</column-name><column-value><![CDATA[");
        sb.append(getFarmerId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>organization_legal</column-name><column-value><![CDATA[");
        sb.append(getOrganization_legal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ITN</column-name><column-value><![CDATA[");
        sb.append(getITN());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>IEC</column-name><column-value><![CDATA[");
        sb.append(getIEC());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PSRN</column-name><column-value><![CDATA[");
        sb.append(getPSRN());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>area_registration</column-name><column-value><![CDATA[");
        sb.append(getArea_registration());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>area_fields</column-name><column-value><![CDATA[");
        sb.append(getArea_fields());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>date_registration</column-name><column-value><![CDATA[");
        sb.append(getDate_registration());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>archive</column-name><column-value><![CDATA[");
        sb.append(getArchive());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
