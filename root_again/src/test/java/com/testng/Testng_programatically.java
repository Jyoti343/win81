package com.testng;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Testng_programatically {
 
	public static void main(String dfp[]){
		
	XmlSuite suite=new XmlSuite();
	suite.setName("Suite");
    
	XmlTest test=new XmlTest();
	test.setName("Test");
	
	List<XmlClass> classes=new ArrayList<XmlClass>();
	classes.add(new XmlClass("com.testng.DataProvider_1"));
	test.setXmlClasses(classes);
	
	List<XmlSuite> suites=new ArrayList<XmlSuite>();
	suites.add(suite);
	TestNG testng=new TestNG();
	testng.setXmlSuites(suites);
	testng.run();
	
}
}
