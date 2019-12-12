package Com.Wbl.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatirs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String ChromeDriverPath = "C:\\Users\\AMANDEEP\\Desktop\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",ChromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("email")).sendKeys("amandeepbajwa250@yahoo.com");//
		driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("amandeepbajwa250@yahoo.com");
		Thread.sleep(300);
        driver.close();
	}

}
