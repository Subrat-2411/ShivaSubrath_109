package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTagName {
public static void main(String[] args) throws InterruptedException  {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		String tagname = driver.findElement(By.linkText("Register")).getTagName();
		System.out.println("tag name of Register");
		driver.close();
		}
}



