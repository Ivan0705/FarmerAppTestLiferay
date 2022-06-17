package com.meera.dbservice.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.meera.dbservice.service.http.FarmerServiceSoap}.
 *
 * @author LiferayFarmer
 * @see com.meera.dbservice.service.http.FarmerServiceSoap
 * @generated
 */
public class FarmerSoap implements Serializable {
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

    public FarmerSoap() {
    }

    public static FarmerSoap toSoapModel(Farmer model) {
        FarmerSoap soapModel = new FarmerSoap();

        soapModel.setFarmerId(model.getFarmerId());
        soapModel.setName(model.getName());
        soapModel.setOrganization_legal(model.getOrganization_legal());
        soapModel.setITN(model.getITN());
        soapModel.setIEC(model.getIEC());
        soapModel.setPSRN(model.getPSRN());
        soapModel.setArea_registration(model.getArea_registration());
        soapModel.setArea_fields(model.getArea_fields());
        soapModel.setDate_registration(model.getDate_registration());
        soapModel.setArchive(model.getArchive());

        return soapModel;
    }

    public static FarmerSoap[] toSoapModels(Farmer[] models) {
        FarmerSoap[] soapModels = new FarmerSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static FarmerSoap[][] toSoapModels(Farmer[][] models) {
        FarmerSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new FarmerSoap[models.length][models[0].length];
        } else {
            soapModels = new FarmerSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static FarmerSoap[] toSoapModels(List<Farmer> models) {
        List<FarmerSoap> soapModels = new ArrayList<FarmerSoap>(models.size());

        for (Farmer model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new FarmerSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _farmerId;
    }

    public void setPrimaryKey(long pk) {
        setFarmerId(pk);
    }

    public long getFarmerId() {
        return _farmerId;
    }

    public void setFarmerId(long farmerId) {
        _farmerId = farmerId;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getOrganization_legal() {
        return _organization_legal;
    }

    public void setOrganization_legal(String organization_legal) {
        _organization_legal = organization_legal;
    }

    public long getITN() {
        return _ITN;
    }

    public void setITN(long ITN) {
        _ITN = ITN;
    }

    public long getIEC() {
        return _IEC;
    }

    public void setIEC(long IEC) {
        _IEC = IEC;
    }

    public long getPSRN() {
        return _PSRN;
    }

    public void setPSRN(long PSRN) {
        _PSRN = PSRN;
    }

    public String getArea_registration() {
        return _area_registration;
    }

    public void setArea_registration(String area_registration) {
        _area_registration = area_registration;
    }

    public String getArea_fields() {
        return _area_fields;
    }

    public void setArea_fields(String area_fields) {
        _area_fields = area_fields;
    }

    public String getDate_registration() {
        return _date_registration;
    }

    public void setDate_registration(String date_registration) {
        _date_registration = date_registration;
    }

    public int getArchive() {
        return _archive;
    }

    public void setArchive(int archive) {
        _archive = archive;
    }
}
