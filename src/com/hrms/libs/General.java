package com.hrms.libs;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;


public class General extends Global{
	// Re Usable Functions
	// OPen Application
	public void openApplication() {
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\bsnku\\Downloads\\Selenium\\geckodriver.exe");
			driver =new FirefoxDriver();
			driver.navigate().to(url);
			System.out.println("Application Opened");
			Reporter.log("Application Opened");
			Log.info("Application Opened");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	// Maximize the application
	public void maxMize() {
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	// Verify the page title
	public void verifyPagetitle() {
		try {
			String actTitle= driver.getTitle().trim();
			System.out.println(actTitle);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	// Wait Statement
	public void waitStatement() throws Exception{
		Thread.sleep(3000);
	}
	//Close Application
	public void closeApplication() {
		try {
			driver.close();
			System.out.println("Application Closed");
			Reporter.log("Application Closed");
			Log.info("Application Closed");
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	// To perform login Activity
	public void login() {
		try {
			driver.findElement(By.xpath(txt_Xpath_Loginname)).sendKeys(Username);
			driver.findElement(By.xpath(txt_Xpath_Password)).sendKeys(Password);
			driver.findElement(By.xpath(btn_Xpath_Click)).click();
			System.out.println("Login completed");
			Reporter.log("Login completed");
			Log.info("Login completed");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	// To Logout Activity
	public void logout() {
		try {
			driver.findElement(By.xpath(Link_Xpath_Logout)).click();
			System.out.println("Logout Completed");
			Reporter.log("Logout Completed");
			Log.info("Logout Completed");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	// To Add new Employee
	public void addEmployee() {
		try {
			driver.switchTo().frame("rightMenu");
			driver.findElement(By.xpath(AddEmply_btn_Xpath_Click)).click();
			driver.findElement(By.name(txt_name_code)).sendKeys(Code);
			driver.findElement(By.name(txt_name_Lastname)).sendKeys(Lastname);
			driver.findElement(By.name(txt_name_Firstname)).sendKeys(Firstname);
			driver.findElement(By.name(txt_name_Middlename)).sendKeys(Middlename);
			driver.findElement(By.name(txt_name_Nickname)).sendKeys(Nickname);
			driver.findElement(By.xpath(btn_Xpath_Save)).click();
			driver.switchTo().parentFrame();
			
			System.out.println("Add Employee");
			Reporter.log("Add Employee");
			Log.info("Add Employee");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	// To Delete An Exiciting Employee	
	public void deleteEmployee() {
		try {
			driver.switchTo().frame("rightMenu");
			driver.findElement(By.xpath(event_Xpath_click)).click();
			driver.findElement(By.xpath(DeleteEmply_btn_Xpath_Click)).click();
			driver.switchTo().parentFrame();
			System.out.println("Delete Employee");
			Reporter.log("Delete Employee");
			Log.info("Delete Employee");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public void enterintotheFrame() {
		driver.switchTo().parentFrame();
		System.out.println("Successfully entered");

	}
	public void exitintotheFrame() {
		driver.switchTo().parentFrame();
		System.out.println("Successfully Exited");
	}
}
