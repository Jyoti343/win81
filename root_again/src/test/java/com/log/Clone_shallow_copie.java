package com.log;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Clone_shallow_copie {

	private static final Logger logger=LoggerFactory.getLogger(Clone_shallow_copie.class);
	
	public static void main(String df[]){
		Programmer pr=new Programmer("Sara",223);
		pr.addCertification("JDD");
		pr.addCertification("DJJA");
		pr.addCertification("JNL");
		pr.addCertification("QELL");
		
		logger.debug("Real time programmer ",pr);
		
		Programmer clone=pr.clone();
		//lets add another certificate to programmer 
		pr.addCertification("Oracle DBA");
		
		logger.warn("real programmer "+ pr);
		logger.error("clonned programmer "+clone );
	}
}
class Programmer implements Cloneable {
	public static final Logger logger =LoggerFactory.getLogger(Programmer.class);
	
	String name ;
	Integer id ;
	private List<String> certification;
	
	Programmer(String name,Integer id){
		this.name=name;
		this.id=id;
		this.certification=new ArrayList<String>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		//return "Programmer [name=" + name + ", id=" + id + "]";
		return String.format("%s,%d, certifications  %s\n\n ", name,id, certification.toString());
	}
	public void addCertification(String certs){
		certification.add(certs);
	}
	protected Programmer clone(){
		Programmer clone=null;
		try{
			clone=(Programmer) super.clone();
			clone.certification=new ArrayList<String>(certification);
			
		}catch(CloneNotSupportedException cs){
			logger.error("Error while clonning Programme ",cs);
		}
		return clone;
	}
	
}
