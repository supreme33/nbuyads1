package nbuyadspkg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class nbuyads_tc6 {
 
	
	public static void main(String[]args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException  {
		for(int i=0;i<=29;i++)
		{

		String u1 =nbuyads_tc6.getdata(i,0);
		String p1=nbuyads_tc6.getdata(i,1);
		WebDriver d1=new FirefoxDriver();
		d1.get("http:\\www.google.com");
		d1.get("nbuyads.appinstitute.in/admin");
		d1.findElement(By.name("AdminLoginForm[email]")).sendKeys(u1);
		d1.findElement(By.name("AdminLoginForm[password]")).sendKeys(p1);
		d1.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		
		WebElement e1= d1.findElement(By.xpath(".//*[@id='login-form']/div[1]/div/p"));
        String s1=e1.getText();
        WebElement e2=d1.findElement(By.xpath(".//*[@id='login-form']/div[2]/div/p"));
        String s2=e2.getText();

        if(s1.equals("Email cannot be blank.")){
            System.out.println("emailid failed");
            d1.quit();
            
            if(s2.equals("Password cannot be blank.")){
            	System.out.println("password failed");
            	d1.quit();
            }
            else{
                System.out.println("password pass");
                d1.quit();
        }
        }
        else{
                d1.quit();
        }

}}
	

	private static String getdata(int i, int j) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Supreme\\Documents\\Demo.xls");
		Workbook wb=WorkbookFactory.create(fis);
		String s=wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
		return s;
		
	}
		

}
