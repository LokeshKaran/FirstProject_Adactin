package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.html5.AddApplicationCache;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername) {

		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Lokesh\\eclipse-workspace\\SeleniumTutorial\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\Lokesh\\eclipse-workspace\\SeleniumTutorial\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				System.out.println("enter the correct browser name");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		return driver;

	}

	public static void gettingUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void clickWebElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sendingText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);

	}

	public static void browserQuit() {
		driver.quit();
	}

	public static void mouseOver(WebElement element, WebElement element2) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
			ac.contextClick(element2).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void robotClass() {
		try {
			Robot ro = new Robot();
			ro.keyPress(KeyEvent.VK_DOWN);
			ro.keyRelease(KeyEvent.VK_DOWN);
			ro.keyPress(KeyEvent.VK_DOWN);
			ro.keyRelease(KeyEvent.VK_DOWN);
			ro.keyPress(KeyEvent.VK_ENTER);
			ro.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}

	}

	public static void selectingText(WebElement ele, String tt) {
		try {
			Select sele = new Select(ele);
			sele.selectByVisibleText(tt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void gettingText(WebElement el) {
		String text;
		try {
			text = el.getText();
			System.out.println(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void screenShot(String screenName) throws IOException {
		TakesScreenshot tk =(TakesScreenshot) driver;
		File src =tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Lokesh\\eclipse-workspace\\Adactin\\ScreenShot"+screenName+"+.png");
		FileUtils.copyFile(src, des);
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
