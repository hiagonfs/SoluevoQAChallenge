package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilWebDriver {

	private static WebDriver driver;

	public static void initDriver() {
		configureDriver();
		driver = new ChromeDriver(configureDriver());
		WebDriverManager.chromedriver().setup();
	}

	public static WebDriver getDriver() {

		if (driver == null) {
			initDriver();
		}
		return driver;
	}

	public static ChromeOptions configureDriver() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		// chromeOptions.addArguments("headless");
		return chromeOptions;
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static WebElement waitByElement(WebElement element) {
		return new WebDriverWait(UtilWebDriver.getDriver(), Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(element));
	}

}
