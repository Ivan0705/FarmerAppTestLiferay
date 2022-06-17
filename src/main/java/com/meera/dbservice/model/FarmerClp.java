package com.meera.dbservice.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.meera.dbservice.service.ClpSerializer;
import com.meera.dbservice.service.FarmerLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class FarmerClp extends BaseModelImpl<Farmer> implements Farmer {
    private long _farmerId;
    private String _name;
    private String _organization_legal;
    private long _ITN;
    private long _IEC;
    private long _PSRN;
    private String _area_registration;
    private String _area_fields;
    private String _date_registration;
    private int _archive;
    private BaseModel<?> _farmerRemoteModel;
    private Class<?> _clpSerializerClass = com.meera.dbservice.service.ClpSerializer.class;

    public FarmerClp() {
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

    @Override
    public long getFarmerId() {
        return _farmerId;
    }

    @Override
    public void setFarmerId(long farmerId) {
        _farmerId = farmerId;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setFarmerId", long.class);

                method.invoke(_farmerRemoteModel, farmerId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_farmerRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getOrganization_legal() {
        return _organization_legal;
    }

    @Override
    public void setOrganization_legal(String organization_legal) {
        _organization_legal = organization_legal;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setOrganization_legal",
                        String.class);

                method.invoke(_farmerRemoteModel, organization_legal);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getITN() {
        return _ITN;
    }

    @Override
    public void setITN(long ITN) {
        _ITN = ITN;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setITN", long.class);

                method.invoke(_farmerRemoteModel, ITN);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getIEC() {
        return _IEC;
    }

    @Override
    public void setIEC(long IEC) {
        _IEC = IEC;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setIEC", long.class);

                method.invoke(_farmerRemoteModel, IEC);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPSRN() {
        return _PSRN;
    }

    @Override
    public void setPSRN(long PSRN) {
        _PSRN = PSRN;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setPSRN", long.class);

                method.invoke(_farmerRemoteModel, PSRN);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getArea_registration() {
        return _area_registration;
    }

    @Override
    public void setArea_registration(String area_registration) {
        _area_registration = area_registration;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setArea_registration",
                        String.class);

                method.invoke(_farmerRemoteModel, area_registration);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getArea_fields() {
        return _area_fields;
    }

    @Override
    public void setArea_fields(String area_fields) {
        _area_fields = area_fields;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setArea_fields", String.class);

                method.invoke(_farmerRemoteModel, area_fields);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDate_registration() {
        return _date_registration;
    }

    @Override
    public void setDate_registration(String date_registration) {
        _date_registration = date_registration;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setDate_registration",
                        String.class);

                method.invoke(_farmerRemoteModel, date_registration);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getArchive() {
        return _archive;
    }

    @Override
    public void setArchive(int archive) {
        _archive = archive;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setArchive", int.class);

                method.invoke(_farmerRemoteModel, archive);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getFarmerRemoteModel() {
        return _farmerRemoteModel;
    }

    public void setFarmerRemoteModel(BaseModel<?> farmerRemoteModel) {
        _farmerRemoteModel = farmerRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _farmerRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_farmerRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            FarmerLocalServiceUtil.addFarmer(this);
        } else {
            FarmerLocalServiceUtil.updateFarmer(this);
        }
    }

    @Override
    public Farmer toEscapedModel() {
        return (Farmer) ProxyUtil.newProxyInstance(Farmer.class.getClassLoader(),
            new Class[] { Farmer.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        FarmerClp clone = new FarmerClp();

        clone.setFarmerId(getFarmerId());
        clone.setName(getName());
        clone.setOrganization_legal(getOrganization_legal());
        clone.setITN(getITN());
        clone.setIEC(getIEC());
        clone.setPSRN(getPSRN());
        clone.setArea_registration(getArea_registration());
        clone.setArea_fields(getArea_fields());
        clone.setDate_registration(getDate_registration());
        clone.setArchive(getArchive());

        return clone;
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

        if (!(obj instanceof FarmerClp)) {
            return false;
        }

        FarmerClp farmer = (FarmerClp) obj;

        long primaryKey = farmer.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
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
