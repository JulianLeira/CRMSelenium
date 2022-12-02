package selenium;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class CrmTesting {	
	public static class login{
		public static void run() {
			try {
			WebDriver driver = new ChromeDriver();			
			driver.get("http://localhost:3000/");
			Thread.sleep(1000);
			WebElement wrongEmail= driver.findElement(By.id("email"));
			wrongEmail.sendKeys("email@email.com");
			Thread.sleep(1000);
			WebElement wrongPass= driver.findElement(By.id("password"));
			wrongPass.sendKeys("wrongpass");
			Thread.sleep(1000);
			wrongPass.submit(); 
			Thread.sleep(1000);
			driver.switchTo().alert();
            Alert alert = driver.switchTo().alert();
            Thread.sleep(2000);
            alert.accept();
			WebElement email= driver.findElement(By.id("email"));
			email.sendKeys("solera@solera.com");
			Thread.sleep(1000);
			WebElement pass= driver.findElement(By.id("password"));
			pass.sendKeys("bootcamp4");
			Thread.sleep(1000);
			pass.submit();
			Thread.sleep(2000);
			WebElement createCliOpp=driver.findElement(By.id("createCliOpp"));
			createCliOpp.click();
			Thread.sleep(2000);
			WebElement name= driver.findElement(By.id("Name"));
			name.sendKeys("Dummy");
			Thread.sleep(1000);
			WebElement lastName= driver.findElement(By.id("LastName"));
			lastName.sendKeys("DummyLastName");
			Thread.sleep(1000);
			WebElement phoneCli= driver.findElement(By.id("Phone"));
			phoneCli.sendKeys("600600111");
			Thread.sleep(1000);
			WebElement emailCli= driver.findElement(By.id("Email"));
			emailCli.sendKeys("Dummy@Dummy.com");	
			Thread.sleep(1000);
			emailCli.submit();
			Thread.sleep(2000);
			WebElement adminCliBtn=driver.findElement(By.id("adminclientbtn7"));
			adminCliBtn.click();
			Thread.sleep(2000);
			WebElement createContactBtn=driver.findElement(By.id("createcontactbtn"));
			createContactBtn.click();
			Thread.sleep(2000);
			WebElement via= driver.findElement(By.id("Via"));
			via.sendKeys("phone");
			Thread.sleep(1000);
			WebElement details= driver.findElement(By.id("Details"));
			details.sendKeys("Signed contract with the client");
			Thread.sleep(1000);
			WebElement result= driver.findElement(By.id("Result"));
			result.click();
			Thread.sleep(1000);
			WebElement date= driver.findElement(By.id("Date"));
			date.sendKeys("22/03/2022");
			date.submit();
			Thread.sleep(2000);
			WebElement deleteCLiOppBtn=driver.findElement(By.id("deletebtn7"));
			deleteCLiOppBtn.click();
			Thread.sleep(1000);
			driver.switchTo().alert();
            Alert alertDelete = driver.switchTo().alert();
            Thread.sleep(2000);
            alertDelete.accept();
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {	
		login.run();
		
	}
}