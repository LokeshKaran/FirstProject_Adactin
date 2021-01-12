package com.adactin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelConfirmationPage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement selecting;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement confimBUtton;
	
	public HotelConfirmationPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSelecting() {
		return selecting;
	}
	public WebElement getConfimBUtton() {
		return confimBUtton;
	}
	

}
