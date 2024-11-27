package fitpeoassesment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Automation {
@Test
public void assesment() throws InterruptedException
{
	 System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	  driver.navigate().to("https://www.fitpeo.com/");
	  WebElement rev = driver.findElement(By.xpath("(//div[@class='satoshi MuiBox-root css-5ty6tm'])[5]"));
	  rev.click();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  WebElement ele = driver.findElement(By.xpath("//div[@class='MuiBox-root css-19zjbfs']"));
	  js.executeScript("arguments[0].scrollIntoView()", ele);
	Actions a = new Actions(driver);
	WebElement text = driver.findElement(By.xpath("//span[@class='MuiSlider-track css-10opxo5']"));
	System.out.println("default min of location"+text.getLocation());
	a.moveToElement(text).clickAndHold().moveByOffset(108, 0).release().perform();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  WebElement text1  = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
	 Thread.sleep(2000);
	text1.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(2000);
	text1.sendKeys(Keys.BACK_SPACE);
	text1.sendKeys("560");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement text2 = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	text2.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(2000);
	text2.sendKeys(Keys.BACK_SPACE);
	text2.sendKeys("820");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebDriverWait ew=new WebDriverWait(driver, 10);
	ew.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-invalid='false']")));
	 JavascriptExecutor ts=(JavascriptExecutor)driver;
	 WebElement scrl = driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 inter css-1s3unkt']"));
	 ts.executeScript("arguments[0].scrollIntoView()", scrl);
	 Thread.sleep(2000);
	 WebElement check = driver.findElement(By.xpath("(//input[@data-indeterminate='false'])[1]"));
	 check.click();
	 Thread.sleep(2000);
	 WebElement check1 = driver.findElement(By.xpath("(//input[@data-indeterminate='false'])[2]"));
	 check1.click();
	 Thread.sleep(2000);
	 WebElement check2= driver.findElement(By.xpath("(//input[@data-indeterminate='false'])[3]"));
	 check2.click();
	 Thread.sleep(2000);
	 WebElement check3 = driver.findElement(By.xpath("(//input[@data-indeterminate='false'])[8]"));
	 check3.click();
	 Thread.sleep(2000); 
 }
}

