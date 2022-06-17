package com.meera.dbservice.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.meera.dbservice.service.http.FieldServiceSoap}.
 *
 * @author LiferayFarmer
 * @see com.meera.dbservice.service.http.FieldServiceSoap
 * @generated
 */
public class FieldSoap implements Serializable {
    private long _fieldId;
    private long _areaId;
    private String _fieldName;

    public FieldSoap() {
    }

    public static FieldSoap toSoapModel(Field model) {
        FieldSoap soapModel = new FieldSoap();

        soapModel.setFieldId(model.getFieldId());
        soapModel.setAreaId(model.getAreaId());
        soapModel.setFieldName(model.getFieldName());

        return soapModel;
    }

    public static FieldSoap[] toSoapModels(Field[] models) {
        FieldSoap[] soapModels = new FieldSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static FieldSoap[][] toSoapModels(Field[][] models) {
        FieldSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new FieldSoap[models.length][models[0].length];
        } else {
            soapModels = new FieldSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static FieldSoap[] toSoapModels(List<Field> models) {
        List<FieldSoap> soapModels = new ArrayList<FieldSoap>(models.size());

        for (Field model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new FieldSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _fieldId;
    }

    public void setPrimaryKey(long pk) {
        setFieldId(pk);
    }

    public long getFieldId() {
        return _fieldId;
    }

    public void setFieldId(long fieldId) {
        _fieldId = fieldId;
    }

    public long getAreaId() {
        return _areaId;
    }

    public void setAreaId(long areaId) {
        _areaId = areaId;
    }

    public String getFieldName() {
        return _fieldName;
    }

    public void setFieldName(String fieldName) {
        _fieldName = fieldName;
    }
}
