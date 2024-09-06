package TestPkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import PagePkg.LoginPage;

import UtilityPkg.ExcelUtilities;

public class LoginTest extends BaseClass{
	@Test
	public void SwagLoginTest() throws InterruptedException {
	LoginPage ob= new LoginPage(driver);	
	String x1="C:\\Users\\jubin\\Desktop\\swaglabsdemo.xlsx";
	String s1="Sheet1";
    int rc=ExcelUtilities.getCellCount(x1, s1);	
	for(int i=0;i<= rc; i++) {
		String un=ExcelUtilities.getValue(x1, s1, i, 0);
		System.out.println("user id "+i+" = "+un);
		String pass=ExcelUtilities.getValue(x1, s1, i,1);
		System.out.println("password "+i+" = "+pass);		
		ob.setData(un, pass);
		ob.submitClick();}	
	Thread.sleep(30);
	ob.addToCart();
	Thread.sleep(30);
	ob.checkOutClick();	
	Thread.sleep(40);
	ob.fillform("jancy", "manoharan", "943273");
	Thread.sleep(30);
	ob.logout();	
	}
	
}
