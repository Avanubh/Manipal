package Axis_TestNGG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	//Axis_TestNGG.NewTest
  @Test(priority=0)
  public void f() {
	  System.out.println("This is my test area");
	  System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		
		driver.manage().window().maximize();
	        
	        
	        WebElement usernameInput = driver.findElement(By.id("text"));
	        usernameInput.sendKeys("AnubhavJha");
	        
			WebElement passwordInput = driver.findElement(By.id("password"));
			passwordInput.sendKeys("PASSWORD");
			
			WebElement loginButton = driver.findElement(By.id("login-button"));
			loginButton.click();
			Alert alert = driver.switchTo().alert();

		    // Click the OK button on the alert
		    alert.accept();

		    
		    // Switch back to the main window
		    driver.switchTo().defaultContent();
			
  }
  

  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is my before condition area");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is my post condition area");
	  
	  
  }

}
