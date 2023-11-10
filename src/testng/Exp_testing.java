package testng;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Exp_testing {
@BeforeClass
public void login() {
	System.out.println("Login completed");
}
@AfterClass
public void Logout() {
	System.out.println("Logout completed");
}
@Test
public void addemp() {
	System.out.println("add new emp");
	
}
@Test
public void delemp() {
	System.out.println("delete emp"); 
	
}
}
