package com.adactin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelFinalPage {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='order_no']")
	private WebElement orderNumber;
	
	@FindBy(xpath = "//input[@name='logout']")
	private WebElement logout;
	
	public HotelFinalPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getOrderNumber() {
		String ordernumber = orderNumber.getText();
		System.out.println("The order Number is:"+ordernumber);
		return orderNumber;
	}
	public WebElement getLogout() {
		return logout;
	}

}
