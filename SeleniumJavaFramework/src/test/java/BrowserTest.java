import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath  =  System.getProperty("user.dir");
		
		String geckoDriverKey = "webdriver.gecko.driver";
		String geckoDriverValue = projectPath + "/Drivers/geckodriver/geckodriver.exe";
		
		String chromeDriverKey = "webdriver.chrome.driver";
		String chromeDriverValue = projectPath + "/Drivers/chrome/chromedriver.exe";
		
		//System.setProperty(geckoDriverKey, geckoDriverValue);
		//WebDriver driver = new FirefoxDriver();
		
//		System.setProperty(chromeDriverKey, chromeDriverValue);
//		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver", projectPath + "\\Drivers\\IEdrivers\\IEDriverServer.exe");
		WebDriver driver  = new InternetExplorerDriver();
		driver.get("https://www.seleniumhq.org/");
		
		System.out.println(projectPath);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}

}
