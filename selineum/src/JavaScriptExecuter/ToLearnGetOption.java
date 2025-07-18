package JavaScriptExecuter;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetOption {
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/user/Desktop/cars.html");
		
		WebElement cars = driver.findElement(By.id("cars"));
		Select carssel=new Select(cars);
		List<WebElement> alloptions = carssel.getOptions();
		System.out.println(alloptions.size());
		
		for(WebElement ele:alloptions) {
			System.out.println(ele.getText());
		
			
		}
	}

}
