package UserActions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class TransactionHistory {
	
	
	public TransactionHistory() throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\smitr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    
		    driver.get("http://localhost:4200/home");
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\Novina_BNP\\Simplilearn_Projects\\Project 4\\Chrome Driver\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * 
		 * driver.get("http://localhost:4200/login");
		 */
	    Thread.sleep(5000);
	    
		/*
		 * driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		 * driver.findElement(By.xpath(
		 * "/html/body/app-root/app-login/div/form/div[1]/input")).sendKeys("Novina");
		 * driver.findElement(By.xpath(
		 * "/html/body/app-root/app-login/div/form/div[2]/input")).sendKeys("Novina123")
		 * ;
		 * 
		 * driver.findElement(By.xpath(
		 * "/html/body/app-root/app-login/div/form/div[3]/button")).click();
		 */
		try 
		{
			/*
			 * WebDriverWait wait=new WebDriverWait(driver, 14);
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
			 * "/html/body/app-root/app-home/div[1]/h2")));
			 * System.out.println("Login Successfull");
			 */
			
			driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"navbarsExample04\"]/ul/li[1]/a")).click();
			System.out.println("Transaction History Displayed");
			
			  
		    driver.findElement(By.xpath("//*[@id=\"dropdown04\"]")).click();
		    driver.findElement(By.xpath("//*[@id=\"navbarsExample04\"]/ul/li[7]/div/a[2]")).click();
		   // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-login/div/form/h3")));
		   System.out.println("Signed Out");
		}
		catch(Exception e) 
		{
			System.out.println("Error in browser!!\nPlease have a look");
		}
		
	    Thread.sleep(5000);  
	    driver.quit();

	}
}
