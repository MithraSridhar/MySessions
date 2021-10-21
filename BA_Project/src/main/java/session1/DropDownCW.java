package session1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCW {

	public static void main(String[] args) {
		
			// Step 1: Launch Chrome
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
				ChromeDriver driver = new ChromeDriver();

				// Step 2: Maximize window
				driver.manage().window().maximize();
				
			//	driver.manage().window().setSize(size.Dimension);
				double size =23.45;
				
				
				
				
				
				// Step 3: Load URL
				driver.get("http://the-internet.herokuapp.com/dropdown");
				
				//step4: Identify the drop down 
				WebElement dropdown = driver.findElementByXPath("//select[@id='dropdown']");
				
				Select option = new Select(dropdown);
				
				//way 1 : using index				
				option.selectByIndex(1);
				
				//way 2: using value
				option.selectByValue("1");
				
				//way3: using visible text
				option.selectByVisibleText("Option 2");
				
				option.deselectAll();
				
				option.deselectByIndex(1);
	}

}
