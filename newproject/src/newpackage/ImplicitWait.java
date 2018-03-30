package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ImplicitWait {
public static void main(String[] args)
{
	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
    driver.get("http://www.indeed.co.in");
  //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(By.id("what")).sendKeys("Automation Testing");
    driver.findElement(By.id("where")).clear();
    driver.findElement(By.id("where")).sendKeys("Bangalore");
    driver.findElement(By.id("fj")).click();
    driver.findElement(By.xpath("//a[@data-tn-element='jobTitle']")).click();
}


	
}

