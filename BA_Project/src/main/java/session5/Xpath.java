package session5;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Xpath {
	
	@Test
	public void xpathExample(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/home.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[@href='pages/Edit.html']").click();
		driver.findElementByXPath("//input[@id='email']").sendKeys("mithra");
		driver.findElementByXPath("//input[contains(@value,'Clear')]").clear();
		driver.findElementByXPath("//input[starts-with(@value, 'Cle')]").sendKeys("ABC");
	String text1=	driver.findElementByXPath("//label[contains(text(),'Get default text entered')]").getText();
	String text2=	driver.findElementByXPath("//label[contains(text(),'Clear the text')]").getText();
	System.out.println(text1);
	System.out.println(text2);
		driver.close();
		driver.quit();
		
	}

}
