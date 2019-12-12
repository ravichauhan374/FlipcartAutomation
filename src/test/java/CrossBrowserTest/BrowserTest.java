package CrossBrowserTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTest {
	WebDriver driver;
	String projectPath= System.getProperty("user.dir");

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		//Check if parameter passed from TestNG is 'firefox'
		Assert.assertEquals(browser, "firefox");
		{
			//create firefox instance
			System.setProperty("webdriver.firefox.marionette",projectPath+ "/software/geckodriver-v0.26.0-win32.zip");
			driver = new FirefoxDriver();
		}
		//Check if parameter passed as 'chrome'
		Assert.assertEquals(browser, "chrome");{
			//set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver",projectPath+"/software/chromedriver_win32 (1).zip");
			//create chrome instance
			driver = new ChromeDriver();
		}
		//Check if parameter passed as 'Edge'
		Assert.assertEquals(browser, "IE");{
			//set path to Edge.exe
			System.setProperty("webdriver.edge.driver",projectPath+"/software/IEDriverServer_Win32_2.39.0.zip");
			//create Edge instance
			driver = new IEDriver();
		}
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testParameterWithXML() throws InterruptedException{
		
		driver.get("wwww.flipcart.com");
		//Find login and signUp
		driver.findElement(By.xPath(contains(@class,"dHGf8")).click();
		//find Enter email and password and enter Email/number
		WebElement login=driver.findElement(By.xPath(//input[contains(@class,'_2zrpKA _1dBPDZ')).sendKeys("9179736309");
				//Find password and Enter Password
				WebElement password = driver.findElement(By.xPath(//input[contains(@class,"_2zrpKA _3v41xv _")).sendKeys("9179736309");
						//inspect search Box and search camera
						driver.findElement(By.xPath(//input[contains(@class,'LM6RPg')).sendKeys("camera");
								//Find element by link text and store in variable "Element"        		
								WebElement element1 = driver.findElement(By.linkText("Sony Cyber-shot DSC-RX100M3  (20.1 MP, 2.9 Optical Zoom, 44x Digital Zoom, Black)"));

								//This will scroll the page till the element is found		
								js.executeScript("arguments[0].scrollIntoView();", element1);
								element.click();
								//search add to cart button and add the element in cart
			                    driver.findElement(By.xPath(//input(contains(@class,'_2AkmmA _2Npkh4 _2MWPVK'))).click();
			                    //search place order 
			                    driver.findElement(By.xPath(//input(contains(@class,'_2AkmmA iwYpF9 _7UHT_c'))).click();
	                            //select radio button for selecting the address and click  
	                            WebElement radio=driver.findElement(By.class("_6ATDKp"));
	                            if(radio.isSelected)
	                            		{
	                            	driver.findElement(driver.findElement(By.linkText("deliver here"))).click();
	                            		}
	                            else {
	                            	radio.click();
	                            	driver.findElement(driver.findElement(By.linkText("deliver here"))).click();
	                            }
	        
	                            
	}
	@AfterTest
	{
		driver.close();
        driver.quit();
	}
}

}


