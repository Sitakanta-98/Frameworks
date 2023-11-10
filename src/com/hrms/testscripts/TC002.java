package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;
public class TC002 {
//public static void main(String args[])throws Exception {
@Test
public void tc002() throws Exception {
	
	//test scripts
	General obj = new General();
	Thread.sleep(3000);
	obj.openApplication();
	Thread.sleep(3000);
	obj.login();
	Thread.sleep(3000);
	obj.enterFrame();
	Thread.sleep(3000);
	obj.addNewEmp();
	Thread.sleep(3000);
	obj.exitFrame();
	Thread.sleep(3000);
	obj.logout();
	Thread.sleep(3000);
	obj.closeApplication();
	
	
}
}
