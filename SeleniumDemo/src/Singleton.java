
public class Singleton {
	public static void main(String[] args) {
		SingletonDemo a= SingletonDemo.getObjet();
		SingletonDemo a1= SingletonDemo.getObjet();
		SingletonDemo a2= SingletonDemo.getObjet();
		
		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
	}
//	public static void main(String[] args) {
//		 String path=System.getProperty("user.dir")+"\\Driver\\chromedriver.exe";
//		 System.out.println(path);
//		 System.setProperty("webdriver.chrome.driver", path);
//	     WebDriver driver=new ChromeDriver();
//
//		driver.manage().window().maximize();
//		driver.navigate().refresh();
//		driver.get("https://www.facebook.com");
//		
//		By inpUsername=By.id("u_0_j");
//		By inpPassword=By.id("u_0_l");
//
//	   
//		/**
//		 * Selenium has build in functionality to handle keyboard and mouse events
//	     */
//	}
}
class SingletonDemo
{
	private static SingletonDemo a;
	public String s;
	private SingletonDemo() {
		s = "Hello I am a string part of Singleton class";
	}
	static SingletonDemo getObjet() {
		a = new SingletonDemo();
		return a;
	}
}


