package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.libs.General;

public class TC004 {
	//public static void main (String args[]) throws Exception {
	@Test
	public void tc004() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		General obj = new General();
		obj.openApplication();
		obj.waitStatement();
		obj.login();
		obj.logout();
		obj.closeApplication();
	}

}
