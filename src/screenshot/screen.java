package screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ("C:\\Users\\Heena\\eclipse-workspace\\excelsheetreading\\chromedriver.exe"));
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);

	}

}
