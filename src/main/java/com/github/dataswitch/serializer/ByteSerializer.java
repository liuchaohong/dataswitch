package com.github.dataswitch.serializer;

import java.io.IOException;
import java.io.OutputStream;

import com.github.dataswitch.BaseObject;
import com.github.dataswitch.util.IOUtil;

public class ByteSerializer extends BaseObject implements Serializer{

	@Override
	public void serialize(Object object, OutputStream outputStream) throws IOException {
		byte[] buf = object2Bytes(object);
//		DataOutputStream dos = new DataOutputStream(outputStream);
		IOUtil.writeWithLength(outputStream,buf);
	}

	protected byte[] object2Bytes(Object object) throws IOException {
		return IOUtil.javaObject2Bytes(object);
	}

	@Override
	public void flush() throws IOException {
	}
	
}
