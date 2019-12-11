package com.company.SDET_NOV_2019;

	import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
	public class Assignment3 {

		public static void main(String[] args) throws Exception {
	
			//Launching the browse
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
//STEP 1:Navaige to URL on Google Chrome:  
			
			driver.get("http://qdpm.net/demo/v9/index.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
//Step2: Login with Administrator 			
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("administrator@localhost.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("administrator");
			driver.findElement(By.xpath("//label[@class='checkbox']")).click();
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
//Step3: Verify dashboard title after logged in successfully
			
			String Currentpagetitle=driver.getTitle();
			String Expectedtitle="qdPM | Dashboard";
			Assert.assertEquals(Currentpagetitle,Expectedtitle,"Message here in case of failure");

//Step4: Verify that all options are present on dashboard page
			
			//Dashbord
			
			WebElement dashbord=driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']//span"));
			Assert.assertEquals(dashbord.isDisplayed(),true,"Message here in case of failure");
			
			//Projects
			
			WebElement Projects=driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']/li[3]//span"));
			Assert.assertEquals(Projects.isDisplayed(),true,"Message here in case of failure");
			//Tasks
			
			WebElement Tasks=driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']/li[4]//span"));
			Assert.assertEquals(Tasks.isDisplayed(),true,"Message here in case of failure");
			
			//Tickets
			
			WebElement Tickets=driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']/li[5]//span"));
			Assert.assertEquals(Tickets.isDisplayed(),true,"Message here in case of failure");
			
			//Discussions
			
			WebElement Discussions=driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']/li[6]//span"));
			Assert.assertEquals(Discussions.isDisplayed(),true,"Message here in case of failure");
			
			
			//Users
			
			WebElement Users=driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']/li[7]//span"));
			Assert.assertEquals(Users.isDisplayed(),true,"Message here in case of failure");
			
			//Reports
			
			WebElement Reports=driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']/li[8]//span"));
			Assert.assertEquals(Reports.isDisplayed(),true,"Message here in case of failure");
			
			//Configurations
			
			WebElement Configurations=driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']/li[9]//span"));
			Assert.assertEquals(Configurations.isDisplayed(),true,"Message here in case of failure");
			
			//Tools 
			WebElement Tools=driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']/li[10]//span"));
			Assert.assertEquals(Tools.isDisplayed(),true,"Message here in case of failure");
			
			//qdpmExtended
			
			WebElement qdpmExtended=driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']/li[11]//span"));
			Assert.assertEquals(qdpmExtended.isDisplayed(),true,"Message here in case of failure");
			
//Step5:  Click on “Add Task” button 
			
//			Click on Add Task
			
			driver.findElement(By.xpath("//table[@width='100%']//button")).click();
			
//Step6: Select “Test Project1” from project dropdown list.
			
			
		     WebDriverWait wait = new WebDriverWait(driver,30);
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//select[@name='form_projects_id']"))));
			 element.click();
			 Select elementselection=new Select(element);
			 elementselection.selectByVisibleText("Test Project 1");

//Step7: Enter below data Under General tab
			
			WebElement Type=driver.findElement(By.xpath("//select[@name='tasks[tasks_type_id]']"));
			Select Typeselectionn=new Select(Type);
			Typeselectionn.selectByValue("3");
	
			// Enterting the name//
			
			driver.findElement(By.xpath("//input[@name='tasks[name]']")).sendKeys("Siri");
			
			//Status  //
		
			driver.findElement(By.xpath("//select[@name='tasks[tasks_status_id]']/optgroup[3]/option[4]")).click();
			WebElement Status=driver.findElement(By.xpath("//select[@name='tasks[tasks_status_id]']/optgroup[3]/option[4]"));
			Select Statusselectionn=new Select(Status);
			Statusselectionn.selectByValue("8");
		
			//Priority//
			element.sendKeys(Keys.SHIFT);
			
			WebElement Priority=driver.findElement(By.id("tasks_tasks_priority_id"));
			Select Priorityselectionn=new Select(Priority);
			Priorityselectionn.selectByVisibleText("Low");
			
			//Label//
			
			driver.findElement(By.xpath("//select[@name='tasks[tasks_label_id]']/option[text()='Issue']")).click();
			WebElement Label=driver.findElement(By.xpath("//select[@name='tasks[tasks_label_id]']/option[7]"));
			Select Labelselectionn=new Select(Label);
			Labelselectionn.selectByValue("4");
			
			//selecting the checkbox
			
			WebElement check1=	driver.findElement(By.xpath("//input[@id='tasks_assigned_to_2']"));
			check1.click();
			
			WebElement check2 =driver.findElement(By.xpath("//div[@id='uniform-tasks_assigned_to_4']"));
			check2.click();
			
//			//Createdby//
			
			driver.findElement(By.xpath("//select[@id='tasks_created_by']/optgroup[3]/option")).click();
			WebElement Createdby=driver.findElement(By.xpath("//select[@id='tasks_created_by']/optgroup[3]/option"));
			Select Createdbyselectionn=new Select(Createdby);
			Createdbyselectionn.selectByValue("4");
			
//Step8: Swith to time tab and enter below data.
			driver.findElement(By.linkText("Time")).click();
			driver.findElement(By.xpath("//a[@href='#tab_time']")).click();
			
			//Estimated Time
			
			driver.findElement(By.xpath("//input[@id='tasks_estimated_time']")).sendKeys("11");
			
			//Start Date
			driver.findElement(By.xpath("//input[@id='tasks_start_date']")).sendKeys("2019-12-27");
			
			//Due Date
			
			driver.findElement(By.xpath("//input[@id='tasks_due_date']")).sendKeys("2019-12-31");
			
			//Progress
			
			WebElement Progress=driver.findElement(By.xpath("//select[@id='tasks_progress']"));
			Select Progressselectionn=new Select(Progress);
			Progressselectionn.selectByValue("20");
			

//Step9: Swith to attachment tab
			driver.findElement(By.linkText("Attachments")).click();
			//driver.findElement(By.xpath("//input[@id='uploadify_file_upload']/following-sibling::input")).sendKeys("C:\\Users\\sande\\Downloads\\mounument valley.jpeg");
			
			
			//Using Robot Class
			
			//input[@id='uploadify_file_upload']/following-sibling::input"
					
			driver.findElement(By.xpath("//*[@id=\"uploadifive-uploadify_file_upload\"]")).click();
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
			
			//Save//
			
			Thread.sleep(3000);
			 driver.switchTo().activeElement();
			 WebDriverWait wait1 = new WebDriverWait(driver,30);
			 WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[text()='Save']"))));
			 element1.click();
			
//Step 10: Logout of application 
			
			driver.findElement(By.xpath("//span[@class='username']")).click();
			driver.findElement(By.xpath("//li[@class='dropdown user open']//ul//li[6]/a")).click();
			
//Step 11: Once logged out, verify the page title 
			
			String Currentpagetitle1=driver.getTitle();
			String Expectedtitle1="qdPM | Login";
		
			Assert.assertEquals(Currentpagetitle1,Expectedtitle1,"Message here in case of failure");
			Thread.sleep(1000);
//Step 12: Login again with credentials given in step2.
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("administrator@localhost.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("administrator");
			driver.findElement(By.xpath("//label[@class='checkbox']")).click();
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			Thread.sleep(1000);
			
//Step 13: Click on Tasks (In the left side list items) & click on “View All” option.
			
			driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']/li[4]//span")).click();
			driver.findElement(By.xpath("//*[@id=\"yahoo-com\"]/div[3]/div[1]/div/div/ul/li[4]/ul/li[1]/a")).click();
			
			Thread.sleep(1000);

//Step14: Do mousehover on Search field
		
			WebElement Target=driver.findElement(By.xpath("//*[@id='yui-gen1']"));
			Actions act1= new Actions(driver);
			act1.moveToElement(Target).build().perform();
			Thread.sleep(1000);
		
//Step15: Enter your name (used in step 7) in search box and then click on Search button
			
			driver.findElement(By.xpath("//input[@id='search_keywords']")).sendKeys("Siri");
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			Thread.sleep(1000);
//Step16: Verify the search result.
			
			String Currentlabel=driver.findElement(By.xpath("//*[@class='odd']//td[4]")).getText();
			Assert.assertEquals(Currentlabel,"Issue","Message here in case of failure");
			
			
			String CurrentProject=driver.findElement(By.xpath("//*[@class='odd']//td[10]")).getText();
			Assert.assertEquals(CurrentProject,"Test Project 1","Message here in case of failure");
			
			
			String CurrentName=driver.findElement(By.xpath("//*[@class='odd']//td[5]")).getText();
			Assert.assertEquals(CurrentName,"Siri","Message here in case of failure");
			
			String CurrentlSatus=driver.findElement(By.xpath("//*[@class='odd']//td[6]")).getText();
			Assert.assertEquals(CurrentlSatus,"Low","Message here in case of failure");
			
			String CurrentAssignedto=driver.findElement(By.xpath("//*[@class='odd']//td[7]")).getText();
			//soft assertion
			//Assert.assertEquals(CurrentAssignedto,"developer","Message here in case of failure");

			if(CurrentAssignedto.equals("manager") || CurrentAssignedto.equals("developer"))
				
			{
				throw new Exception("Doresnt contain what i was expecting for");
			}
			else
			{
				System.out.println("Titles are not matching");
			}
			
			String CurrentEsttime=driver.findElement(By.xpath("//*[@class='odd']//td[8]")).getText();
			Assert.assertEquals(CurrentEsttime,"11","Message here in case of failure");
			
			String CurrentDuedate=driver.findElement(By.xpath("//*[@class='odd']//td[9]")).getText();
			Assert.assertEquals(CurrentDuedate,"31 Dec 2019","Message here in case of failure");
			
//Step17: Once table data verification is successful, Delete the record you created 
			
			driver.findElement(By.xpath("//*[@class='fa fa-trash-o']")).click();
			Thread.sleep(1000);
			
//Step18: Swith to allert and accept
			
			Alert ale = driver.switchTo().alert();
			ale.accept();
			Thread.sleep(1000);
			
//Step19: Verify that user is deleted from system. 
			
			//Click on user and then on viewall
			
			driver.findElement(By.xpath("//ul[@class='page-sidebar-menu']/li[8]//span")).click();
			driver.findElement(By.xpath("//*[@id=\"yahoo-com\"]/div[3]/div[1]/div/div/ul/li[8]/ul/li[1]/a")).click();
			Thread.sleep(1000);
			
			//Hover mouse on search
			
			WebElement Target3=driver.findElement(By.xpath("//*[@id='yui-gen1']"));
			Actions act3= new Actions(driver);
			act3.moveToElement(Target3).build().perform();
			Thread.sleep(1000);
			
			//Search
			
			driver.findElement(By.xpath("//input[@id='search_keywords']")).sendKeys("Siri");
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			Thread.sleep(1000);
			
			//Check for "No Records Found" Message
			
			String ActualMessage=driver.findElement(By.xpath("//*[@id=\"table-users\"]/tbody/tr/td")).getText();
			
			String RequiredMessage="No Records Found";
			
			Assert.assertEquals(ActualMessage, RequiredMessage,"Message me here if didnt match");
		
//Step20: Logout of application & close browser.
			
			//Logout
			
			driver.findElement(By.xpath("//span[@class='username']")).click();
			driver.findElement(By.xpath("//li[@class='dropdown user open']//ul//li[6]/a")).click();
			Thread.sleep(1000);
			
			// closing the browser
				  
			driver.close();
			
		}

	}	



