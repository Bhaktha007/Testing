package com.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr =new ChromeDriver();
		
		dr.get("https://demo.opencart.com/");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//*[@id=\'content\']/h3"));

	}

}
