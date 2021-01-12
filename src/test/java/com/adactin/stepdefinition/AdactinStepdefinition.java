package com.adactin.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pages.HotelSearchPage;
import com.adactin.pages.LoginPageClass;
import com.adactin.runner.AdactinRunner;
import com.adactin.utility.ConfigurationReader;
import com.adactin.utility.PageObjectManager;
import com.adactin.utility.fileReaderManager;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class AdactinStepdefinition extends BaseClass {
	public WebDriver driver =AdactinRunner.driver;
	PageObjectManager pom= new PageObjectManager(driver);
	
	@Before
	public void beforeHooks(Scenario scenario) {
		String name = scenario.getName();
		System.out.println("scenario :"+name);
	}
	@After
	public void afterHooks(Scenario scenario) throws IOException {
		String status = scenario.getStatus();
		System.out.println(status);
		if(scenario.isFailed()) {
			screenShot(scenario.getName());
		}
	}

	@Given("^the application is opened$")
	public void the_application_is_opened() throws IOException {
		System.out.println("the Browser is being opened");
		String urlName = fileReaderManager.getInstance().getCrInstance().urlName();
		gettingUrl(urlName);

	}
	@When("^the user on the loginpage$")
	public void the_user_on_the_loginpage() {
		System.out.println("checking the title of the page");
		String loginPageTitle = pom.getLg().loginPageTitle();
		Assert.assertEquals("Adactin.com - Hotel Reservation System", loginPageTitle);
	}
	
	@Then("^the user enters the \"(.*)\" and \"(.*)\"$")
	public void the_user_enters_the_username_and_password(String username, String pass) {
		System.out.println("Entering the username and password");
//		LoginPageClass lg = new LoginPageClass(driver);
		pom.getLg().getLoginBox().sendKeys(username);
		pom.getLg() .getPassBox().sendKeys(pass);
	}
	
	@Then("^the user clicks on login button$")
	public void the_user_clicks_on_login_button() {
		System.out.println("Clicking on the login button");
		clickWebElement(pom.getLg().getLoginButton());
	}


	@Then("^user goes to homepage and validates$")
	public void user_goes_to_homepage_and_validates() {
		System.out.println("Now entering the HomePage");
		String titleOfHomepage = driver.getTitle();
		System.out.println("the title of the HomePage is :" + titleOfHomepage);
		Assert.assertEquals("Adactin.com - Search Hotel", titleOfHomepage);
	}


	@Then("^the user selects the location$")
	public void the_user_selects_the_location() throws Throwable {
		selectingText(driver.findElement(By.xpath("//select[@name='location']")), "New York");
		selectingText(pom.getHsp().getLocation(), "New York");
	}

	@And("^the user selects the hotel and Room type$")
	public void the_user_selects_the_hotel_and_Room_type() {
		selectingText(pom.getHsp().getHotels(), "Hotel Sunshine");
		selectingText(pom.getHsp().getRoomType(), "Deluxe");
	}

	@And("^the user chooses the no of rooms and the check in and check out date$")
	public void the_user_chooses_the_no_of_rooms_and_the_check_in_and_check_out_date() {
		
		selectingText(pom.getHsp().getNoofRooms(), "2 - Two");
		sendingText(pom.getHsp().getDateIn(), "11/01/2021");
		sendingText(pom.getHsp().getDateOut(), "13/01/2021");

	}

	@And("^the user selects the adults and the child in the room$")
	public void the_user_selects_the_adults_and_the_child_in_the_room() {
		selectingText(pom.getHsp().getNoOfAdult(), "2 - Two");
		selectingText(pom.getHsp().getNoOfChildren(), "0 - None");
	}

	@And("^user clicks on the search button$")
	public void user_clicks_on_the_search_button() {
		clickWebElement(pom.getHsp().getSubmitButton());

	}

	@Then("^the user is on confirmation page$")
	public void the_user_is_on_confirmation_page() {
		System.out.println("the user is on the Confirmation page");

	}
	@When("^the user is the confirmation page$")
	public void the_user_is_the_confirmation_page(){
		System.out.println("the user is on the confirmation page");
	   
	}

	@Then("^the user selects the selected hotel$")
	public void the_user_selects_the_selected_hotel(){
		
	    clickWebElement(pom.getHcp().getSelecting());
	}

	@Then("^the users clicks on the continue button$")
	public void the_users_clicks_on_the_continue_button(){
		clickWebElement(pom.getHcp().getConfimBUtton());
	    
	}

	@Then("^the user is on the HotelUserDetailsPage$")
	public void the_user_is_on_the_HotelUserDetailsPage() {
		System.out.println("the user is on the hotel Confirmation page");
	   
	}
	@Then("^the user enters the first and last name$")
	public void the_user_enters_the_first_and_last_name(){
		sendingText(pom.getHudp().getFirstName(), "Lokesh");
		sendingText(pom.getHudp().getLastName(), "Karan");
		
	  
	}

	@Then("^enters the billing address and cardNo and cardtype$")
	public void enters_the_billing_address_and_cardNo_and_cardtype(){
		sendingText(pom.getHudp().getBillAdress(), "PILLAIYAR KOIL STREET Nellikuppam\r\n"
				+ "Nellikuppam");
		sendingText(pom.getHudp().getCardNumber(), "1236547891236547");
		selectingText(pom.getHudp().getCardType(), "American Express");
	    
	}

	@Then("^theuser enters the expiry date and cvv number$")
	public void theuser_enters_the_expiry_date_and_cvv_number() {
		selectingText(pom.getHudp().getCardExpiryMonth(), "April");
		selectingText(pom.getHudp().getCardExpiryYear(), "2022");
		sendingText(pom.getHudp().getCvvNumber(), "678");
	 
	}

	@Then("^click on the Booknow button$")
	public void click_on_the_Booknow_button() {
		clickWebElement(pom.getHudp().getBookNowButton());
	    
	}

	@Then("^the user is on HotelFinalPage$")
	public void the_user_is_on_HotelFinalPage() {
		System.out.println("the user is on the HotelFinalPage");
	    
	}
	@Then("^the user gets the Order Number$")
	public void the_user_gets_the_Order_Number(){
		pom.getHfp().getOrderNumber();
	  
	}

	@Then("^the users Log out of the Application$")
	public void the_users_Log_out_of_the_Application(){
		clickWebElement(pom.getHfp().getLogout());
	   
	}

}
