package prac.mda.tools;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver
{
	private static SeleniumDriver seleniumDriver;
	private static WebDriver driver;
	private static WebDriverWait waitDriver;
	private static Wait <WebDriver> fluentWaitDriver;	
	public final static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIMEOUT = 50;
	
	private SeleniumDriver()
	{
		driver = launchChromeBrowser(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		waitDriver = new WebDriverWait(driver, TIMEOUT);
		fluentWaitDriver = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(TIMEOUT))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("Fluent Wait")
				.ignoring(NoSuchElementException.class);
		System.out.println("Driver Initialized.");
	}

	public static void openPage(String url)
	{
		driver.get(url);
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	public static void setDriver()
	{
		if( seleniumDriver == null )
		{
			seleniumDriver = new SeleniumDriver();
		}
	}
	
	public static void tearDown()
	{
		if(driver != null)
		{
			driver.quit();
		}
		
		seleniumDriver = null;
	}
	
	private static WebDriver launchChromeBrowser(WebDriver driver)
	{
//		System.setProperty("webdriver.chrome.driver", baseDir + execDir + "chromedriver.exe");
		System.out.println("Browser Version: " +WebDriverManager.chromedriver().getDownloadedDriverVersion());
		WebDriverManager.chromedriver().setup();
		/*
		 * Removes the unwanted pop-ups at the start of the test
		 */
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-infobars");
		return driver = new ChromeDriver(options);
	}
	
}
