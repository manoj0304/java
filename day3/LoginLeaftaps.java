package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLeaftaps {

	 public static void main(String[] args){
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	     driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
	     driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	     
        		 
		 
		 
		 
	 }
	}



