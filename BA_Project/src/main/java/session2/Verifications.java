package session2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifications {

	public static void main(String[] args) throws InterruptedException {
		
		// Step1: Launch Chrome
		
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
						
		//Step2: Load URL
				driver.get("http://thedemosite.co.uk/login.php");
				
		//Step3: Maximize window
				driver.manage().window().maximize();
		
		//Step4: Get page title
				String Title = driver.getTitle();
				
		//Step5: Get current URL
				String URL = driver.getCurrentUrl();
				
		//Step6: Get page source
				String Pagesource = driver.getPageSource();
				
		//Step7: Get Attribute
				WebElement element = driver.findElementByName("username");
				String Attribute = element.getAttribute("name");
				String text1 = element.getText();
				
		//Step8: Get CSS value
				String CSS = element.getCssValue("font");
				
		//Step9: Get text
				WebElement element1 = driver.findElementByLinkText("Click here to view the PHP and JavaScript code");
		        String text = element1.getText();
		        
		//Step10: Get location
		        Point location = element.getLocation();
		        
		//Step11: Get Size
		        Dimension size = element.getSize();
		        
		//Step12: Get tag name
		        String tagname = element.getTagName();
		        
       //Step13: Print all outputs
				System.out.println("Title is :" +Title);
				System.out.println("URL is :" +URL);
				System.out.println("Page source is :" +Pagesource);
				System.out.println("Attribute is :" +Attribute);
				System.out.println("CSS is :" +CSS);
				System.out.println("Text is :" +text);
				System.out.println("Location is :" +location);
				System.out.println("Size is :" +size);
				System.out.println("Tag Name is :" +tagname);
				System.out.println("Text is :" +text1);
				
	   //Step14: Close browser and driver instance
				driver.close();
				driver.quit();
			}

}
