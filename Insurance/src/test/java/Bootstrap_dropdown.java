import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrap_dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
		 driver.get("https://www.hdfcbank.com/");
		 
		 driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
		 
		 
		 List<WebElement> alloptions=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		 
		 System.out.println(alloptions.size());
		 
		 for(WebElement op:alloptions)
		 {
			 //System.out.println(op.getText());
			 if(op.getText().equals("Deposits"))
			 {
				 op.click();
				 break;
			 }
			
		 }
		 driver.findElement(By.xpath("(//a[@class='btn-primary dropdown-toggle btn-block'])[2]")).click();
    List<WebElement> pro=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		 
		 System.out.println(pro.size());
		 
		 for(WebElement opt:pro)
		 {
			 //System.out.println(op.getText());
			 if(opt.getText().equals("Recurring Deposit"))
			 {
				 opt.click();
				 break;
			 }
			
		 } 
		 

	}

}
