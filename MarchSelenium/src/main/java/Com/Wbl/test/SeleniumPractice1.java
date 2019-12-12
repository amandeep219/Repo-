package Com.Wbl.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice1 {

	public static void main(String[] args) throws InterruptedException {
		String ChromeDriverPath = "C:\\Users\\AMANDEEP\\Desktop\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("Webdriver.driver.chrome",ChromeDriverPath);
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement userId = driver.findElement(By.xpath("//input[@id='email]"));
		//WEbElement is class and userId is object(reference variable)//
	    userId.sendKeys("amandeepbajwa250@yahoo.com");
	    
				
		
		
		

	}

}
