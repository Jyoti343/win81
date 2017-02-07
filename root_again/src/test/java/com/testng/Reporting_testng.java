package com.testng;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Reporting_testng extends TestListenerAdapter{

	private int m_count=0;
	
	public void onTestFailure(ITestResult tr){
		log("f");
	}
	public void onTestSkipped(ITestResult tr){
		
		log("s");
	}
	public void onTestSuccess(ITestResult tr){
		log(".");
	}
	private void log(String string){
		System.out.println("logging,,");
		if(++m_count%4==0){
			System.out.println( " jyoti");
		}
	}
	
}
