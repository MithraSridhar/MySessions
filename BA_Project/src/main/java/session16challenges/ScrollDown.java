package session16challenges;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.Test;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// opening Firefox browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		
//		WebDriverEventListener
		// load the browser with url
		driver.get("http://my.naukri.com/manager/createacc2.php?&othersrcp=7304&wExp=N&gclid=CjwKEAiAmY-3BRDh7pjvg46p1iYSJADQ78gNKinI8UQq81_b394vuaJHgRSuZFAljcR667JrhsxmBhoCMz_w_wcB");
		
		((JavascriptExecutor) driver).executeScript("scroll(0,1050);");
		((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         

	}

}
