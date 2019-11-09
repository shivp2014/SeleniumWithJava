package basicprogramsselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HIghlightText {
	public static void main(String as[]) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"//drivers//chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.get("https://www.seleniumhq.org");
		 JavascriptExecutor js =(JavascriptExecutor) driver;
		 WebElement ele =driver.findElement(By.xpath("//h2[contains(text(),'What is Selenium?')]"));
		 js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
		 driver.close();
	}

}
