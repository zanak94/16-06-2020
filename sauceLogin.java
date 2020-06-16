package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class sauceLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\zana_\\Desktop\\QA_Automation\\eclipse-workplace\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.saucedemo.com/");
WebElement username= driver.findElement(By.id("user-name"));
WebElement password=driver.findElement(By.id("password"));
WebElement logButton=driver.findElement(By.className("btn_action"));



username.sendKeys("standard_user");
password.sendKeys("secret_sauce");

logButton.click();
	}

}