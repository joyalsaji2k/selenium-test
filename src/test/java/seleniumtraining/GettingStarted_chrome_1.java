package seleniumtraining;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingStarted_chrome_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arya pv\\softwaretesting\\driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();					
        		
        String baseUrl = "http://www.kaushalya.tech/";					
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println("title is "+title);

	}

}
