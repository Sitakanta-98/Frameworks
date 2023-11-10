package testng;
import org.testng.annotations.Test;
public class Exp_Testng2 {
@Test
public void login() {
	System.out.println("Login completed");
}
@Test
public void logout() {
	System.out.println("System logout");
}
@Test
public void  addemp() {
	System.out.println("add new emp"); 
	
}
@Test
public void delemp() {
	System.out.println("delete emp");
}
}
