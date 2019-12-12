package Com.Wbl.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {

	public static void main(String[] args) {
		System.out.println("opening a chrome browser");
		String ChromeDriverPath = "C:\\Users\\AMANDEEP\\Desktop\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",ChromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://whiteboxqa.com");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());

	}

}
