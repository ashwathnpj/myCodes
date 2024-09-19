package package1;
//Taking the ScreenShot of Amazon home page 
//and naming using concat with getClass method

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SeClass0042_ScreenShot4 {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.amazon.in");

		TakesScreenshot s1 = driver;
		File source = s1.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\ashwathnpj\\eclipse-workspace\\selenium\\src\\Screenshots\\Screenshot" + new SeClass0042_ScreenShot4().getClass() + ".png");
		FileHandler.copy(source, destination);

	}

}
