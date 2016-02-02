package com.github.dataswitch.output;

import org.junit.Test;

import com.github.dataswitch.TestUtil;

public class RedisOutputTest {

	RedisOutput out = new RedisOutput();
	@Test
	public void test() {
		out.write(TestUtil.newTestDatas(10));
	}

}
