package session1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 1: Launch Chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Step 2: Maximize window
		driver.manage().window().maximize();
		
		//Step 3: Load URL
		driver.get("http://thedemosite.co.uk/login.php");
		
		//Step 4: Enter Username
		driver.findElementByName("username").sendKeys("test");
		
		//Step 5: Enter password
		driver.findElementByName("password").sendKeys("test");
		
		//Step 6: Click submit
		driver.findElementByName("FormsButton2").click();
		
		System.out.println("Success");

	}

}
