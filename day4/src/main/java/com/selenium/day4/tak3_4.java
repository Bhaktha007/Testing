package com.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tak3_4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr =new ChromeDriver();
		
		dr.get("https://demo.opencart.com/");
		dr.manage().window().maximize();
		Thread.sleep(4000);
		dr.findElement(By.xpath("/html/body/footer/div/div/div[3]/ul/li[2]/a")).click();

	}

}
