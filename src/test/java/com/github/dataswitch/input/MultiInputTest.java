package com.github.dataswitch.input;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.dataswitch.TestUtil;

public class MultiInputTest {

	@Test
	public void test_multi() throws Exception {
		FileInput fileInput1 = FileInputTest.newFileInput("name,age , sex", "classpath:test/fileinput/abc");
		FileInput fileInput2 = FileInputTest.newFileInput("name,age , sex", "classpath:test/fileinput/2.txt");
		MultiInput mi = new MultiInput(fileInput1,fileInput2);
		int rows = TestUtil.printInputReadRows(mi);
		assertEquals(rows,6);
	}
	
	@Test
	public void test() throws Exception {
		FileInput fileInput1 = FileInputTest.newFileInput("name,age , sex", "classpath:test/fileinput/abc");
		MultiInput mi = new MultiInput(fileInput1);
		int rows = TestUtil.printInputReadRows(mi);
		assertEquals(rows,3);
	}

}
