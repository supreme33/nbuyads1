package nbuyadspkg1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class nbuyads_tc3 {
	@Test
	public void Testcase1() throws InterruptedException, AWTException{
		
		WebDriver d1=new FirefoxDriver();
		d1.get("http:\\www.google.com");
		d1.get("nbuyads.appinstitute.in/admin");
        /*Login*/
		d1.findElement(By.id("adminloginform-email")).sendKeys("balaji2469@gmail.com");
		d1.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		/*get error message*/
		String s1=d1.findElement(By.id("login-form")).getText();
		String exp="Password cannot be blank.";
		Assert.assertEquals(s1, exp);
		/*enter valid password*/
		d1.findElement(By.id("adminloginform-password")).sendKeys("4972gWBwBC");
		d1.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		/*Manage Agents*/
		Thread.sleep(2000);	
		d1.findElement(By.id("cmsuser")).click();
		/*add new*/
		WebElement e1 = d1.findElement(By.cssSelector("a[class='btn sbold green']"));
		e1.click();
		/*filling details*/
		d1.findElement(By.id("cmsusersignupform-name")).sendKeys("aet");
		d1.findElement(By.id("cmsusersignupform-email")).sendKeys("sas@gmail.com");
		d1.findElement(By.id("cmsusersignupform-mobile")).sendKeys("9770514566");
		WebElement e2 =d1.findElement(By.id("cmsusersignupform-profileimage"));
		e2.click();
		Thread.sleep(2000);
		/*adding new profile image*/
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_A);
		r1.keyRelease(KeyEvent.VK_A);
		r1.keyPress(KeyEvent.VK_G);
		r1.keyRelease(KeyEvent.VK_G);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		/*filling*/
		d1.findElement(By.id("cmsusersignupform-address")).sendKeys("sdjfh,sedgwser,erwr");
		d1.findElement(By.id("cmsusersignupform-area")).sendKeys("tambaram");
		d1.findElement(By.id("cmsusersignupform-city")).sendKeys("Chennai");
		d1.findElement(By.name("CmsUserSignupForm[pincode]")).sendKeys("600201");
		d1.findElement(By.className("bootstrap-switch-label")).click();
		/*create*/
		d1.findElement(By.name("signup-button")).click();
		
		/*looking for agent*/
		d1.findElement(By.name("CmsUsersSearch[name]")).sendKeys("Shajahan");
		d1.findElement(By.name("CmsUsersSearch[mobile]")).sendKeys("9789154034");
		d1.findElement(By.name("CmsUsersSearch[city]")).sendKeys("Chennai");
		d1.findElement(By.name("CmsUsersSearch[pincode]")).sendKeys("600045");
		d1.findElement(By.name("CmsUsersSearch[status]")).click();
		d1.findElement(By.linkText("Active")).click();
		/*reset*/
		Thread.sleep(2000);
		WebElement e4=d1.findElement(By.id("drop_page"));
		Select sel=new Select(e4);
		sel.selectByIndex(1);
		
		
	}

}
