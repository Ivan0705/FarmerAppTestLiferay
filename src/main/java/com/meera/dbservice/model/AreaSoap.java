package com.meera.dbservice.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.meera.dbservice.service.http.AreaServiceSoap}.
 *
 * @author LiferayFarmer
 * @see com.meera.dbservice.service.http.AreaServiceSoap
 * @generated
 */
public class AreaSoap implements Serializable {
    private long _areaId;
    private String _areaName;
    private int _archive;

    public AreaSoap() {
    }

    public static AreaSoap toSoapModel(Area model) {
        AreaSoap soapModel = new AreaSoap();

        soapModel.setAreaId(model.getAreaId());
        soapModel.setAreaName(model.getAreaName());
        soapModel.setArchive(model.getArchive());

        return soapModel;
    }

    public static AreaSoap[] toSoapModels(Area[] models) {
        AreaSoap[] soapModels = new AreaSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static AreaSoap[][] toSoapModels(Area[][] models) {
        AreaSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new AreaSoap[models.length][models[0].length];
        } else {
            soapModels = new AreaSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static AreaSoap[] toSoapModels(List<Area> models) {
        List<AreaSoap> soapModels = new ArrayList<AreaSoap>(models.size());

        for (Area model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new AreaSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _areaId;
    }

    public void setPrimaryKey(long pk) {
        setAreaId(pk);
    }

    public long getAreaId() {
        return _areaId;
    }

    public void setAreaId(long areaId) {
        _areaId = areaId;
    }

    public String getAreaName() {
        return _areaName;
    }

    public void setAreaName(String areaName) {
        _areaName = areaName;
    }

    public int getArchive() {
        return _archive;
    }

    public void setArchive(int archive) {
        _archive = archive;
    }
}
