import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gettextvsgetattriubute {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
		 driver.get("http://admin-demo.nopcommerce.com/login");
		 
		 WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
    //		 email.clear();
		// email.sendKeys("ramdaskdm2012@gmail.com");
		 
	System.out.println(email.getAttribute("value"));
	
	System.out.println(email.getText());
	
	WebElement login=driver.findElement(By.xpath("//button[text()='Log in']"));
	
	System.out.println(login.getAttribute("type"));
	System.out.println(login.getAttribute("class"));
	
	System.out.println(login.getText());
	
	String gin=driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
	System.out.println(gin);

	}

}
