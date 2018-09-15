package session2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooleanMethods {

	public static void main(String[] args) {
// Step1: Launch Chrome
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
						
//Step2: Load URL
		driver.get("http://book.theautomatedtester.co.uk/chapter1");
		
//Step3: Maximize window
		driver.manage().window().maximize();
		
//Step4: Check whether web element is displayed
		WebElement element = driver.findElementById("selecttype");
		Boolean Display = element.isDisplayed();
		
//Step5: Check whether the radio button is selected or not
		WebElement element1 = driver.findElementById("radiobutton");
		Boolean Selected = element1.isSelected();
		
//Step6: Check whether web element is enabled
		driver.get("http://book.theautomatedtester.co.uk/");
		WebElement element2 = driver.findElementById("q");
		Boolean Enable = element2.isEnabled();
		
//Step7: Print all outputs
		System.out.println("Display is :" +Display);
		System.out.println("Selected is :" +Selected);
		System.out.println("Enable is :" +Enable);
		
//Step8: Close browser and driver instance
					driver.close();
					driver.quit();
	}

}
