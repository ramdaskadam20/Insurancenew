import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_browser {

	public static void main(String[] args) {
		
		//chrome
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		//Edge
//        WebDriverManager.edgedriver().setup();
//		
//		WebDriver driver=new EdgeDriver();
		
	    driver.get("https://www.google.com/");
		
	    String title=driver.getTitle();
	    System.out.println("title of web page:"+title);
	    //System.out.println("pagesource:"+driver.getPageSource());
		

	}

}
