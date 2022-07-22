package cucumbermap;

import java.net.UnknownHostException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.HTMLReportGenerator;

public class Hookable 


{
    @Before
	public void before(Scenario scenario) throws UnknownHostException
	{
		HTMLReportGenerator.TestSuiteStart("F:\\Report\\flipkart.html", "Flipkart");
    	HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
    	
		System.out.println("----------Scenario Start------------");
		
	}
	
    @After
	public void after(Scenario scenario)
	{
		
		System.out.println("----------Scenario Ends------------");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
		
		
		
	}
	
	
	
	
	
	
	
	
}
