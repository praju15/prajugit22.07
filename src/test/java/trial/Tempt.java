package trial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt {

	public static void main(String[] args) throws InterruptedException {
		
		
		//smoke test
		//launch browser
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Support\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//open appln
		driver.get("https://www.Flipkart.com/");
		//cancel login page
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		//navigate p=on login

		Actions act=new Actions(driver);

		WebElement abc = driver.findElement(By.xpath("//*[@class='_1_3w1N']"));
		act.moveToElement(abc).build().perform();
		//click on my profile
		
		driver.findElement(By.xpath("//*[text()='My Profile']")).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		//enter username
	driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("8208282726");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Satara@123");
         driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
     Thread.sleep(5000);
 		
         /*
         driver.findElement(By.xpath("//*[text()='Manage Addresses']")).click();
         driver.findElement(By.xpath("//*[@class='_1QhEVk']")).click();
         driver.findElement(By.xpath("//*[@name='name']")).sendKeys("Prajakta");
         driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("8208282726");
         driver.findElement(By.xpath("//*[@name='pincode']")).sendKeys("415513");
         driver.findElement(By.xpath("//*[@name='addressLine2']")).sendKeys("Pune");
         driver.findElement(By.xpath("//*[@name='addressLine1']")).sendKeys("Pune");  
        
         driver.findElement(By.xpath("(//*[@class='_1XFPmK'])[1]")).click();
         driver.findElement(By.xpath("(//*[text()='Save']")).click();
         */		
         
         
         
         
         
         
         
         
         
         
	}

}
