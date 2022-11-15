package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
	
public static void main(String[] args) throws InterruptedException {
	

System.setProperty("webdriver.chrome.driver","C:\\Users\\Leo\\eclipse-workspace\\Demos\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys("leo");
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("roach");
driver.findElement(By.xpath("//button[.='Sign In']")).click();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
String text = driver.findElement(By.cssSelector("p.error")).getText() ;
System.out.println(text);
driver.close();
}
}
	


