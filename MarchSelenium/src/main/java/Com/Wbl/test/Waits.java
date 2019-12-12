package Com.Wbl.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

	public static void main(String[] args) {
		System.out.println("opening a chrome browser");
		String ChromeDriverPath = "C:\\Users\\AMANDEEP\\Desktop\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",ChromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		email.sendKeys("Amandeep");
		driver.close();
		

	}

}
