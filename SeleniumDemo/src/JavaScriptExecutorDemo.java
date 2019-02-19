import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		
		 String path=System.getProperty("user.dir")+"\\Driver\\chromedriver.exe";
		 System.out.println(path);
		 System.setProperty("webdriver.chrome.driver", path);
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().refresh();
		 driver.get("https://www.facebook.com");

		 
		 //What is javascriptExcecutor in Selenium?
		 /*
		  * JavaScriptExecutor is an interface which helps to excute java script through selenium webdriver
		 */
		 //Why we used JAvascriptExecutor in selenium?
		 /*
		  * ==>JavascriptExecutor is used when selenium webdriver fails to click on any elementdue to some issue
		  * Sometimes, Selenium is not able to do some opeartions like click navigate to another page hadle alert
		  * i such situation we use JavaScriptExecutor.
		  * There are two methods of java script executor 
		  * 1)executeAsyncScript()
		  * 2)excecuteScript()
		 */
		 //Difference between  excuteAsyncScript() and executeScript()?
		 /*
		  * =>excecuteAsyncScript() methods render your page more quickly
		  *  this not wait for script to download before page renders that helps to improve the performance 
		  *  of your script 
		  * =>
		  */
		 
		  //To perform any action using javascriptexecutor first we have to create create the JavaScriptExecutor Instance
		 //and type cast driver object into JavaScriptExecutor
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 By button = By.id("u_0_2");
		
		// 1)To click
		js.executeScript("arguments[0].click()", driver.findElement(button));
		
		// 2)To generate alert
		js.executeScript("alert('Please enter Username and Password')");
		driver.switchTo().alert().accept();
		
		// 3)To get domain name
		String DomainName = js.executeScript("return document.domain;").toString();
		System.out.println(DomainName);

		// 4)To get title pf web page
		String WebPageTitile = js.executeScript("return document.title;").toString();
		System.out.println(WebPageTitile);

		// 5) Fetching the URL of the site. Tostring() change object to name
		String url = js.executeScript("return document.URL;").toString();
		System.out.println("URL of the site = " + url);

		// 6) Navigate to new Page i.e to generate access page. (launch new url)
		js.executeScript("window.location = 'http://demo.guru99.com/'");

		 driver.close();
		 driver.quit();
	}

}
