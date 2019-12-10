package com.company.SDET_NOV_2019;

	import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class Assignment2 {
		public static void main(String[] args) throws InterruptedException, AWTException {
			// TODO Auto-generated method stub

			WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.get(" http://demo.automationtalks.com/index.html");
			
			driver.manage().window().maximize();
			
			WebElement MakeDD=driver.findElement(By.id("make"));
			//Thread.sleep(2000);
			Select selectmakedd=new Select(MakeDD);
			selectmakedd.selectByVisibleText("BMW");
			
			WebElement modeldd=driver.findElement(By.id("model"));
			Select selectmodeldd=new Select(modeldd);
			selectmodeldd.selectByVisibleText("Motorcycle");
			
			driver.findElement(By.id("cylindercapacity")).sendKeys("12");
			driver.findElement(By.id("engineperformance")).sendKeys("200");
			
			driver.findElement(By.id("dateofmanufacture")).sendKeys("1/11/1989");

			WebElement seats= driver.findElement(By.id("numberofseats"));
			Select selectseats=new Select(seats);
			selectseats.selectByVisibleText("3");
			
			String righthanddrive="Yes";
			
			if(righthanddrive.equals("No"))
			{
				
				driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span")).click();
				
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[2]/span")).click();
				//driver.findElement(By.id("righthanddriveno")).click();
			}
			
			
			WebElement Mseats= driver.findElement(By.id("numberofseatsmotorcycle"));
			Select selectmseats=new Select(Mseats);
			selectmseats.selectByVisibleText("2");
			
			WebElement fueltp= driver.findElement(By.id("fuel"));
			Select selectfueltp=new Select(fueltp);
			selectfueltp.selectByVisibleText("Petrol");
			
			driver.findElement(By.id("payload")).sendKeys("100");
			
			driver.findElement(By.id("totalweight")).sendKeys("100");
			
			driver.findElement(By.id("listprice")).sendKeys("34000");
			
			driver.findElement(By.id("licenseplatenumber")).sendKeys("Apq12345");
			
			driver.findElement(By.id("annualmileage")).sendKeys("12000");
			
			driver.findElement(By.id("nextenterinsurantdata")).click();
			
			String currentpagetitle=driver.getTitle();
			
			String expectedtitle="Fill Insurant Data";
			
			if(currentpagetitle.equals(expectedtitle))
				
			{
				System.out.println("Titles are matching");
			}
			else
			{
				System.out.println("Titles are not matching");
			}
			
			//fill insurant data
			
			driver.findElement(By.id("firstname")).sendKeys("Siri");
			
			driver.findElement(By.id("lastname")).sendKeys("Verma");
			
			driver.findElement(By.id("birthdate")).sendKeys("1/11/1989");
			
			String gender="Female";
			
			if(gender.equals("Female"))
			{
				
				driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]")).click();
				
			}
			else
			{
			
				driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]")).click();
			}
			
			driver.findElement(By.id("streetaddress")).sendKeys("middletown,ct");
			
			WebElement countrydt=driver.findElement(By.id("country"));
			Select selectcountrydt=new Select(countrydt);
			selectcountrydt.selectByVisibleText("United States");
			
			driver.findElement(By.id("zipcode")).sendKeys("06473");
			
			driver.findElement(By.id("city")).sendKeys("Middletown");
			
			WebElement occupation=driver.findElement(By.id("occupation"));
			Select selectoccupation=new Select(occupation);
			selectoccupation.selectByVisibleText("Unemployed");
			
			
		
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]")).click();
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]")).click();
	
			
			
			driver.findElement(By.id("website")).sendKeys("http://www.facebook.com");

			//using robot class uploading a picture
			driver.findElement(By.id("open")).click();
			StringSelection ss=new StringSelection("C:\\Users\\sande\\Downloads\\monument vally.jpeg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			
			Robot rc=new Robot();
			Thread.sleep(2000);
			rc.keyPress(KeyEvent.VK_CONTROL);
			rc.keyPress(KeyEvent.VK_V);
			
			Thread.sleep(2000);
			rc.keyRelease(KeyEvent.VK_CONTROL);
			rc.keyRelease(KeyEvent.VK_V);
			
			rc.keyPress(KeyEvent.VK_ENTER);
			rc.keyRelease(KeyEvent.VK_ENTER);
			
			driver.findElement(By.id("nextenterproductdata")).click();
			
			
			String expectedtitle2="Fill Insurant Data";
			String currentpagetitle2=driver.getTitle();
			
			
			
			if(currentpagetitle2.equals(expectedtitle2))
				
			{
				System.out.println("Titles are matching");
			}
			else
			{
				System.out.println("Titles are not matching");
			}
			
			driver.findElement(By.id("startdate")).sendKeys("12/12/2020");
			
			WebElement issurancesum=driver.findElement(By.id("insurancesum"));
			Select selectissurancesum=new Select(issurancesum);
			selectissurancesum.selectByVisibleText("3.000.000,00");
			
		
			WebElement merritrating=driver.findElement(By.id("meritrating"));
			Select selectmerritrating=new Select(merritrating);
			selectmerritrating.selectByVisibleText("Bonus 1");
			
			WebElement damageinsurance=driver.findElement(By.id("damageinsurance"));
			Select selectdamageinsurance=new Select(damageinsurance);
			selectdamageinsurance.selectByVisibleText("Full Coverage");
			
			
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]")).click();
			
			
			WebElement courtesycar=driver.findElement(By.id("courtesycar"));
			Select selectcourtesycar=new Select(courtesycar);
			selectcourtesycar.selectByVisibleText("Yes");
			
			
			driver.findElement(By.id("nextselectpriceoption")).click();
			
			driver.findElement(By.id("preventerinsurancedata")).click();
			
			String expectedtitle3="Fill Insurant Data";
			String currentpagetitle3=driver.getTitle();
			
			
			
			if(currentpagetitle3.equals(expectedtitle3))
				
			{
				System.out.println("Titles are matching");
			}
			else
			{
				System.out.println("Titles are not matching");
			}
			
			driver.findElement(By.id("nextselectpriceoption")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='selectgold']/following-sibling::span")).sendKeys(Keys.ENTER);;
			
			//List readingtheheader=(List) driver.findElement(By.xpath("//table[@id='priceTable']//th"));


			driver.findElement(By.id("nextsendquote")).click();
			
			driver.findElement(By.id("email")).sendKeys("558shwetha@gmail.com");
			driver.findElement(By.id("phone")).sendKeys("9849350441");
			driver.findElement(By.id("username")).sendKeys("siri");
			driver.findElement(By.id("password")).sendKeys("siri12345");
			driver.findElement(By.id("confirmpassword")).sendKeys("siri12345");
			driver.findElement(By.id("comments")).sendKeys("It is good");
			
			driver.findElement(By.id("sendemail")).click();
			
			driver.findElement(By.id("prevselectpriceoption")).click();
			
			driver.findElement(By.xpath("//*[@id=\"finished-sub-container\"]/div/div/div[2]")).click();
		
			driver.close();
		}

	}



