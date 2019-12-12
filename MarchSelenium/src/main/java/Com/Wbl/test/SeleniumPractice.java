package Com.Wbl.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","C:\\Users\\AMANDEEP\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://whiteboxqa.com");
        //System.out.println(driver.getTitle());//This command return the title of current page//
       // System.out.println(driver.getCurrentUrl());//
        //System.out.println(driver.getPageSource());//
        Thread.sleep(3000);
        driver.close();
        
       }

}
