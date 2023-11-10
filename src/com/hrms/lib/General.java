package com.hrms.lib;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.testng.Reporter;
import com.hrms.utility.log;


public class General extends Global {
//std rule: To provide all re-usable fun:/methods related to whole application
	public void openApplication() {
	driver=new FirefoxDriver();
	driver.navigate().to(url);
	System.out.println("Application opened");//console
	Reporter.log("Application Opened");//html report
	log.info("Application opened");//log file
	
	
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application closed");
		log.info("Application closed");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
		log.info("Login completd");
		
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
	}
	public void enterFrame() {
		driver.switchTo().frame(empinfo_frame);
		System.out.println("Enter into frame");
		log.info("Enter into the frame");
	}
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		log.info("Exit from frame");
		
	}
	public void addNewEmp() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_efn)).sendKeys(efn);
		driver.findElement(By.name(txt_eln)).sendKeys(eln);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("Add new emp");
		log.info("Add new Emp");
	}
   public void editEmp() {
	  
	driver.findElement(By.xpath(btn_edit)).click();
	driver.findElement(By.xpath(effn_edit)).clear();
	driver.findElement(By.xpath(efln_edit)).clear();
	   driver.findElement(By.name(txt_nefn)).sendKeys(nefn);
	   driver.findElement(By.name(txt_neln)).sendKeys(neln);
	   driver.findElement(By.id(buton_save)).click();
	   System.out.println("Edit Emp");
	   log.info("Edit Emp");
   }
		
		
	}

