package session5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFrameCount {
	@Test
	public void frameCount() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> framelist = driver.findElementsByTagName("iframe");
		Thread.sleep(3000);
		int size = framelist.size();
		System.out.println(size);
		driver.close();
		driver.quit();		
	}
}
