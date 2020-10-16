package com.hrms.libs;

import org.openqa.selenium.WebDriver;

public class Global {
	public  WebDriver driver;
	// Test Data
	public String url ="http://127.0.0.1/orangehrm-2.6/login.php";
	public String Username ="admin"; 
	public String Password ="admin";
	public String Code = "001";
	public String Lastname ="Kumar";
	public String Firstname ="Satya";
	public String Middlename ="Nagendra";
	public String Nickname = "swamy";


	// Objects
	public String txt_Xpath_Loginname = "//input[@name='txtUserName']";
	public String txt_Xpath_Password = "//input[@name='txtPassword']";
	public String btn_Xpath_Click = "//input[@type='Submit']";
	public String Link_Xpath_Logout ="//a[@href='./index.php?ACT=logout']";
	public String AddEmply_btn_Xpath_Click ="//input[@value='Add']";
	public String txt_name_code="txtEmployeeId";
	public String txt_name_Lastname="txtEmpLastName";
	public String txt_name_Firstname="txtEmpFirstName";
	public String txt_name_Middlename="txtEmpMiddleName";
	public String txt_name_Nickname="txtEmpNickName";
	public String btn_Xpath_Save="//input[@value='Save']";
	public String event_Xpath_click="//input[@name='chkLocID[]']";
	public String DeleteEmply_btn_Xpath_Click = "//input[@onclick='returnDelete();']"; 

}
