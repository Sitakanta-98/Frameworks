package testng;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Exp_Testng_Using_Method {
@BeforeMethod
public void login() {
	System.out.println("Login complted");
	
}
@AfterMethod
public void logout() {
	System.out.println("Logout complted");
	
}
@Test(priority=2)
public void addEmp() {
	System.out.println("Add new Emp");
}
@Test(priority=1)
public void delemp() {
	System.out.println("Delete emp");
}
}
