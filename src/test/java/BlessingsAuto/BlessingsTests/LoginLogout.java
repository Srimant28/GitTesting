package BlessingsAuto.BlessingsTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginLogout {

	WebDriver driver;

	@BeforeTest()
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIIT\\Downloads\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String url = "https://www.spicejet.com/";
		driver.get(url);
	}

	@BeforeMethod()
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@data-testid = 'user-mobileno-input-box']")).sendKeys("8917476292");
		driver.findElement(By.xpath("//input[@data-testid = 'password-input-box-cta']")).sendKeys("Srimant@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-testid='login-cta']")).click();
	}

	@Test()
	public void text() {
		WebElement ele = driver.findElement(By.xpath("//div[text()='Hi Srimant']"));
		String textcheck = ele.getText();

		if (textcheck.equalsIgnoreCase("Hi Srimant")) {
			System.out.println("logged in sucessful and check pass");
		}

	}

	@Test()
	public void test1() throws InterruptedException {

		Thread.sleep(1000);

		String exceptedTitle = "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";

		String actualTitle = driver.getTitle();

		System.out.println("the title is:" + actualTitle);
	}

	@AfterMethod()
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='Hi Srimant']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Log Out']")).click();
		Thread.sleep(1000);

	}

	@AfterTest()
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();

	}
}
