package com.github.dataswitch.processor;

import java.util.List;
/**
 * 默认处理器，不做任何操作
 * 
 * @author badqiu
 *
 */
public class DefaultProcessor implements Processor {

	public List<Object> process(List<Object> datas) {
		return datas;
	}

}
