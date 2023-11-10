package testng;
import org.testng.annotations.Test;

public class Exp_Testng1 {
@Test
//one @Test is equal to 1 test case / Scenario in report
public void login() {
	System.out.println("Login completed");
	
}
public void logout() {
	System.out.println("Logout completed");
}
}
