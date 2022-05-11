package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {

	public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
       ChromeDriver driver = new ChromeDriver();
    		   driver.get("http://leaftaps.com/opentaps/control/main");
    		   driver.manage().window().maximize();
    		   driver.findElement(By.id("userName")).sendKeys("Demosalesmanager");
    		   driver.findElement(By.id("password")).sendKeys("crmfa");
    		   driver.findElement(By.className("decorativeSumbit")).click();
    		   String text = driver.findElement(By.tagName("h2")).getText();
    		   System.out.println(text);
    		   driver.findElement(By.linkText("CRM/SFA")).click();
    		   String title = driver.getTitle();
    		   System.out.println(title);
    		   
    		   
    		   driver.findElement(By.linkText("Leads")).click();
    		   driver.findElement(By.linkText("Create Lead")).click();
    		   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
    		   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manoj");
    		   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mukunthavasan");
    		   driver.findElement(By.className("submitButton")).click();
    		   //driver.close();
	}


}
