package session3;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandles {

	public static void main(String[] args) {
		// 1. Launch chrome web browser
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				//System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");

		        //FirefoxDriver driver = new FirefoxDriver();
				// 2. Synchronization and Maximize
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

				// Load URL
				driver.get("http://the-internet.herokuapp.com/windows");
				driver.findElementByLinkText("Click Here").click();
				
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				
				Set<String> windows = driver.getWindowHandles();
				for (String eachwindow : windows) {
					driver.switchTo().window(eachwindow);
				}
				
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				
				driver.close();
				windows = driver.getWindowHandles();
				for (String eachwindow : windows) {
					driver.switchTo().window(eachwindow);				
				}
				
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close();
				driver.quit();
	}


}
