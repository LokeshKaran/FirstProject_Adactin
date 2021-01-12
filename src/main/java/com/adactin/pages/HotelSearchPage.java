package com.adactin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import com.adactin.baseclass.BaseClass;

public class HotelSearchPage {
	public WebDriver driver;

	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomType;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement noofRooms;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement dateIn;

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement dateOut;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement noOfAdult;

	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement noOfChildren;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submitButton;

	public HotelSearchPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoofRooms() {
		return noofRooms;
	}

	public WebElement getDateIn() {
		return dateIn;
	}

	public WebElement getDateOut() {
		return dateOut;
	}

	public WebElement getNoOfAdult() {
		return noOfAdult;
	}

	public WebElement getNoOfChildren() {
		return noOfChildren;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

}
