package session3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAlert {

	public static void main(String[] args) {
		// 1. Launch chrome web browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();

				// 2. Synchronization and Maximize
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

				// Load URL                 
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

				// To get inside particular frame
				driver.switchTo().frame("iframeResult");

				// To find an element "Try button" inside the frame and click
				driver.findElementByXPath("/html/body/button").click();

				// Switch to alert and enter text and close
				driver.switchTo().alert().sendKeys("Mithra");
				driver.switchTo().alert().accept();

				// Get the text and store it in the string and check whether my name is present or not
				String text = driver.findElementByXPath("//*[@id='demo']").getText();
				if (text.contains("Mithra")) 
				{
					System.out.println("The Text contains my name");
					System.out.println(text);
				} 
				else 
				{
					System.out.println("The text does not contains my name");
				}
		driver.close();
		driver.quit();
			}

}
