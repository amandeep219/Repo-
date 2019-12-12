package Com.Wbl.test;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ChromeDriverPath = "C:\\Users\\AMANDEEP\\Desktop\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",ChromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Set<Cookie>co=driver.manage().getCookies();//will get all t he cookies from the browser//
		System.out.println(co.size());
		for(Cookie cookiesval:co) {//              //
			System.out.println(cookiesval.getName()+"  "+cookiesval.getValue());//print name and value of the cooki//
		}

	}

}
