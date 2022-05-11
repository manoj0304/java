package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElement(By.id("userName")).sendKeys("Demosalesmanager");
	  driver.findElement(By.id("password")).sendKeys("crmfa");
	  driver.findElement(By.className("decorativeSumbit")).click();
	  driver.findElement(By.linkText("CRM/SFA")).click();
	  driver.findElement(By.linkText("Leads")).click();
	  driver.findElement(By.linkText("Manoj Mukunthavasan (Testleaf")).click();
	  driver.findElement(By.linkText("Edit")).click();
	  driver.findElement(By.id("updateLeadForm_firstNameLocal")).sendKeys(" Maddy");
	  driver.findElement(By.className("smallSubmit")).click(); 
}

}
