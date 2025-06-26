import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_jquery {

	public static void main(String[] args) {
          WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver(); 
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.id("justAnInputBox")).click();
		  driver.findElement(By.xpath("//span[@data-id='2']")).click();
		  

	}

}
