package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;

import com.hrms.libs.General;

public class TC001 {
	public static void main (String args[]) throws Exception {
		// Test case steps
		DOMConfigurator.configure("Log4j.xml");
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.verifyPagetitle();
		obj.waitStatement();
		obj.logout();
		obj.closeApplication();
		
	}
}
