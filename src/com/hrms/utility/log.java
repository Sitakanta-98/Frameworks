package com.hrms.utility;
import org.apache.log4j.Logger;

public class log {
	//Initialize Log4j logs
	private static Logger log = Logger.getLogger(log.class.getName());
	//Need to create these method , so that they can be called 
	public static void info(String message) {
		log.info(message);
	}

}
