package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;

import com.hrms.libs.General;

public class TC003 {

	public static void main(String[] args) {
		DOMConfigurator.configure("Log4j.xml");

		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.deleteEmployee();
		obj.logout();
		obj.closeApplication();
	}

}
