package TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tc1 {
	 WebDriver driver;
		@Test
        public void launch() {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.get("https://www.edureka.co/");
		  //validations on that page
		  driver.close();
		}
  }

