import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {

	public static void main(String[] args) throws IOException {
		 String path=System.getProperty("user.dir")+"\\Driver\\chromedriver.exe";
		 System.out.println(path);
		 System.setProperty("webdriver.chrome.driver", path);
	     WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.get("https://www.facebook.com");
		/**
		 * Why we take screenshot?
		 * =>Screenshot is very useful for bug analysis
		 * =>Selenium can take screenshot automatically
		 * =>(To take screenshots manually:- we have to press windows + prtsc button) 
	    */
		/** How to take screenshots?
		 * =>To take screenshot we just need to typpe cast webdriver object into TakeScrrenshot
		 *    TakeScrrenshot screenshot=(TakeScreenshot)driver;
		 *==>Just call getScreenshot() method
		 *==>Copy desired file into destination location
		 * 
		*/
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File screen=screenshot.getScreenshotAs(OutputType.FILE);
		String name="Screenshot"+System.currentTimeMillis();
	    File destFile=new File("D:\\Akshay work\\workspace\\SeleniumDemo\\Screenshot\\"+name);
	   // FileUtils.copyFileToDirectory(screen, destFile);
	    FileUtils.copyFile(screen, destFile);
		
	}

}
