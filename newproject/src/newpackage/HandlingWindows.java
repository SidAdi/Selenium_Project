package newpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindows {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.rediff.com/");
		System.out.println("the title of the page is:"+driver.getTitle());
		
		driver.switchTo().frame("moneyiframe");
		driver.findElement(By.id("query")).sendKeys("TCS");
		driver.findElement(By.xpath(".//*[@id='get_quote']/div/div[2]/div")).click();
		driver.switchTo().defaultContent();
		System.out.println("The title of the page is:"+driver.getTitle());
		
		String parent=driver.getWindowHandle();        //gives the name of the window which has focus
		System.out.println("Name of the window which has focus"+parent);
		
		Set<String> wset=driver.getWindowHandles();    //wlist has parent and child
		System.out.println("No of window which has focus:"+wset.size());
		
		for(String child:wset)
		{
			if(!(child.equals(parent)))
			{
				driver.switchTo().window(child);
				if(driver.getTitle().contains("Tata"))
				{
			System.out.println(driver.findElement(By.id("ltpid")).getText());
			break;
			}
				driver.switchTo().window("parent");
				System.out.println(driver.getTitle());
		}
		
		
		
	}
	}
}
