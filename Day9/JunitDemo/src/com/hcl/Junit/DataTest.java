package com.hcl.Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {
	@Test(expected=NullPointerException.class)
	public void testNullEx(){
		Data obj=null;
		assertEquals(5,obj.sum(2, 3));
	}
	@Test
	public void testdiv(){
		Data obj=new Data();
		assertEquals(2,obj.div(5, 2));
	}
	@Test(expected=ArithmeticException.class)
	public void testdivEx(){
		Data obj=new Data();
		obj.div(5, 0);
	}
	@Test
	public void testgetPropertyTest(){
		Data obj=new Data();
		assertNotNull(obj.getPropertyTest("yaswanth"));
		assertNull(obj.getPropertyTest("sai"));
		
	}
	@Test
	public void testeven(){
		Data obj=new Data();
		assertEquals(true,obj.even(2));
		assertEquals(false,obj.even(5));
	}
	@Test
	public void testminArray(){
		Data objData=new Data();
		int[] x={1,2,3,4,5};
		int[] x1={2,3,4,5,1};
		assertEquals(1,objData.minArray(x));
		assertEquals(1,objData.minArray(x1));
		
	}
	@Test
	public void testmax(){
		Data objData=new Data();
		assertEquals(5,objData.max(5, 1, 3));
		assertEquals(5,objData.max(1, 5, 3));
		assertEquals(5,objData.max(1, 3, 5));
		
	}

	@Test
	public void testmessage() {
		Data objData=new Data();
		assertEquals("welcome to junit",objData.message());		
	}
	@Test
	public void testsum(){
		Data objData= new Data();
		//assertEquals(4,objData.sum(2, 2));
		assertEquals(4,objData.sum(1, 3));
	}

	
}
