import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Status_Element {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		//isDisplayed and isEnabled
		
		WebElement search=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		System.out.println("Display status:"+search.isDisplayed());
		
		System.out.println("Display status:"+search.isEnabled());
		
		WebElement gender=driver.findElement(By.xpath("//input[@id='gender-male']"));
		gender.click();
		System.out.println("selection status:"+gender.isSelected());
		
	}

}
