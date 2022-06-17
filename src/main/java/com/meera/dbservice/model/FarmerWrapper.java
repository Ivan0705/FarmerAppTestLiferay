package com.meera.dbservice.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Farmer}.
 * </p>
 *
 * @author LiferayFarmer
 * @see Farmer
 * @generated
 */
public class FarmerWrapper implements Farmer, ModelWrapper<Farmer> {
    private Farmer _farmer;

    public FarmerWrapper(Farmer farmer) {
        _farmer = farmer;
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

    /**
    * Returns the primary key of this farmer.
    *
    * @return the primary key of this farmer
    */
    @Override
    public long getPrimaryKey() {
        return _farmer.getPrimaryKey();
    }

    /**
    * Sets the primary key of this farmer.
    *
    * @param primaryKey the primary key of this farmer
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _farmer.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the farmer ID of this farmer.
    *
    * @return the farmer ID of this farmer
    */
    @Override
    public long getFarmerId() {
        return _farmer.getFarmerId();
    }

    /**
    * Sets the farmer ID of this farmer.
    *
    * @param farmerId the farmer ID of this farmer
    */
    @Override
    public void setFarmerId(long farmerId) {
        _farmer.setFarmerId(farmerId);
    }

    /**
    * Returns the name of this farmer.
    *
    * @return the name of this farmer
    */
    @Override
    public java.lang.String getName() {
        return _farmer.getName();
    }

    /**
    * Sets the name of this farmer.
    *
    * @param name the name of this farmer
    */
    @Override
    public void setName(java.lang.String name) {
        _farmer.setName(name);
    }

    /**
    * Returns the organization_legal of this farmer.
    *
    * @return the organization_legal of this farmer
    */
    @Override
    public java.lang.String getOrganization_legal() {
        return _farmer.getOrganization_legal();
    }

    /**
    * Sets the organization_legal of this farmer.
    *
    * @param organization_legal the organization_legal of this farmer
    */
    @Override
    public void setOrganization_legal(java.lang.String organization_legal) {
        _farmer.setOrganization_legal(organization_legal);
    }

    /**
    * Returns the i t n of this farmer.
    *
    * @return the i t n of this farmer
    */
    @Override
    public long getITN() {
        return _farmer.getITN();
    }

    /**
    * Sets the i t n of this farmer.
    *
    * @param ITN the i t n of this farmer
    */
    @Override
    public void setITN(long ITN) {
        _farmer.setITN(ITN);
    }

    /**
    * Returns the i e c of this farmer.
    *
    * @return the i e c of this farmer
    */
    @Override
    public long getIEC() {
        return _farmer.getIEC();
    }

    /**
    * Sets the i e c of this farmer.
    *
    * @param IEC the i e c of this farmer
    */
    @Override
    public void setIEC(long IEC) {
        _farmer.setIEC(IEC);
    }

    /**
    * Returns the p s r n of this farmer.
    *
    * @return the p s r n of this farmer
    */
    @Override
    public long getPSRN() {
        return _farmer.getPSRN();
    }

    /**
    * Sets the p s r n of this farmer.
    *
    * @param PSRN the p s r n of this farmer
    */
    @Override
    public void setPSRN(long PSRN) {
        _farmer.setPSRN(PSRN);
    }

    /**
    * Returns the area_registration of this farmer.
    *
    * @return the area_registration of this farmer
    */
    @Override
    public java.lang.String getArea_registration() {
        return _farmer.getArea_registration();
    }

    /**
    * Sets the area_registration of this farmer.
    *
    * @param area_registration the area_registration of this farmer
    */
    @Override
    public void setArea_registration(java.lang.String area_registration) {
        _farmer.setArea_registration(area_registration);
    }

    /**
    * Returns the area_fields of this farmer.
    *
    * @return the area_fields of this farmer
    */
    @Override
    public java.lang.String getArea_fields() {
        return _farmer.getArea_fields();
    }

    /**
    * Sets the area_fields of this farmer.
    *
    * @param area_fields the area_fields of this farmer
    */
    @Override
    public void setArea_fields(java.lang.String area_fields) {
        _farmer.setArea_fields(area_fields);
    }

    /**
    * Returns the date_registration of this farmer.
    *
    * @return the date_registration of this farmer
    */
    @Override
    public java.lang.String getDate_registration() {
        return _farmer.getDate_registration();
    }

    /**
    * Sets the date_registration of this farmer.
    *
    * @param date_registration the date_registration of this farmer
    */
    @Override
    public void setDate_registration(java.lang.String date_registration) {
        _farmer.setDate_registration(date_registration);
    }

    /**
    * Returns the archive of this farmer.
    *
    * @return the archive of this farmer
    */
    @Override
    public int getArchive() {
        return _farmer.getArchive();
    }

    /**
    * Sets the archive of this farmer.
    *
    * @param archive the archive of this farmer
    */
    @Override
    public void setArchive(int archive) {
        _farmer.setArchive(archive);
    }

    @Override
    public boolean isNew() {
        return _farmer.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _farmer.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _farmer.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _farmer.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _farmer.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _farmer.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _farmer.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _farmer.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _farmer.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _farmer.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _farmer.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new FarmerWrapper((Farmer) _farmer.clone());
    }

    @Override
    public int compareTo(com.meera.dbservice.model.Farmer farmer) {
        return _farmer.compareTo(farmer);
    }

    @Override
    public int hashCode() {
        return _farmer.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.meera.dbservice.model.Farmer> toCacheModel() {
        return _farmer.toCacheModel();
    }

    @Override
    public com.meera.dbservice.model.Farmer toEscapedModel() {
        return new FarmerWrapper(_farmer.toEscapedModel());
    }

    @Override
    public com.meera.dbservice.model.Farmer toUnescapedModel() {
        return new FarmerWrapper(_farmer.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _farmer.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _farmer.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _farmer.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FarmerWrapper)) {
            return false;
        }

        FarmerWrapper farmerWrapper = (FarmerWrapper) obj;

        if (Validator.equals(_farmer, farmerWrapper._farmer)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Farmer getWrappedFarmer() {
        return _farmer;
    }

    @Override
    public Farmer getWrappedModel() {
        return _farmer;
    }

    @Override
    public void resetOriginalValues() {
        _farmer.resetOriginalValues();
    }
}
