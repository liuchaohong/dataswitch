package com.github.dataswitch.input;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.github.rapid.common.util.MapUtil;

public class RandomStringInput extends BaseInput implements Input{
	List<Object> objects = new ArrayList();
	
	public RandomStringInput(int count) {
		for(int i = 0; i < count; i++) {
			objects.add(MapUtil.newLinkedMap("num",i));
		}
	}
	
	@Override
	public Object readObject() {
		if(!objects.isEmpty()) {
			return objects.remove(0);
		}
		return null;
	}

	@Override
	public void close() throws IOException {
	}
		
}
