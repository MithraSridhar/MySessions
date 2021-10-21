package session5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunTimeExc {

	public static void main(String[] args) throws Exception {
	
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
				try {
					driver.findElementById("username").sendKeys("test");			
				}
				catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {

					  // Take screen shot and save it to file name src File src =
					File src =  driver.getScreenshotAs(OutputType.FILE);
					  
					  // create new file dest in the project folder to copy the screen shot taken
					  File destFile = new File("./reports/images/snap.jpg");
					  
					  // Copy file from src to dest file created inside project folder
					  FileUtils.copyFile(src, destFile);
				}

				Thread.sleep(3000);
				
				//Step 5: Enter password
				driver.findElementById("password").sendKeys("test");
				Thread.sleep(3000);
				
				//Step 6: Click submit
				driver.findElementByXPath("//button[@type='submit']").click();
				Thread.sleep(3000);
				
		String text=driver.findElementByXPath("//div[@id='error-for-username']").getText();
		if(text.contains("passwrod")) {
			System.out.println("Success");
			}
		else {
			throw new Exception();
		}
				//Step 7: Close browser
				driver.quit();
				
			

	}

}
