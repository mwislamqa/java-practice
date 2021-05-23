package com.bd.Baic_java;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ups {
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		driver= new ChromeDriver();
		driver.get("https://www.ups.com/us/en/Home.page");
	}

}
