package com.meera.dbservice.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.meera.dbservice.model.Area;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Area in entity cache.
 *
 * @author LiferayFarmer
 * @see Area
 * @generated
 */
public class AreaCacheModel implements CacheModel<Area>, Externalizable {
    public long areaId;
    public String areaName;
    public int archive;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{areaId=");
        sb.append(areaId);
        sb.append(", areaName=");
        sb.append(areaName);
        sb.append(", archive=");
        sb.append(archive);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Area toEntityModel() {
        AreaImpl areaImpl = new AreaImpl();

        areaImpl.setAreaId(areaId);

        if (areaName == null) {
            areaImpl.setAreaName(StringPool.BLANK);
        } else {
            areaImpl.setAreaName(areaName);
        }

        areaImpl.setArchive(archive);

        areaImpl.resetOriginalValues();

        return areaImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        areaId = objectInput.readLong();
        areaName = objectInput.readUTF();
        archive = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(areaId);

        if (areaName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(areaName);
        }

        objectOutput.writeInt(archive);
    }
}
