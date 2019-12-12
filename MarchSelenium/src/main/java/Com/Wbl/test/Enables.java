package Com.Wbl.test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enables {

	public static void main(String[] args) {
		System.out.println("opening a chrome browser");
		String ChromeDriverPath = "C:\\Users\\AMANDEEP\\Desktop\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",ChromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	
		//System.out.println(driver.findElement(ById.xpath("//*[@id=\"email\"]")).isDisplayed());//
		//System.out.println(driver.findElement(ById.xpath("//*[@id=\"email\"]")).isEnabled());//
		
		//WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]")).isDisplayed());//
        //WebElement password=driver.findElement(By.xpath("//*[@id=\"pass\"]")).isEnabled());//
		//if(driver.findElement(By.xpath("//*[@id=\"u_0_s\"]/span[1]/label")).isSelected()==false);//
		
		driver.findElement(By.xpath("//*[@id=\"u_0_s\"]/span[1]/label")).click();
		
		
	}

}
