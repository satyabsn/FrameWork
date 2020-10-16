package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;

import com.hrms.libs.General;

public class TC002 {
	// Test case steps
	public static void main(String args[]) throws InterruptedException {
		DOMConfigurator.configure("Log4j.xml");
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.addEmployee();
		Thread.sleep(3000);
		obj.logout();
		obj.closeApplication();
	}
}
