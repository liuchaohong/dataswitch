package com.duowan.dataswitch.output;

import java.io.ObjectOutput;
import java.util.List;

import com.duowan.dataswitch.BaseObject;

public abstract class BaseOutput extends BaseObject implements Output {

	@Override
	public void write(List<Object> rows) {
		for(Object row : rows) {
			writeObject(row);
		}
	}

	public abstract void writeObject(Object obj);

}
