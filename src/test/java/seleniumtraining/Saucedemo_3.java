package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arya pv\\softwaretesting\\driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.saucedemo.com/v1/";					
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println("title is "+title);
        
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        
        WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        login.click();
        
        WebElement button = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));
        button.click();
        
        WebElement button1 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button\r\n"));
        button1.click();
        
        WebElement cart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
        cart.click();
        
        WebElement check = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]"));
        check.click();
        
        WebElement firstname = driver.findElement(By.id("first-name"));
        firstname.sendKeys("secret_sauce");
        WebElement lastname = driver.findElement(By.id("last-name"));
        lastname.sendKeys("secret");
        WebElement postcode = driver.findElement(By.id("postal-code"));
        postcode.sendKeys("560077");
        
        WebElement conti = driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input"));
        conti.click();
        
        WebElement finish = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]"));
        finish.click();
        
	}

}
