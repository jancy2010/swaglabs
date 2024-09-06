package BasePkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
String baseurl="https://www.saucedemo.com";
@BeforeTest
public void setUp() {
	driver = new ChromeDriver();
	driver.get(baseurl);
	driver.manage().window().maximize();
}

}
