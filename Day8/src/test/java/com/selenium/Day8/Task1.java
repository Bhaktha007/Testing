package com.selenium.Day8;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Task1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");
		
		//creating action class
		Actions a=new Actions(driver);
		//selecting drag and drop item using its id
		WebElement source_ele=driver.findElement(By.id("draggable"));
		WebElement dest_ele=driver.findElement(By.id("droppable"));
		
		//drag and drop action
		a.clickAndHold(source_ele).release(dest_ele).build().perform();
		driver.quit();
	}

}