package com.company.SDET_NOV_2019;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registrationform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://services.smartbear.com/samples/TestComplete14/smartstore/");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"menubar-my-account\"]/div/a/span")).click();
			
		driver.findElement(By.xpath("//*[@id=\"content-center\"]/div/div[2]/div[2]/div[2]/div/div/a")).click();
			
		//driver.findElement(By.xpath("//*[@id=\"content-center\"]/form/div/div[2]/div/fieldset[1]/div[2]/label")).sendKeys("John");
		
		String malegender="Male";
		
		if(malegender.equals("Male"))
		{
			driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"content-center\"]/form/div/div[2]/div/fieldset[1]/div[1]/div/div[2]/label")).click();
		}
		
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("John");	
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Hauge");
		
		WebElement Day=driver.findElement(By.name("DateOfBirthDay"));
		
		Select selectDay=new Select(Day);
		selectDay.selectByIndex(1);
		
		WebElement Month =driver.findElement(By.name("DateOfBirthMonth"));
		
		Select selectMonth=new Select(Month);
		selectMonth.selectByVisibleText("November");
		
		WebElement Year=driver.findElement(By.name("DateOfBirthYear"));
		
		Select selectYear=new Select(Year);
		selectYear.selectByVisibleText("1915");
		
		//email
		driver.findElement(By.name("Email")).sendKeys("558shwetha@gmail.com");	
		
		//username
		driver.findElement(By.name("Username")).sendKeys("shwetha");
		
		//password
		
		driver.findElement(By.name("Password")).sendKeys("siri1234");
		
		//confirmpassword
				
		driver.findElement(By.name("ConfirmPassword")).sendKeys("siri1234");
		
		//company name
		driver.findElement(By.name("Company")).sendKeys("siri");
		
		//newsletter
		 driver.findElement(By.id("Newsletter")).click();
		//Register
		
		driver.findElement(By.name("register-button")).click();
		
	
	//Continue
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section/div/div/div/div[2]/div/a")).click();
	
	//Close
	driver.close();

	}	
	
	}


