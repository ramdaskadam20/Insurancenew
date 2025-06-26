import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_dropdown_generic {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
		 driver.get("http://www.orangehrm.com/orangehrm-30-day-trial/");
		 
		 
		 WebElement country=driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
		 
		 Select s=new Select(country);
		 s.selectByIndex(4);
		 

	}

}
