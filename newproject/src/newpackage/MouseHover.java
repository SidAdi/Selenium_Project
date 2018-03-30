package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/");
		
		//Actions action=new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath(".//*[@id='primary-menu']/li[2]/a/span[1]/span/span")));
        //action.sendKeys(Keys.ARROW_DOWN);
        //action.sendKeys(Keys.ARROW_DOWN);
        //action.sendKeys(Keys.ENTER);
        //action.click();
         // action.perform();
		Thread.sleep(5000);
		//To handle Mouse Actions
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='primary-menu']/li[8]/a/span[1]/span/span")));
		action.contextClick(driver.findElement(By.xpath("	.//*[@id='primary-menu']/li[8]/ul/li[1]/a/span[2]")));
		//action.doubleClick(onElement);
		
		action.sendKeys(Keys.ARROW_DOWN);
		action.sendKeys(Keys.ARROW_DOWN);
		action.sendKeys(Keys.ENTER);
		
		action.click();
		
		//mandatory method should be called
		action.perform();
        
	}
	
	
}