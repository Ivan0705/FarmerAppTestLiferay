package com.meera.dbservice.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Area}.
 * </p>
 *
 * @author LiferayFarmer
 * @see Area
 * @generated
 */
public class AreaWrapper implements Area, ModelWrapper<Area> {
    private Area _area;

    public AreaWrapper(Area area) {
        _area = area;
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

    /**
    * Returns the primary key of this area.
    *
    * @return the primary key of this area
    */
    @Override
    public long getPrimaryKey() {
        return _area.getPrimaryKey();
    }

    /**
    * Sets the primary key of this area.
    *
    * @param primaryKey the primary key of this area
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _area.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the area ID of this area.
    *
    * @return the area ID of this area
    */
    @Override
    public long getAreaId() {
        return _area.getAreaId();
    }

    /**
    * Sets the area ID of this area.
    *
    * @param areaId the area ID of this area
    */
    @Override
    public void setAreaId(long areaId) {
        _area.setAreaId(areaId);
    }

    /**
    * Returns the area name of this area.
    *
    * @return the area name of this area
    */
    @Override
    public java.lang.String getAreaName() {
        return _area.getAreaName();
    }

    /**
    * Sets the area name of this area.
    *
    * @param areaName the area name of this area
    */
    @Override
    public void setAreaName(java.lang.String areaName) {
        _area.setAreaName(areaName);
    }

    /**
    * Returns the archive of this area.
    *
    * @return the archive of this area
    */
    @Override
    public int getArchive() {
        return _area.getArchive();
    }

    /**
    * Sets the archive of this area.
    *
    * @param archive the archive of this area
    */
    @Override
    public void setArchive(int archive) {
        _area.setArchive(archive);
    }

    @Override
    public boolean isNew() {
        return _area.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _area.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _area.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _area.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _area.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _area.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _area.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _area.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _area.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _area.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _area.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new AreaWrapper((Area) _area.clone());
    }

    @Override
    public int compareTo(com.meera.dbservice.model.Area area) {
        return _area.compareTo(area);
    }

    @Override
    public int hashCode() {
        return _area.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.meera.dbservice.model.Area> toCacheModel() {
        return _area.toCacheModel();
    }

    @Override
    public com.meera.dbservice.model.Area toEscapedModel() {
        return new AreaWrapper(_area.toEscapedModel());
    }

    @Override
    public com.meera.dbservice.model.Area toUnescapedModel() {
        return new AreaWrapper(_area.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _area.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _area.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _area.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AreaWrapper)) {
            return false;
        }

        AreaWrapper areaWrapper = (AreaWrapper) obj;

        if (Validator.equals(_area, areaWrapper._area)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Area getWrappedArea() {
        return _area;
    }

    @Override
    public Area getWrappedModel() {
        return _area;
    }

    @Override
    public void resetOriginalValues() {
        _area.resetOriginalValues();
    }
}
