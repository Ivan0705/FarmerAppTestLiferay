package com.meera.dbservice.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.meera.dbservice.service.AreaLocalServiceUtil;
import com.meera.dbservice.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class AreaClp extends BaseModelImpl<Area> implements Area {
    private long _areaId;
    private String _areaName;
    private int _archive;
    private BaseModel<?> _areaRemoteModel;
    private Class<?> _clpSerializerClass = com.meera.dbservice.service.ClpSerializer.class;

    public AreaClp() {
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

    @Override
    public long getAreaId() {
        return _areaId;
    }

    @Override
    public void setAreaId(long areaId) {
        _areaId = areaId;

        if (_areaRemoteModel != null) {
            try {
                Class<?> clazz = _areaRemoteModel.getClass();

                Method method = clazz.getMethod("setAreaId", long.class);

                method.invoke(_areaRemoteModel, areaId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAreaName() {
        return _areaName;
    }

    @Override
    public void setAreaName(String areaName) {
        _areaName = areaName;

        if (_areaRemoteModel != null) {
            try {
                Class<?> clazz = _areaRemoteModel.getClass();

                Method method = clazz.getMethod("setAreaName", String.class);

                method.invoke(_areaRemoteModel, areaName);
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

        if (_areaRemoteModel != null) {
            try {
                Class<?> clazz = _areaRemoteModel.getClass();

                Method method = clazz.getMethod("setArchive", int.class);

                method.invoke(_areaRemoteModel, archive);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getAreaRemoteModel() {
        return _areaRemoteModel;
    }

    public void setAreaRemoteModel(BaseModel<?> areaRemoteModel) {
        _areaRemoteModel = areaRemoteModel;
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

        Class<?> remoteModelClass = _areaRemoteModel.getClass();

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

        Object returnValue = method.invoke(_areaRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AreaLocalServiceUtil.addArea(this);
        } else {
            AreaLocalServiceUtil.updateArea(this);
        }
    }

    @Override
    public Area toEscapedModel() {
        return (Area) ProxyUtil.newProxyInstance(Area.class.getClassLoader(),
            new Class[] { Area.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        AreaClp clone = new AreaClp();

        clone.setAreaId(getAreaId());
        clone.setAreaName(getAreaName());
        clone.setArchive(getArchive());

        return clone;
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

        if (!(obj instanceof AreaClp)) {
            return false;
        }

        AreaClp area = (AreaClp) obj;

        long primaryKey = area.getPrimaryKey();

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
