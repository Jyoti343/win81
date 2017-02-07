package com.log;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Shallow_copie_1 {

	public static Logger logger=LoggerFactory.getLogger(Shallow_copie_1.class);
	public static void main(String riw[]){
	logger.info("Starting to make the first move to real time scenario.");
	
       Test_clone tc=new Test_clone("Lias",31);
       tc.addCity("Texaas");
       tc.addCity("Berlin");
       tc.addCity("Baghdad");
	   tc.addCity("Sanghai");
	   
	   Test_clone clone=tc.clone();
	   tc.addCity("Bengaluru");
	   logger.error("clone "+ clone);
	   logger.error("City "+tc);
   }
}
class Test_clone implements Cloneable{
	private static final Logger logger=LoggerFactory.getLogger(Test_clone.class);
	int number;
	String dk="Bhaisan";
	List<String> city;
	Test_clone(String dk,int number){
		this.dk=dk;
		this.number=number;
		this.city=new ArrayList<String>();
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDk() {
		return dk;
	}
	public void setDk(String dk) {
		this.dk = dk;
	}
	public List<String> getCity() {
		return city;
	}
	public void setCity(List<String> city) {
		this.city = city;
	}
	public void addCity(String city1){
		city.add(city1);
	}
	@Override
	public String toString() {
	//	return "Test_clone [number=" + number + ", dk=" + dk + ", city=" + city + "]";
		return String.format("%d,%s ,city %s", number,dk,city.toString() );
	}
	public Test_clone clone(){
		Test_clone clone=null;
		try{
			clone=(Test_clone) super.clone();
			clone.city=new ArrayList<String>(city);
			
			
		}catch(CloneNotSupportedException s){
			logger.debug("dasd");
		}return clone;
	}
}
