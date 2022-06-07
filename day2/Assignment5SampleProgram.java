package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment5SampleProgram {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager .chromedriver() .setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.ajio.com/");
		
		driver.manage() .window() .maximize();
		
		WebElement search = driver.findElement(By.name("searchVal"));
		
		search.sendKeys("bags");
		
		search.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		Thread.sleep(3000);
		
		String bagCount = driver.findElement(By.xpath("//div[@class = 'filter']/div[@class = 'length']")).getText();
		
		System.out.println("Count of items found: " + bagCount);
		
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class = 'brand']"));
		
		System.out.println(brands.size());
		
		for (int i=0; i<brands.size(); i++)
		{
			WebElement element = brands.get(i);
			System.out.println(element.getText());
		}	
	}
}
