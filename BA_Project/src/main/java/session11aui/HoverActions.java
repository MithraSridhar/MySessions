package session11aui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverActions {	

		public static void main(String[] args) throws InterruptedException {			
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.findElementByXPath("//button[@class='_2AkmmA _29YdH8']").click();
			WebElement ele = driver.findElementByXPath("//span[contains(text(),'Electronics')]");			
			Actions builder = new Actions(driver);
			builder.moveToElement(ele).build().perform();
			Thread.sleep(3000);			
			WebElement mobiles = driver.findElementByXPath("//span[contains(text(),'Mobiles')]");
			
			builder.click(mobiles).build().perform();
			System.out.println("success");
			
			
			
			
			
			
			
			
			
			
			
	}

}
