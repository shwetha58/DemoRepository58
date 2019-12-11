package com.company.SDET_NOV_2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lastpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtalks.com/index.html");
		driver.findElement(By.id("email")).sendKeys("558shwetha@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9849350441");
		driver.findElement(By.id("username")).sendKeys("siri");
		driver.findElement(By.id("password")).sendKeys("siri12345");
		driver.findElement(By.id("confirmpassword")).sendKeys("siri12345");
		driver.findElement(By.id("comments")).sendKeys("It is good");
		
		driver.findElement(By.id("sendemail")).click();
		
		driver.findElement(By.id("prevselectpriceoption")).click();
		
		driver.findElement(By.xpath("//*[@id=\"finished-sub-container\"]/div/div/div[2]")).click();
	
		//driver.close();
		
	}

}
