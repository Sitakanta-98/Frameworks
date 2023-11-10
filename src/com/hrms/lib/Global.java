package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
//std rule:To provide Test data & Objects/ elements Related to while application
	public WebDriver driver;
	//test data
	//Data   Var    VV
	public String url="http://183.82.103.245/nareshit/login.php";
	public String un ="nareshit";
	public String pw= "nareshit";
	public String efn="Selenium";
	public String eln="Suresh";
	public String nefn="Rohit";
	public String neln="Sharma";
	
	


	
	//objects/ Elements
	public String txt_loginname="txtUserName";
	public String txt_password="txtPassword";
	public String btn_login="Submit";
	public String link_logout="Logout";
	public String empinfo_frame="rightMenu";
	public String btn_Add="//input[@Value='Add']";
	public String txt_efn="txtEmpFirstName";
	public String txt_eln="txtEmpLastName";
	public String btn_save="btnEdit";
	public String btn_edit="//input[@Value='Edit']";
	public String effn_edit="//input[@id='txtEmpFirstName']";
	public String efln_edit="//input[@id='txtEmpLastName']";
	public String txt_nefn="txtEmpFirstName";
	public String txt_neln="txtEmpLastName";
	public String buton_save="btnEditPers";
	
	
	
	
	
}
