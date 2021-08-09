package com.utilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GlobalLibrary {
	
	 public static WebDriver driver;
	
	public  WebDriver getDriver() {
		
		  System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir") +"\\driver\\chromedriver.exe"));
		  driver = new ChromeDriver();
		  return driver;
	}

	public void loadUrl(String url) {
		driver.get(url);
		maximize();
		implicitWait();
			
	}
	
	public void takeScreenShot(String name) throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+
				"\\src\\test\\resources\\Reports\\ScreenShot\\"+name+".png");
		FileUtils.copyFile(src, dest);

	}
	
	public void driverClose() {
		driver.close();

	}
	
	public void maximize() {
		driver.manage().window().maximize();
	}
	
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void typeInput(WebElement element ,String data) {
		element.sendKeys(data);
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void typeInputJS(WebElement element,String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+data+"')",element);

	}
	
	public void clcikJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",element);

	}
	
	public void selectByText(WebElement element ,String data) {
		new Select(element).selectByVisibleText(data);

	}
	
}
