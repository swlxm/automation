package net.automation.selenium.java.distribution.components;

import org.openqa.selenium.WebDriver;

/**
 * The common functions related this page will be defined here
 * all the web element should be initial by DriverUtil.findElement method and do more operation if not null
 * @author Samuel
 *
 */
public class TopNav implements ITopNav {

	private WebDriver driver;
	
	public TopNav(WebDriver driver) {
		this.driver = driver;
	}

	public void commonFuncOnTopNav() {
		
	}
}
