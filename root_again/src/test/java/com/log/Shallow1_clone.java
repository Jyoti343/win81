package com.log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Shallow1_clone {
	private static  Logger logger=LoggerFactory.getLogger(Shallow1_clone.class);
	public static void main(String ere[]) {
		try{
				Shallow sa=new Shallow(13, "Jianna");
				System.out.println(sa.number);
				Shallow sa1=(Shallow) sa.clone();
				System.out.println(sa1.number);
	    }catch(CloneNotSupportedException ads){
            logger.warn("warned while u were clonning ");
	    }
	}
}class Shallow implements Cloneable{
	
	int number =42;
	String name="Samantha Saint";
    
	Shallow(int number,String name) throws CloneNotSupportedException{
		this.number=number;
		this.name=name;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
		
