package com.company.SDET_NOV_2019;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();	
		WebDriver driver= new FirefoxDriver();
		driver.get("http://qdpm.net/demo/v9/index.php");
		driver.manage().window().maximize();
		
		//Login 
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("administrator@localhost.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("administrator");
		driver.findElement(By.xpath("//label[@class='checkbox']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// Verifying the title
		
		String Currentpagetitle=driver.getTitle();
		
		String Expectedtitle="qdPM | Dashboard";
		
		if(Currentpagetitle.equals(Expectedtitle))
			
		{
			System.out.println("Titles are matching");
		}
			else
			{
					System.out.println("Titles are not matching");
			}

// Assert.assert.equals	("qdPM | Dashboard",driver.getTitle());
		
		
		// Verifying whether the webelement is displayed on the web page or not
		
		//Dashbord
		
		WebElement dashbord=driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']//span"));
		System.out.println("Is the Dashbord is displayed "+ dashbord.isDisplayed());
		
		//Projects
		
		WebElement Projects=driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']/li[3]//span"));
		System.out.println("Is the Dashbord is displayed "+ Projects.isDisplayed());
		
		//Tasks
		
		WebElement Tasks=driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']/li[4]//span"));
		System.out.println("Is the Dashbord is displayed "+ Tasks.isDisplayed());
		
		//Tickets
		
		WebElement Tickets=driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']/li[5]//span"));
		System.out.println("Is the Dashbord is displayed "+ Tickets.isDisplayed());
		
		//Discussions
		
		WebElement Discussions=driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']/li[6]//span"));
		System.out.println("Is the Dashbord is displayed "+ Discussions.isDisplayed());
		
		
		//Users
		
		WebElement Users=driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']/li[7]//span"));
		System.out.println("Is the Dashbord is displayed "+ Users.isDisplayed());
		
		//Reports
		
		WebElement Reports=driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']/li[8]//span"));
		System.out.println("Is the Dashbord is displayed "+ Reports.isDisplayed());
		
		//Configurations
		
		WebElement Configurations=driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']/li[9]//span"));
		System.out.println("Is the Dashbord is displayed "+ Configurations.isDisplayed());
		
		//Tools 
		WebElement Tools=driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']/li[10]//span"));
		System.out.println("Is the Dashbord is displayed "+ Tools.isDisplayed());
		
		//qdpmExtended
		
		WebElement qdpmExtended=driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']/li[11]//span"));
		System.out.println("Is the Dashbord is displayed "+ qdpmExtended.isDisplayed());
		
		//**Adding a Task**//
		
		//Click on Add Task
		
		driver.findElement(By.xpath("//table[@width='100%']//button")).click();
		
		//Selecting a project
//		
		//WebElement mouseover=driver.findElement(By.xpath("//select[@name='form_projects_id']"));
		driver.findElement(By.xpath("//select[@name='form_projects_id']")).sendKeys(Keys.RETURN);
		
	//	driver.findElement(By.xpath("//select[@name='form_projects_id']")).sendKeys(Keys.DOWN);
		
		
		WebElement Projectselection=driver.findElement(By.xpath("//select[@name='form_projects_id']"));
		Select Projectselectionn=new Select(Projectselection);
		Projectselectionn.selectByValue("1");
		
//		Robot rc=new Robot();
//		Thread.sleep(2000);
//		rc.keyPress(KeyEvent.VK_ENTER);
//		rc.keyRelease(KeyEvent.VK_ENTER);
		
		
//		Actions actions = new Actions(driver);
//		actions.moveToElement(mouseover).click().build().perform();
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", mouseover);


		
	}

}
