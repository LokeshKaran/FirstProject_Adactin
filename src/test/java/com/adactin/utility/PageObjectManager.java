package com.adactin.utility;

import org.openqa.selenium.WebDriver;

import com.adactin.pages.HotelConfirmationPage;
import com.adactin.pages.HotelFinalPage;
import com.adactin.pages.HotelSearchPage;
import com.adactin.pages.HotelUserDetailsPage;
import com.adactin.pages.LoginPageClass;

public class PageObjectManager {
	
	public WebDriver driver;
	
	private LoginPageClass lg;
	private HotelSearchPage hsp;
	private HotelConfirmationPage hcp;
	private HotelUserDetailsPage hudp;
	private HotelFinalPage hfp;
	
	public PageObjectManager(WebDriver ldriver) {
		this.driver=ldriver;
		
	}
	
	public LoginPageClass getLg() {
		lg=new LoginPageClass(driver);
		return lg;
	}
	public HotelSearchPage getHsp() {
		hsp=new HotelSearchPage(driver);
		return hsp;
	}
	public HotelConfirmationPage getHcp() {
		hcp=new HotelConfirmationPage(driver);
		return hcp;
	}
	public HotelUserDetailsPage getHudp() {
		hudp=new HotelUserDetailsPage(driver);
		return hudp;
	}
	public HotelFinalPage getHfp() {
		hfp=new HotelFinalPage(driver);
		return hfp;
	}
	
	

}
