$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "checking the login funcnality of the Adactin website",
  "description": "",
  "id": "checking-the-login-funcnality-of-the-adactin-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 862600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "checking with the corect login detials",
  "description": "",
  "id": "checking-the-login-funcnality-of-the-adactin-website;checking-with-the-corect-login-detials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "the application is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user on the loginpage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the user enters the \"LokeshKaran\" and \"Lokeshkaran27..\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "the user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user goes to homepage and validates",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepdefinition.the_application_is_opened()"
});
formatter.result({
  "duration": 5393166700,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefinition.the_user_on_the_loginpage()"
});
formatter.result({
  "duration": 46382000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LokeshKaran",
      "offset": 21
    },
    {
      "val": "Lokeshkaran27..",
      "offset": 39
    }
  ],
  "location": "AdactinStepdefinition.the_user_enters_the_username_and_password(String,String)"
});
formatter.result({
  "duration": 304656800,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefinition.the_user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1452720000,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefinition.user_goes_to_homepage_and_validates()"
});
formatter.result({
  "duration": 5326800,
  "status": "passed"
});
formatter.after({
  "duration": 126100,
  "status": "passed"
});
formatter.before({
  "duration": 86200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Booking the hotel in NewYork for two Members",
  "description": "",
  "id": "checking-the-login-funcnality-of-the-adactin-website;booking-the-hotel-in-newyork-for-two-members",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "the user selects the location",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "the user selects the hotel and Room type",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the user chooses the no of rooms and the check in and check out date",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "the user selects the adults and the child in the room",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user clicks on the search button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "the user is on confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepdefinition.the_user_selects_the_location()"
});
formatter.result({
  "duration": 196266300,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefinition.the_user_selects_the_hotel_and_Room_type()"
});
formatter.result({
  "duration": 247575700,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefinition.the_user_chooses_the_no_of_rooms_and_the_check_in_and_check_out_date()"
});
formatter.result({
  "duration": 412158600,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefinition.the_user_selects_the_adults_and_the_child_in_the_room()"
});
formatter.result({
  "duration": 190642200,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefinition.user_clicks_on_the_search_button()"
});
formatter.result({
  "duration": 1024448900,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefinition.the_user_is_on_confirmation_page()"
});
formatter.result({
  "duration": 77900,
  "status": "passed"
});
formatter.after({
  "duration": 95500,
  "status": "passed"
});
formatter.before({
  "duration": 88400,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Conforming the hotel search page",
  "description": "",
  "id": "checking-the-login-funcnality-of-the-adactin-website;conforming-the-hotel-search-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "the user is the confirmation page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "the user selects the selected hotel",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "the users clicks on the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "the user is on the HotelUserDetailsPage",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepdefinition.the_user_is_the_confirmation_page()"
});
formatter.result({
  "duration": 80200,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefinition.the_user_selects_the_selected_hotel()"
});
formatter.result({
  "duration": 67975100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefinition.the_users_clicks_on_the_continue_button()"
});
formatter.result({
  "duration": 1113091100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefinition.the_user_is_on_the_HotelUserDetailsPage()"
});
formatter.result({
  "duration": 385100,
  "status": "passed"
});
formatter.after({
  "duration": 471200,
  "status": "passed"
});
formatter.before({
  "duration": 333100,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Entering the user details on HotelSeachPage",
  "description": "",
  "id": "checking-the-login-funcnality-of-the-adactin-website;entering-the-user-details-on-hotelseachpage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "the user enters the first and last name",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "enters the billing address and cardNo and cardtype",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "theuser enters the expiry date and cvv number",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "click on the Booknow button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "the user is on HotelFinalPage",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepdefinition.the_user_enters_the_first_and_last_name()"
});
formatter.result({
  "duration": 252394200,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefinition.enters_the_billing_address_and_cardNo_and_cardtype()"
});
formatter.result({
  "duration": 417538600,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefinition.theuser_enters_the_expiry_date_and_cvv_number()"
});
formatter.result({
  "duration": 320261400,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefinition.click_on_the_Booknow_button()"
});
formatter.result({
  "duration": 68253300,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefinition.the_user_is_on_HotelFinalPage()"
});
formatter.result({
  "duration": 103200,
  "status": "passed"
});
formatter.after({
  "duration": 64500,
  "status": "passed"
});
formatter.before({
  "duration": 73700,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "the Hotel is booked and checking the order No",
  "description": "",
  "id": "checking-the-login-funcnality-of-the-adactin-website;the-hotel-is-booked-and-checking-the-order-no",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "the user gets the Order Number",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "the users Log out of the Application",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepdefinition.the_user_gets_the_Order_Number()"
});
formatter.result({
  "duration": 5521138700,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[a]\u003e but was:\u003c[A]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat com.adactin.stepdefinition.AdactinStepdefinition.the_user_gets_the_Order_Number(AdactinStepdefinition.java:184)\r\n\tat ✽.Then the user gets the Order Number(src/test/java/com/adactin/feature/Adactin.feature:33)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AdactinStepdefinition.the_users_Log_out_of_the_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 560690700,
  "status": "passed"
});
});