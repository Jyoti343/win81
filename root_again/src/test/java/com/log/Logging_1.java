package com.log;


import org.testng.log4testng.Logger;

public class Logging_1 {
    
	public String sunny="mine";
	public static void main(String ads[]){

	Logger  logger=Logger.getLogger(Logging_1.class);
	
	logger.info("still struggling with my Logging ");
	logger.debug("still struggling with my Logging ");
	logger.fatal("still struggling with my Logging ");
	logger.trace("still struggling with my Logging ");
	logger.warn("still struggling with my Logging  {sunny} ");
	/*if(!logger.isDebugEnabled()){
		logger.error("not a single time I have tried 'logger.isDebugEnabled()'  {sunny}");
		logger.debug("still struggling with my Logging ");
	}else
		logger.warn("Don't say i did nt warn you ");*/

	}
}