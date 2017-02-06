package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

 class DataProvider_1{
	 private int ir;
	public DataProvider_1(int t){
		ir=t;
	}@Test
	public void gete(){
		System.out.println(ir);
	}
}
 class Dae extends DataProvider_1 {

	@Factory(dataProvider="dp")
	public  Dae(int n){
		super(n);
		System.out.println(n);
	}
	@DataProvider
	public Object[][] dp(){
		
		return new Object[][]{
			new Object[] {41},
			new Object[] {42},
		};
	}
}
