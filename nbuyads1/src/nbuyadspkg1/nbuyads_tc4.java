package nbuyadspkg1;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class nbuyads_tc4 {
	@Test
	public void Testcase1() throws InterruptedException {
		
		WebDriver d1=new FirefoxDriver();
		d1.get("http:\\www.google.com");
		d1.get("nbuyads.appinstitute.in/admin");
		d1.findElement(By.id("adminloginform-email")).sendKeys("balaji2469@gmail.com");
		d1.findElement(By.id("adminloginform-password")).sendKeys("4972gWBwBC");
		d1.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		
		d1.findElement(By.id("superadmin")).click();		
		
		Thread.sleep(2000);
		WebElement e2 = d1.findElement(By.cssSelector("a[class='btn sbold green']"));
		e2.click();
		d1.findElement(By.name("Superadmin[Name]")).sendKeys("Sandy");
		d1.findElement(By.name("Superadmin[email]")).sendKeys("abc@gmail.com");
		d1.findElement(By.name("Superadmin[mobile]")).sendKeys("8859575202");
		Thread.sleep(2000);
		d1.findElement(By.className("bootstrap-switch-label"));
		d1.findElement(By.name("signup-button")).click();
		
	}
	}

		
