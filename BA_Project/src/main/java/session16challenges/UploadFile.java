package session16challenges;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UploadFile {
//For windows
	/*
	 * public static void main(String[] args) throws InterruptedException,
	 * AWTException { // opening Firefox browser
	 * System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
	 * ChromeDriver driver = new ChromeDriver(); // maximize the browser
	 * driver.manage().window().maximize(); // load the browser with url
	 * driver.get("https://my.naukri.com/account/register/basicdetails");
	 * 
	 * driver.findElementByXPath("//button[@title='I am a Professional']").click();
	 * //Thread.sleep(3000); // driver.findElementByName("uploadCV").click();
	 * 
	 * Thread.sleep(6000);
	 * 
	 * 
	 * // Store the copied text in the clipboard StringSelection stringSelection =
	 * new StringSelection("Desktop//payslip_July.pdf");
	 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,
	 * null);
	 * 
	 * // Paste it using Robot class Robot robot = new Robot();
	 * 
	 * // Enter to confirm it is uploaded robot.keyPress(KeyEvent.VK_CONTROL);
	 * robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_V);
	 * robot.keyRelease(KeyEvent.VK_CONTROL);
	 * 
	 * Thread.sleep(5000); robot.keyPress(KeyEvent.VK_ENTER);
	 * robot.keyRelease(KeyEvent.VK_ENTER);
	 * 
	 * }
	 */
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://my.naukri.com/account/register/basicdetails");
		  Thread.sleep(6000);
		  File file = new File("/Users/cb-mithra/Desktop/payslip_July.pdf");
				  
	    StringSelection stringSelection= new StringSelection(file.getAbsolutePath()) ;
	  //Copy to clipboard 
	    
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	    
	    Robot robot = new Robot() ;
	     
	    // Cmd + Tab is needed since it launches a Java app and the browser looses focus
		/*
		 * robot.keyPress(KeyEvent.VK_META);
		 * 
		 * robot.keyPress(KeyEvent.VK_TAB);
		 * 
		 * robot.keyRelease(KeyEvent.VK_META);
		 * 
		 * robot.keyRelease(KeyEvent.VK_TAB);
		 */
	     
	    robot.delay(500);
	     
	    //Open Goto window
	     
	    robot.keyPress(KeyEvent.VK_META);
	     
	    robot.keyPress(KeyEvent.VK_SHIFT);
	     
	    robot.keyPress(KeyEvent.VK_G);
	     
		/*
		 * robot.keyRelease(KeyEvent.VK_META);
		 * 
		 * robot.keyRelease(KeyEvent.VK_SHIFT);
		 * 
		 * robot.keyRelease(KeyEvent.VK_G);
		 */
	     
	    //Paste the clipboard value
	     
	    robot.keyPress(KeyEvent.VK_META);
	     
	    robot.keyPress(KeyEvent.VK_V);
	     
		/*
		 * robot.keyRelease(KeyEvent.VK_META);
		 * 
		 * robot.keyRelease(KeyEvent.VK_V);
		 */
	     
	    //Press Enter key to close the Goto window and Upload window
	     
	    robot.keyPress(KeyEvent.VK_ENTER);
	     
	    robot.keyRelease(KeyEvent.VK_ENTER);
	     
	    robot.delay(500);
	     
		/*
		 * robot.keyPress(KeyEvent.VK_ENTER);
		 * 
		 * robot.keyRelease(KeyEvent.VK_ENTER);
		 */
	}
	

}
