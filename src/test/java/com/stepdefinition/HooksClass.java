package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utilities.GlobalLibrary;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends GlobalLibrary {
	
	//webdriver
	@Before(order=1)
	public void beforeScenario() {
		getDriver();
		System.out.println("driver_open");

	}
	


	//webdriverclose
	@After(order=1)
	public void afterScenario1(Scenario s) throws IOException {
		
		if (s.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot)driver;
			byte[] b = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(b, "image/png");
		}
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*//urlopen
	@Before(value="@UAT",order=2)
	public void beforeScenario2() {
		System.out.println("url_launch");

	}
	
	//urlclose
	@After(order=2)
	public void afterScenario() {
		System.out.println("url_close");
	}*/

}
