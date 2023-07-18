package BlessingsAuto.BlessingsTests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIIT\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.spicejet.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("(//div[text()=\"Email\"])[1]")).click();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys();
		driver.findElement(By.xpath("//input[@data-testid = 'password-input-box-cta']")).sendKeys();
		driver.findElement(By.xpath("//div[@data-testid='login-cta']")).click();
	}

}
