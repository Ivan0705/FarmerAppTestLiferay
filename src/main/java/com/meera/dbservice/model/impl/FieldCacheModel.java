package com.meera.dbservice.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.meera.dbservice.model.Field;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Field in entity cache.
 *
 * @author LiferayFarmer
 * @see Field
 * @generated
 */
public class FieldCacheModel implements CacheModel<Field>, Externalizable {
    public long fieldId;
    public long areaId;
    public String fieldName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{fieldId=");
        sb.append(fieldId);
        sb.append(", areaId=");
        sb.append(areaId);
        sb.append(", fieldName=");
        sb.append(fieldName);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Field toEntityModel() {
        FieldImpl fieldImpl = new FieldImpl();

        fieldImpl.setFieldId(fieldId);
        fieldImpl.setAreaId(areaId);

        if (fieldName == null) {
            fieldImpl.setFieldName(StringPool.BLANK);
        } else {
            fieldImpl.setFieldName(fieldName);
        }

        fieldImpl.resetOriginalValues();

        return fieldImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        fieldId = objectInput.readLong();
        areaId = objectInput.readLong();
        fieldName = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(fieldId);
        objectOutput.writeLong(areaId);

        if (fieldName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(fieldName);
        }
    }
}
