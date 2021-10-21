package session1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleLogin {

	
	public static void main(String[] args) throws InterruptedException {
		
		//Step 1: Launch Chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

		ChromeDriver driver = new ChromeDriver(); 
		
		//Step 2: Maximize window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Step 3: Load URL
		driver.get("https://www.linkedin.com/login");
		Thread.sleep(3000);
		
		//Step 4: Enter Username
		driver.findElementById("username").sendKeys("test");

		Thread.sleep(3000);
		
		//Step 5: Enter password
		driver.findElementById("password").sendKeys("test");
		Thread.sleep(3000);
		
		//Step 6: Click submit
		driver.findElementByXPath("//button[@type='submit']").click();
		Thread.sleep(3000);
		
		//Step 7: Close browser
		driver.quit();
		
		System.out.println("Success");

	}

}
