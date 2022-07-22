package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations {

	public static ChromeDriver driver=null;
	
	public static Hashtable<String,Object> outputParameters= new Hashtable<String,Object>();
			
	
	public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)
	{
		try
		{
		String strBrowserName=(String)inputParameters[0];
		String strExe=(String)inputParameters[1];

		System.setProperty( strBrowserName, strExe);
	 driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		}catch(Exception e)
		{ 
			System.out.println(e);
		}
		 return outputParameters;
	}
   public static Hashtable<String,Object> openApplication(Object[]inputParameters)
   
   {
	   try
	   {
	   String path=(String)inputParameters[0];
	   driver.get(path);
	   driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	   }catch(Exception e)
		{ 
			System.out.println(e);
		}
	   return outputParameters;
	   
   }
   
   public static Hashtable<String,Object> ClickonElement(Object[]inputParameters)
   {
	   try
	   {
		   
	   String xpath=(String)inputParameters[0];
	   
	   driver.findElement(By.xpath(xpath)).click();
	   driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

       outputParameters.put("STATUS", "PASS");
       outputParameters.put("MESSAGE", "methodUsed: ClickonElement,Input Given: " + inputParameters[0].toString());
  
	   
	   
	   }catch(Exception e)
		{ 
		   outputParameters.put("STATUS", "FAIL");
	       outputParameters.put("MESSAGE", "methodUsed: ClickonElement,Input Given: " + inputParameters[0].toString());
	  
		}
	   return outputParameters;	   
   }
   public static Hashtable<String,Object> moveToElement(Object[]inputParameters) 
   {
   try
      {
   
      String xpath=(String)inputParameters[0];
      Actions act=new Actions(driver);

	  WebElement abc = driver.findElement(By.xpath(xpath));
	  act.moveToElement(abc).build().perform();
	  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
      
        outputParameters.put("STATUS", "PASS");
        outputParameters.put("MESSAGE", "methodUsed: movetoElement,Input Given: " + inputParameters[0].toString());
   
      }
          catch(Exception e)
     	{ 
        	  outputParameters.put("STATUS", "FAIL");
              outputParameters.put("MESSAGE", "methodUsed: movetoElement,Input Given: " + inputParameters[0].toString());
        
	    } 
        return outputParameters;
      }
	public static Hashtable<String,Object> SendtextonUI(Object[]inputParameters)//USRNAME ENTER

	{
		try
		{
   String xpath=(String)inputParameters[0];
   String text=(String)inputParameters[1];
	driver.findElement(By.xpath(xpath)).sendKeys(text);
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
	outputParameters.put("STATUS", "PASS");
    outputParameters.put("MESSAGE", "methodUsed:SendtextonUI ,Input Given: " + inputParameters[1].toString());
		}catch(Exception e)
		{ 
			outputParameters.put("STATUS", "FAIL");
		    outputParameters.put("MESSAGE", "methodUsed:SendtextonUI ,Input Given: " + inputParameters[1].toString());
		}
		 return outputParameters;
    }  
	public static Hashtable<String,Object> ValidateLoginByGetText(Object[]inputParameters)
	{
		try
		{
			 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		String xpath=(String)inputParameters[0];//giving xpath
		String giventext=(String)inputParameters[1];//giving string of xpath
	
		WebElement web=driver.findElement(By.xpath(xpath));
		
		String capturedtext=web.getText();
         if(giventext.equalsIgnoreCase(capturedtext))
        { 
	      System.out.println("Test Case Pass");
        }else
          
         {
	      System.out.println("Test Case Fail");
         }
       
        outputParameters.put("STATUS", "PASS");
        outputParameters.put("MESSAGE", "methodUsed:ValidateLoginByGetText ,Input Given: " + inputParameters[1].toString());
        
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
		    outputParameters.put("MESSAGE", "methodUsed:ValidateLoginByGetText ,Input Given: " + inputParameters[1].toString());
		}
		 return outputParameters;
		}
	
	public static Hashtable<String,Object>  main (String [] args) throws InterruptedException
	{
		//browserlaunch
		
		Object[]input1=new Object[2];
		
	input1[0]="webdriver.chrome.driver";
	input1[1]="F:\\Automation Support\\chromedriver.exe";
		SeleniumOperations.browserLaunch(input1);
//open appln
		Object[]input2=new Object[1];
		
	input2[0]="https://www.Flipkart.com/";
	SeleniumOperations.openApplication(input2);
	//click on element
			Object[]input3=new Object[1];
			
		input3[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.ClickonElement(input3);
		//move on element
		Object[]input4=new Object[1];
		
	   input4[0]="//*[@class='_1_3w1N']";
	   SeleniumOperations.moveToElement(input4);
	//ClickonElement();
	    Object[]input5=new Object[1];
	
	    input5[0]="//*[text()='My Profile']";
	    SeleniumOperations.ClickonElement(input5);
		Thread.sleep(5000);
		
		Object[]input6=new Object[2];
		
		input6[0]="(//*[@type='text'])[2]";
		input6[1]="8208282726";
		SeleniumOperations.SendtextonUI(input6);
		//SendtextonUI(,);	
         Object[]input7=new Object[2];
		
		input7[0]="//*[@type='password']";
		input7[1]="Satara@123";
		SeleniumOperations.SendtextonUI(input7);	
		Object[]input8=new Object[1];
		
		input8[0]="(//*[@type='submit'])[2]";
        SeleniumOperations.ClickonElement(input8);
        
        Object[]input9=new Object[2];
        input9[0]="//*[@class='_1mHr1S']"; 
		input9[1]="Personal Information";
		      
		return SeleniumOperations.ValidateLoginByGetText(input9);
		
	}
	
}
