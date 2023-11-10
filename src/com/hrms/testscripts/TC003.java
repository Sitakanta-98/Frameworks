package com.hrms.testscripts;
import com.hrms.lib.General;

public class TC003 {
public static void main(String args[])throws Exception {
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
obj.editEmp();
Thread.sleep(3000);
obj.exitFrame();
Thread.sleep(3000);
obj.logout();
Thread.sleep(3000);
obj.closeApplication();

	
}
}
