package APMtest.APMtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import io.appium.java_client.android.AndroidDriver;

/**
 * Hello world!
 *
 */
public class LoginTest 
{
	
	    public static AndroidDriver driver;
	    public WebDriverWait wait;
	    
	    @BeforeClass
	    public static void setup() throws MalformedURLException {
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "3c6aaa8f0006");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("platformVERSION", "10");
	        caps.setCapability("skipUnlock", "true");
	        caps.setCapability("appPackage", "com.truecaller");
	        caps.setCapability("appActivity", ".ui.TruecallerInit");
	        caps.setCapability("noReset", "false");
	        caps.setCapability("autoDissmissAlerts", "true");
	        caps.setCapability("autoGrantPermissions", "true");
	        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	        //wait = new WebDriverWait(driver, 10);
	}
	    @Test
	    public void basicTest() throws InterruptedException {
	    	WebElement getStarted=driver.findElement(By.id("com.truecaller:id/nextButton"));
	    	getStarted.click();
	    	Thread.sleep(3000); //Waiting for next activity to load//
	    	driver.findElement(By.xpath(".//android.widget.Button[@text='CANCEL']")).click();
	    	Thread.sleep(10000); //Waiting for next activity to load//
	    	driver.findElement(By.xpath(".//android.widget.Button[@text='MAYBE LATER']")).click();
	    	Thread.sleep(3000); //Waiting for next activity to load//
	    	driver.findElement(By.id("com.truecaller:id/button_skip")).click();
	    	Thread.sleep(2000); //Waiting for next activity to load//
	    	driver.findElement(By.id("com.truecaller:id/next")).click();
	    	Thread.sleep(2000); //Waiting for next activity to load//
	    	driver.findElement(By.id("com.truecaller:id/next")).click();
	    	Thread.sleep(2000); //Waiting for next activity to load//
	    	driver.findElement(By.id("com.truecaller:id/next")).click();
	    	Thread.sleep(2000); //Waiting for next activity to load//
	    	driver.findElement(By.id("com.truecaller:id/next")).click();
	    	Thread.sleep(5000); //Waiting for Dash board screen//
	    }
	    @AfterClass
	    public static void teardown(){
	    	//close the app
	    	driver.quit();
	    }
	}


