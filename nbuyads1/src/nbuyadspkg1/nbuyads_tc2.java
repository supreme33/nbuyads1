package nbuyadspkg1;

import java.awt.AWTException;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class nbuyads_tc2 {
	@Test
	public void Testcase1() throws InterruptedException, AWTException{
		
		WebDriver d1=new FirefoxDriver();
		d1.get("http:\\www.google.com");
		d1.get("https://www.nbuyads.com/admin/site/login#!");
		d1.findElement(By.id("adminloginform-email")).sendKeys("superadmin@gmail.com");
		d1.findElement(By.id("adminloginform-password")).sendKeys("Abcde@12345");
		d1.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		d1.findElement(By.className("img-circle")).click();
		d1.findElement(By.linkText("ChangePassword")).click();
		d1.findElement(By.id("changepassword-oldpassword")).sendKeys("Abcde@12345");
		d1.findElement(By.id("changepassword-newpassword")).sendKeys("Abc@12345");
		d1.findElement(By.id("changepassword-confirmpassword")).sendKeys("Abc@12345");
		d1.findElement(By.name("login-button")).click();
		
	}
}