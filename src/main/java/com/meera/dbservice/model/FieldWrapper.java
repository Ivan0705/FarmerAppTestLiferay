package com.meera.dbservice.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Field}.
 * </p>
 *
 * @author LiferayFarmer
 * @see Field
 * @generated
 */
public class FieldWrapper implements Field, ModelWrapper<Field> {
    private Field _field;

    public FieldWrapper(Field field) {
        _field = field;
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

    /**
    * Returns the primary key of this field.
    *
    * @return the primary key of this field
    */
    @Override
    public long getPrimaryKey() {
        return _field.getPrimaryKey();
    }

    /**
    * Sets the primary key of this field.
    *
    * @param primaryKey the primary key of this field
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _field.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the field ID of this field.
    *
    * @return the field ID of this field
    */
    @Override
    public long getFieldId() {
        return _field.getFieldId();
    }

    /**
    * Sets the field ID of this field.
    *
    * @param fieldId the field ID of this field
    */
    @Override
    public void setFieldId(long fieldId) {
        _field.setFieldId(fieldId);
    }

    /**
    * Returns the area ID of this field.
    *
    * @return the area ID of this field
    */
    @Override
    public long getAreaId() {
        return _field.getAreaId();
    }

    /**
    * Sets the area ID of this field.
    *
    * @param areaId the area ID of this field
    */
    @Override
    public void setAreaId(long areaId) {
        _field.setAreaId(areaId);
    }

    /**
    * Returns the field name of this field.
    *
    * @return the field name of this field
    */
    @Override
    public java.lang.String getFieldName() {
        return _field.getFieldName();
    }

    /**
    * Sets the field name of this field.
    *
    * @param fieldName the field name of this field
    */
    @Override
    public void setFieldName(java.lang.String fieldName) {
        _field.setFieldName(fieldName);
    }

    @Override
    public boolean isNew() {
        return _field.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _field.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _field.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _field.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _field.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _field.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _field.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _field.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _field.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _field.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _field.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new FieldWrapper((Field) _field.clone());
    }

    @Override
    public int compareTo(com.meera.dbservice.model.Field field) {
        return _field.compareTo(field);
    }

    @Override
    public int hashCode() {
        return _field.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.meera.dbservice.model.Field> toCacheModel() {
        return _field.toCacheModel();
    }

    @Override
    public com.meera.dbservice.model.Field toEscapedModel() {
        return new FieldWrapper(_field.toEscapedModel());
    }

    @Override
    public com.meera.dbservice.model.Field toUnescapedModel() {
        return new FieldWrapper(_field.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _field.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _field.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _field.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FieldWrapper)) {
            return false;
        }

        FieldWrapper fieldWrapper = (FieldWrapper) obj;

        if (Validator.equals(_field, fieldWrapper._field)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Field getWrappedField() {
        return _field;
    }

    @Override
    public Field getWrappedModel() {
        return _field;
    }

    @Override
    public void resetOriginalValues() {
        _field.resetOriginalValues();
    }
}
