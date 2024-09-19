package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import source.Fb_LoginPage;

public class FbTestCase {
	@Test
	public void login_to_facebook() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Fb_LoginPage fb = new Fb_LoginPage(driver);
		fb.un();
		fb.pw();
		fb.login();
	}
}
