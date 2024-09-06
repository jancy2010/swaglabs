package PagePkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class LoginPage {

	WebDriver driver;	
	@FindBy(xpath = "//*[@id=\"user-name\"]")
	WebElement userId;	
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement password;	
	@FindBy(xpath = "//*[@id=\"login-button\"]")
	WebElement submit;
	 public LoginPage(WebDriver driver){
		 this.driver= driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void setData(String un, String psd) {
		 userId.clear();
		 userId.sendKeys(un);
		 password.clear();
		 password.sendKeys(psd);
	 }
	 public void submitClick() {
		 submit.click();	 }
	 
	
	@FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[3]/a")
	WebElement cartIcon;
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div/div/div/button")
	List<WebElement> buttons;
	
	
	public void addToCart() {
	
		
		//List<WebElement> buttons=driver.findElements(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/div/div/button"));
		System.err.println(buttons.size());
		for(WebElement li: buttons) {
			li.click();
		}		cartIcon.click();
	}
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[2]/button[2]")
	WebElement checkout;
	public void checkOutClick() {
		checkout.click();
	}
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/form/div[1]/div[1]/input")
	WebElement fname;
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/form/div[1]/div[2]/input")
	WebElement lname;
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/form/div[1]/div[3]/input")
	WebElement zip;
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/form/div[2]/input")
	WebElement next;
	
	public void fillform(String fn, String ln, String zc) {
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		zip.sendKeys(zc);
		next.click();
		driver.navigate().back();
		
		
	}
	@FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]")
	WebElement hambutton;
	@FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")
	WebElement logoutbutton;
	
	
	
	public void logout() throws InterruptedException {
		hambutton.click();
		Thread.sleep(30);
		logoutbutton.click();
	}
	
		
}
