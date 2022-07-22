package cucumbermap;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login 
{
	public ChromeDriver driver=null;
	
	@When ("^user provide \"(.*)\" as key and exe location as \"(.*)\"$")	
	
	public void broswerLaunch(String key, String value)
	{

		Object[]input1=new Object[2];
		
	input1[0]=key;
	input1[1]=value;
		SeleniumOperations.browserLaunch(input1);
		
	}
	
	@When ("user opens url as \"(.*)\"$")
	public void openApp(String url)
	{	
		Object[]input2=new Object[1];
		
		input2[0]=url;
		SeleniumOperations.openApplication(input2); 
	}
	
	@When("^user cancle the login window$")
	public void user_cancle_the_login_window() throws Throwable {
		Object[]input3=new Object[1];
		
		input3[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.ClickonElement(input3);
	   
	}

	@When("^user navigate on Login button$")
	public void user_navigate_on_Login_button() throws Throwable 
	{
		Object[]input4=new Object[1];
		
		input4[0]="//*[@class='_1_3w1N']";
		Hashtable<String,Object> output4=SeleniumOperations.moveToElement(input4);
        HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user navigate on Login button$", output4.get("MESSAGE").toString());
	}


         @When("^user click on MyProfile$")
      public void user_click_on_MyProfile() throws Throwable
    {
        	 Thread.sleep(5000);
        	 Object[]input5=new Object[1];
        		
        		input5[0]="//*[text()='My Profile']";
        		Hashtable<String,Object> output5=SeleniumOperations.ClickonElement(input5);
        		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user click on MyProfile$", output5.get("MESSAGE").toString());
        		Thread.sleep(5000);
    }
	

	@When("^user enter (.+) as username$")
	public void user_enter_as_username(String uname) throws Throwable
	{
		
        Object[]input6=new Object[2];
		
		input6[0]="(//*[@type='text'])[2]";
		input6[1]="8208282726";
		Hashtable<String,Object> output6=SeleniumOperations.SendtextonUI(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^user enter (.+) as username$", output6.get("MESSAGE").toString());
	}
	
	@When("^user enter (.+) as password$")
	public void user_enter_as_password(String pass) throws Throwable 
	{

        Object[]input7=new Object[2];
		
		input7[0]="//*[@type='password']";
		input7[1]="Satara@123";
		Hashtable<String,Object> output7=SeleniumOperations.SendtextonUI(input7);	
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"^user enter (.+) as password$", output7.get("MESSAGE").toString());
	}

	@When("^user click on Login$")
	public void user_click_on_Login() throws Throwable
	{
        Object[]input8=new Object[1];
		
		input8[0]="(//*[@type='submit'])[2]";
		Hashtable<String,Object> output8=SeleniumOperations.ClickonElement(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^user click on Login$", output8.get("MESSAGE").toString());
	}
	
	@Then("^Application shows user profile to user$")
	public void application_shows_user_profile_to_user() throws Throwable 
   {
		Object[]input9=new Object[2];
        input9[0]="//*[@class='_1mHr1S']"; 
		input9[1]="Personal Information";
		      
        Hashtable<String,Object> output9 =SeleniumOperations.ValidateLoginByGetText(input9);
        HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"^Application shows user profile to user$",output9.get("MESSAGE").toString());
   }
	  


}

	
	
	
	
	
	
	
	
	
	
	

