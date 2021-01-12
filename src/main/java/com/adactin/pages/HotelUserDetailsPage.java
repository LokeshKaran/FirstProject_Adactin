package com.adactin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelUserDetailsPage {
	public WebDriver driver;

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastName;

	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement billAdress;

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement cardNumber; //1236547891236547

	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cardType; // American Express

	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement cardExpiryMonth; // April
	
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement cardExpiryYear; // 2022
	
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvvNumber;// 678

	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement bookNowButton;
	
	public HotelUserDetailsPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getBillAdress() {
		return billAdress;
	}
	public WebElement getCardNumber() {
		return cardNumber;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getCardExpiryMonth() {
		return cardExpiryMonth;
	}
	public WebElement getCardExpiryYear() {
		return cardExpiryYear;
	}
	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	public WebElement getBookNowButton() {
		return bookNowButton;
	}
	

}
