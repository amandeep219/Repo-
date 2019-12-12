package Com.Wbl.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumP {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("opening a chrome browser");
		String ChromeDriverPath = "C:\\Users\\AMANDEEP\\Desktop\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",ChromeDriverPath);
		WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com");
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("Amandeep");
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("talnetscreen");
        Thread.sleep(200);
        driver.close();
        

	}

}
