package nbuyadspkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class nbuyads_tc5 {
	@Test
	public void Testcase(){
		WebDriver d1=new FirefoxDriver();
		d1.get("http:\\www.google.com");
		d1.get("nbuyads.appinstitute.in/admin");
		d1.findElement(By.id("adminloginform-email")).sendKeys("balaji2469@gmail.com");
		d1.findElement(By.id("adminloginform-password")).sendKeys("4972gWBwBC");
		d1.findElement(By.name("login-button")).click();
		d1.findElement(By.className("size-value")).click();
		d1.findElement(By.name("VendorSearch[agent_id]")).sendKeys("karan");
		d1.findElement(By.name("VendorSearch[business_name]")).sendKeys("Groceries");
		d1.findElement(By.name("VendorSearch[contact_name]")).sendKeys("edward ");
		d1.findElement(By.name("VendorSearch[mobile]")).sendKeys("9465454321");
		WebElement e1= d1.findElement(By.name("VendorSearch[status]"));
		Select s1=new Select(e1);
		s1.selectByIndex(1);
	    WebElement e2=d1.findElement(By.id("drop_page"));
	    Select s2=new Select(e2);
	    s2.selectByIndex(2);
		
		
	}

}
