package demo99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class login_page
{
	
	@Test
	public void login() 
	{
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/v4/");
		driver.findElement(By.name("uid")).sendKeys("mngr120697");
		driver.findElement(By.name("password")).sendKeys("EsadUnE");
		driver.findElement(By.name("btnLogin")).click();
		String title;
		title=driver.getTitle();
		System.out.println(title);
		
	}
	

}
