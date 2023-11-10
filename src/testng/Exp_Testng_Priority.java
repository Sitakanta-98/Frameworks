package testng;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exp_Testng_Priority {
@BeforeClass
public void login() {
	System.out.println("Login completed");
}
@AfterClass
public void logout() {
	System.out.println("Logout completd");
}
@Test(priority =2)
	public void addemp() {
	System.out.println("Add New Emp");	
	}
	@Test(priority =2)
		public void delemp() {
		System.out.println("Delete emp");	
		}
	}


