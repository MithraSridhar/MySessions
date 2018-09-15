package session1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Step 1: Launch Chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Step 2: Maximize window
		driver.manage().window().maximize();
		
		//Step 3: Load URL
		driver.get("http://book.theautomatedtester.co.uk/chapter1");
		
		//Step4: Select drop down
				//Storing the element as the webelement using WebElement class
				WebElement source = driver.findElementById("selecttype");
				//converting it to dropdown element using Select class
				Select dropdown =new Select(source);
				Thread.sleep(2000);
				dropdown.selectByIndex(1);
				Thread.sleep(3000);
				dropdown.selectByValue("Selenium RC");
				Thread.sleep(3000);
				dropdown.selectByVisibleText("Selenium Grid");
				Thread.sleep(2000);
				System.out.println("Success");
				driver.quit();
	}

}
