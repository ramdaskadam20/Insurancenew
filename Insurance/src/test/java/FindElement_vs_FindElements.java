import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement_vs_FindElements {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://demo.nopcommerce.com/");
		 
		 //findElement
		 //1
		 WebElement search=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		 search.sendKeys("Ramdas");
		 
		 //2
		 
		 WebElement links=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		 
		 System.out.println("all links:"+links.getText());
		 
		 //3--No such element exception
     //WebElement ele=driver.findElement(By.xpath("//input[@id='small-login']"));
		 
		 
		 
		 
		 /*List<WebElement> alllinks=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		 System.out.println("all links:"+alllinks.size());
		
		 
		 for (WebElement all:alllinks)
			 
		 {
			
			 System.out.println(all.getText()); 
		 } */
		 
		 //4-no such-0
		 
		 List<WebElement> eler=driver.findElements(By.xpath("//img[contains(title,'Electronics')]"));
		 System.out.println("all links:"+eler.size());
		
		 
		 for (WebElement all:eler)
			 
		 {
			
			 System.out.println(all.getText()); 
		 } 
		 
		 driver.close();
	}

}
