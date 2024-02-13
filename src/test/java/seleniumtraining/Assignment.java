package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment {
  @Test
  public void openSampleWebsite() {
	  System.out.println("verifyTitle");
		System.setProperty("webdriver.gecko.driver", "/home/kjsdc/Downloads/geckodriver-v0.34.0-win64/geckodriver.exe");
	  	WebDriver driver = new ChromeDriver();
	    String baseUrl = "https://raghuprasadks.github.io/samplewebsite/";					
	    driver.get(baseUrl);
	    String actualTitle = driver.getTitle();
	    String expectedTitle = "Test Automation Practice Web Site";      
	    Assert.assertEquals(actualTitle, expectedTitle);
//	    driver.close();
  }
 @Test(priority=2)
  public void openContact() {
	  System.out.println("openContact");
     System.setProperty("webdriver.gecko.driver", "/home/kjsdc/Downloads/geckodriver-v0.34.0-win64/geckodriver.exe");
	  	WebDriver driver = new ChromeDriver();
	    String baseUrl = "https://raghuprasadks.github.io/samplewebsite/contact.html";					
	    driver.get(baseUrl);

	    WebElement pageTitle = driver.findElement(By.tagName("h1"));
	    String actualTitle = pageTitle.getText();
	    String expectedTitle = "Contact Us";
	    Assert.assertEquals(actualTitle, expectedTitle);
//	    driver.close();
}
 @Test(priority=3)
 public void openLogin() {
	  System.out.println("openLogin");
     System.setProperty("webdriver.gecko.driver", "/home/kjsdc/Downloads/geckodriver-v0.34.0-win64/geckodriver.exe");
	  	WebDriver driver = new ChromeDriver();
	    String baseUrl = "https://raghuprasadks.github.io/samplewebsite/login.html";					
	    driver.get(baseUrl);
	    
	    WebElement email = driver.findElement(By.name("email"));
      email.sendKeys("testuser1@gmail.com"); 
      WebElement password = driver.findElement(By.id("password"));
      password.sendKeys("test@1");
      
      WebElement btn = driver.findElement(By.xpath("/html/body/div/form/button\r\n"));
      btn.click();
	    
      String actualMessage = driver.switchTo().alert().getText();	    
	    String expectedMessage = "invalid user";
	    Assert.assertEquals(actualMessage, expectedMessage);
	    
}
 @Test(priority=4)
 public void login() {
	  System.out.println("openLogin");
     System.setProperty("webdriver.gecko.driver", "/home/kjsdc/Downloads/geckodriver-v0.34.0-win64/geckodriver.exe");
	  	WebDriver driver = new ChromeDriver();
	    String baseUrl = "https://raghuprasadks.github.io/samplewebsite/login.html";					
	    driver.get(baseUrl);
	    
	    WebElement email = driver.findElement(By.name("email"));
      email.sendKeys("joyal@gmail.com");
      WebElement password = driver.findElement(By.id("password"));
      password.sendKeys("test@123");
      
      WebElement btn = driver.findElement(By.xpath("/html/body/div/form/button\r\n"));
      btn.click();
	    
      String actualMessage = driver.switchTo().alert().getText();	    
	    String expectedMessage = "valid user";
	    Assert.assertEquals(actualMessage, expectedMessage);
	    
}
 @Test(priority=5)
 public void register() {
	  System.out.println("openRegistration");
     System.setProperty("webdriver.gecko.driver", "/home/kjsdc/Downloads/geckodriver-v0.34.0-win64/geckodriver.exe");
	  	WebDriver driver = new ChromeDriver();
	    String baseUrl = "https://raghuprasadks.github.io/samplewebsite/register.html";					
	    driver.get(baseUrl);
	    
	  WebElement name = driver.findElement(By.id("name"));
      name.sendKeys("joyal");

      WebElement email = driver.findElement(By.name("email"));
      email.sendKeys("joyal@gmail.com");
      WebElement mobile = driver.findElement(By.id("mobile"));
      mobile.sendKeys("8080808080");
      
      WebElement password = driver.findElement(By.id("password"));
      password.sendKeys("joyal@123");
      
      WebElement gender = driver.findElement(By.id("female"));
      gender.click();
      WebElement ug = driver.findElement(By.id("ug"));
      ug.click();
      WebElement pg = driver.findElement(By.id("pg"));
      pg.click();
      
      WebElement dob = driver.findElement(By.id("bob"));
      dob.sendKeys("14-04-2002");
      
      Select loc = new Select(driver.findElement(By.id("location")));
      loc.selectByVisibleText("Mysuru");
      
      WebElement info = driver.findElement(By.xpath("//*[@id=\"additonal\"]\r\n"));
      info.sendKeys("Nil");
      
      WebElement btn = driver.findElement(By.xpath("/html/body/div/form/input[11]"));
      btn.click();
      
      WebElement pageTitle = driver.findElement(By.tagName("h1"));
	    String actualTitle = pageTitle.getText();
	    String expectedTitle = "Registration successful";
	    Assert.assertEquals(actualTitle, expectedTitle);
//	    driver.close();
}
@Test(priority=6)
 public void OpenRegister() {
	  System.out.println("openRegistration");
    System.setProperty("webdriver.gecko.driver", "/home/kjsdc/Downloads/geckodriver-v0.34.0-win64/geckodriver.exe");
	  	WebDriver driver = new ChromeDriver();
	    String baseUrl = "https://raghuprasadks.github.io/samplewebsite/register.html";					
	    driver.get(baseUrl);
	    
	    WebElement name = driver.findElement(By.id("name"));
      name.sendKeys("joyal");

      WebElement email = driver.findElement(By.name("email"));
      email.sendKeys("joyal@gmail.com");
      WebElement mobile = driver.findElement(By.id("mobile"));
      mobile.sendKeys("8080808080");
      
      WebElement password = driver.findElement(By.id("password"));
      password.sendKeys("joyal@123");
      
      WebElement gender = driver.findElement(By.id("female"));
      gender.click();
      WebElement ug = driver.findElement(By.id("ug"));
      ug.click();
      WebElement pg = driver.findElement(By.id("pg"));
      pg.click();
      
      WebElement dob = driver.findElement(By.id("bob"));
      dob.sendKeys("14-04-2002");
      
      Select loc = new Select(driver.findElement(By.id("location")));
      loc.selectByVisibleText("Mysuru");
      
      WebElement info = driver.findElement(By.xpath("//*[@id=\"additonal\"]\r\n"));
      info.sendKeys("Nil");
      
      WebElement btn = driver.findElement(By.xpath("/html/body/div/form/input[11]"));
      btn.click();
      
      WebElement pageTitle = driver.findElement(By.tagName("h1"));
	    String actualTitle = pageTitle.getText();
	    String expectedTitle = "Registration successful";
	    Assert.assertEquals(actualTitle, expectedTitle);
//	    driver.close();
}
}