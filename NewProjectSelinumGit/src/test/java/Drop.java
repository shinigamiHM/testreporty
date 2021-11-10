
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class Drop {
	
	@org.junit.Test

	public void DragandDrop() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");

		String url = "https://demo.guru99.com/test/drag_drop.html";
		
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

	 WebElement target = driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
	 
	 Actions DragandDrop = new Actions(driver);
	 
	 Actions act =  DragandDrop.moveToElement(target);
			 
				//.clickAndHold(target)   
				//.release(target)
				//.build()
				//;

		//act.perform();

	 
		

		// TODO Auto-generated method stub

	}



}

