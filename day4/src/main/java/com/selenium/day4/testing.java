package com.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testing {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		dr.manage().window().maximize();
		dr.findElement(By.id("input-firstname")).sendKeys("ajmal");
		dr.findElement(By.id("input-lastname")).sendKeys("ahmad");
		dr.findElement(By.id("input-email")).sendKeys("ajmal@gmail.com");
		dr.findElement(By.id("input-password")).sendKeys("aj234");
		dr.findElement(By.id("input-newsletter-yes")).click();
		Thread.sleep(5000);
		dr.quit();

	}

}
