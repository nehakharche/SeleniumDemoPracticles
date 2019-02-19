import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic
{
	public static void main(String[] args)
	{
		 String path=System.getProperty("user.dir")+"\\Driver\\chromedriver.exe";
		 System.out.println(path);
		 System.setProperty("webdriver.chrome.driver", path);
	     WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.get("https://www.facebook.com");
	
	}
}

/**first we have to set system property*/

//Diffference between quit and close
/** Quit:-  Close the browser window that the driver 
 * Close:- Calls Dispose()
 * dispose:- Closes all browser windows and safely ends the session i.e does not clear insatnce */
 