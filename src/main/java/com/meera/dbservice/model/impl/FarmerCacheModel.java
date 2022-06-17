package com.meera.dbservice.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.meera.dbservice.model.Farmer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Farmer in entity cache.
 *
 * @author LiferayFarmer
 * @see Farmer
 * @generated
 */
public class FarmerCacheModel implements CacheModel<Farmer>, Externalizable {
    public long farmerId;
    public String name;
    public String organization_legal;
    public long ITN;
    public long IEC;
    public long PSRN;
    public String area_registration;
    public String area_fields;
    public String date_registration;
    public int archive;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{farmerId=");
        sb.append(farmerId);
        sb.append(", name=");
        sb.append(name);
        sb.append(", organization_legal=");
        sb.append(organization_legal);
        sb.append(", ITN=");
        sb.append(ITN);
        sb.append(", IEC=");
        sb.append(IEC);
        sb.append(", PSRN=");
        sb.append(PSRN);
        sb.append(", area_registration=");
        sb.append(area_registration);
        sb.append(", area_fields=");
        sb.append(area_fields);
        sb.append(", date_registration=");
        sb.append(date_registration);
        sb.append(", archive=");
        sb.append(archive);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Farmer toEntityModel() {
        FarmerImpl farmerImpl = new FarmerImpl();

        farmerImpl.setFarmerId(farmerId);

        if (name == null) {
            farmerImpl.setName(StringPool.BLANK);
        } else {
            farmerImpl.setName(name);
        }

        if (organization_legal == null) {
            farmerImpl.setOrganization_legal(StringPool.BLANK);
        } else {
            farmerImpl.setOrganization_legal(organization_legal);
        }

        farmerImpl.setITN(ITN);
        farmerImpl.setIEC(IEC);
        farmerImpl.setPSRN(PSRN);

        if (area_registration == null) {
            farmerImpl.setArea_registration(StringPool.BLANK);
        } else {
            farmerImpl.setArea_registration(area_registration);
        }

        if (area_fields == null) {
            farmerImpl.setArea_fields(StringPool.BLANK);
        } else {
            farmerImpl.setArea_fields(area_fields);
        }

        if (date_registration == null) {
            farmerImpl.setDate_registration(StringPool.BLANK);
        } else {
            farmerImpl.setDate_registration(date_registration);
        }

        farmerImpl.setArchive(archive);

        farmerImpl.resetOriginalValues();

        return farmerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        farmerId = objectInput.readLong();
        name = objectInput.readUTF();
        organization_legal = objectInput.readUTF();
        ITN = objectInput.readLong();
        IEC = objectInput.readLong();
        PSRN = objectInput.readLong();
        area_registration = objectInput.readUTF();
        area_fields = objectInput.readUTF();
        date_registration = objectInput.readUTF();
        archive = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(farmerId);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (organization_legal == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(organization_legal);
        }

        objectOutput.writeLong(ITN);
        objectOutput.writeLong(IEC);
        objectOutput.writeLong(PSRN);

        if (area_registration == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(area_registration);
        }

        if (area_fields == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(area_fields);
        }

        if (date_registration == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(date_registration);
        }

        objectOutput.writeInt(archive);
    }
}
