package com.base.domain;

import java.util.Map;

import com.bstek.dorado.data.type.GenericCustomEntityDataType;

public class MyDataObjectDataType extends
		GenericCustomEntityDataType<MyDataObject> {

	@Override
	public Object readProperty(MyDataObject myDataObject, String property)
			throws Exception {
		return myDataObject.getValue(property);
	}

	@Override
	public void writeProperty(MyDataObject myDataObject, String property,
			Object value) throws Exception {
		myDataObject.setValue(property, value);
	}

	@Override
	protected MyDataObject createDataObject(Map<String, Object> map)
			throws Exception {
		MyDataObject myDataObject = super.createDataObject(map);
		MyDataObjectUtils.bindEntity(myDataObject, map);
		return myDataObject;
	}
}
