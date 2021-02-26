package greens.MavenJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public WebDriver loadBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Workspace\\MavenJava\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 return driver;
	}
	
	public static void launchUrl(String url) {
		driver.get(url);

	}
	public void maxWindow() {
		driver.manage().window().maximize();

	}
	public void closeBrowser() {
		driver.quit();

	}
	public String pageTitle() {
		String title = driver.getTitle();
		return title;

	}
	private String pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

}
