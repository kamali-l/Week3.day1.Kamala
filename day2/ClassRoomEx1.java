package week3.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomEx1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
		driver.manage() .window() .maximize();
		
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		
		links.get(0).click();
		
		driver.getTitle();
		
		driver.navigate().back();
		
		java.util.List<WebElement> links2 = driver.findElements(By.tagName("a"));
		
		System.out.println(links2.size());
		
		System.out.println(links2.get(1).getAttribute("src"));
	
	
	}

}
