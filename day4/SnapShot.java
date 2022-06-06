package week5.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapShot {
public static void main(String[] args)throws IOException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/Window.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	WebElement findElement = driver.findElement(By.id("home"));
	
	
	File ele = driver.getScreenshotAs(OutputType.FILE);
	File destination = new File("./snap/image.png");
	FileUtils.copyFile(ele, destination);
}

}

