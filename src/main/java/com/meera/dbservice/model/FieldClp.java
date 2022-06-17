package com.meera.dbservice.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.meera.dbservice.service.ClpSerializer;
import com.meera.dbservice.service.FieldLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class FieldClp extends BaseModelImpl<Field> implements Field {
    private long _fieldId;
    private long _areaId;
    private String _fieldName;
    private BaseModel<?> _fieldRemoteModel;
    private Class<?> _clpSerializerClass = com.meera.dbservice.service.ClpSerializer.class;

    public FieldClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Field.class;
    }

    @Override
    public String getModelClassName() {
        return Field.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _fieldId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setFieldId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _fieldId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("fieldId", getFieldId());
        attributes.put("areaId", getAreaId());
        attributes.put("fieldName", getFieldName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long fieldId = (Long) attributes.get("fieldId");

        if (fieldId != null) {
            setFieldId(fieldId);
        }

        Long areaId = (Long) attributes.get("areaId");

        if (areaId != null) {
            setAreaId(areaId);
        }

        String fieldName = (String) attributes.get("fieldName");

        if (fieldName != null) {
            setFieldName(fieldName);
        }
    }

    @Override
    public long getFieldId() {
        return _fieldId;
    }

    @Override
    public void setFieldId(long fieldId) {
        _fieldId = fieldId;

        if (_fieldRemoteModel != null) {
            try {
                Class<?> clazz = _fieldRemoteModel.getClass();

                Method method = clazz.getMethod("setFieldId", long.class);

                method.invoke(_fieldRemoteModel, fieldId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getAreaId() {
        return _areaId;
    }

    @Override
    public void setAreaId(long areaId) {
        _areaId = areaId;

        if (_fieldRemoteModel != null) {
            try {
                Class<?> clazz = _fieldRemoteModel.getClass();

                Method method = clazz.getMethod("setAreaId", long.class);

                method.invoke(_fieldRemoteModel, areaId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFieldName() {
        return _fieldName;
    }

    @Override
    public void setFieldName(String fieldName) {
        _fieldName = fieldName;

        if (_fieldRemoteModel != null) {
            try {
                Class<?> clazz = _fieldRemoteModel.getClass();

                Method method = clazz.getMethod("setFieldName", String.class);

                method.invoke(_fieldRemoteModel, fieldName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getFieldRemoteModel() {
        return _fieldRemoteModel;
    }

    public void setFieldRemoteModel(BaseModel<?> fieldRemoteModel) {
        _fieldRemoteModel = fieldRemoteModel;
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

        Class<?> remoteModelClass = _fieldRemoteModel.getClass();

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

        Object returnValue = method.invoke(_fieldRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            FieldLocalServiceUtil.addField(this);
        } else {
            FieldLocalServiceUtil.updateField(this);
        }
    }

    @Override
    public Field toEscapedModel() {
        return (Field) ProxyUtil.newProxyInstance(Field.class.getClassLoader(),
            new Class[] { Field.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        FieldClp clone = new FieldClp();

        clone.setFieldId(getFieldId());
        clone.setAreaId(getAreaId());
        clone.setFieldName(getFieldName());

        return clone;
    }

    @Override
    public int compareTo(Field field) {
        int value = 0;

        if (getFieldId() < field.getFieldId()) {
            value = -1;
        } else if (getFieldId() > field.getFieldId()) {
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

        if (!(obj instanceof FieldClp)) {
            return false;
        }

        FieldClp field = (FieldClp) obj;

        long primaryKey = field.getPrimaryKey();

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

        sb.append("{fieldId=");
        sb.append(getFieldId());
        sb.append(", areaId=");
        sb.append(getAreaId());
        sb.append(", fieldName=");
        sb.append(getFieldName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.meera.dbservice.model.Field");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>fieldId</column-name><column-value><![CDATA[");
        sb.append(getFieldId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>areaId</column-name><column-value><![CDATA[");
        sb.append(getAreaId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fieldName</column-name><column-value><![CDATA[");
        sb.append(getFieldName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
