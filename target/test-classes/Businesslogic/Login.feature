Feature: Login functionality

Background: Application shows main page to user
When user provide "webdriver.chrome.driver" as key and exe location as "F:\\Automation Support\\chromedriver.exe"
When user opens url as "https://www.flipkart.com/"

@SmokeTest
Scenario: Login functionality with invalid credentials
When user cancle the login window
When user navigate on Login button
When user click on MyProfile
When user enter "8208282726" as username
When user enter "Satara@123" as password
When user click on Login
Then Application shows user profile to user

