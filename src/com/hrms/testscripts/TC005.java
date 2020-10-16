package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.libs.General;

public class TC005 {
	@Test
	public void tc005() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		General obj = new General();
		obj.openApplication();
		obj.waitStatement();
		obj.login();
		obj.addEmployee();
		obj.logout();
		obj.closeApplication();
	}

}
