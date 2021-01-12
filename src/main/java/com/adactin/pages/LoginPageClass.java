package com.adactin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement loginBox;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement passBox;

	@FindBy(xpath = "//input[@name='login']")
	private WebElement loginButton;


	public LoginPageClass(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getLoginBox() {
		return loginBox;
	}

	public WebElement getPassBox() {
		return passBox;
	}

	public WebElement getLoginButton() {
		
		return loginButton;
	}

	public String loginPageTitle() {
		String title = driver.getTitle();
		return title;
	}

}
