package firsttestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import junit.framework.Test;


public class AdminAutomation {
	public String baseUrl = "http://localhost:4201";
    //String driverPath = ""C:\Users\smitr\Downloads\chromedriver_win32\chromedriver.exe"";
   String driverPath = "C:\\Users\\smitr\\Downloads\\chromedriver_win32\\chromedriver.exe\\";
    public WebDriver driver ;
 


  @BeforeTest
  public void launchBrowser() {

      System.out.println("Launching Chrome Browser");
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\smitr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
      WebDriver driver = new ChromeDriver();
      driver.get(baseUrl);
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }


@SuppressWarnings("deprecation")
@Test(priority=0) 
public void login_Pass() {
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.name("inputUserName")).sendKeys("admin");
		  driver.findElement(By.name("password")).sendKeys("admin@123");
		  //Login Button
		  driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/div[3]/button")).click();
		  String actualUrl="http://localhost:4200/user-account";
		  String expectedUrl= driver.getCurrentUrl();
		  if(actualUrl.equalsIgnoreCase(expectedUrl)) {
		  System.out.println("Login Successful"); }
		  driver.manage().window().maximize();
}


@Test(priority=1) 
public void useraccount_login_enabling(){

  //User Account Hyperlink
  driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/h3")).click();
  //Enable Button
  driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/div[3]/button")).click();
  System.out.println("Enabled Login Feature");
  //Disable Button
  driver.findElement(By.xpath("/html/body/app-root/app-user-account/table/tbody/tr[2]/td[7]/button")).click();
  System.out.println("Disabled Login Feature");
  }

  @Test(priority=2) 
  public void useraccount_features(){
  //Click on the dropdown
  driver.findElement(By.xpath("/html/body/app-root/app-user-account/table/tbody/tr/td[9]/select")).click();
  //Select the first option
  driver.findElement(By.xpath("/html/body/app-root/app-user-account/table/tbody/tr/td[9]/select/option[1]")).click();
  //Set button
  driver.findElement(By.xpath("/html/body/app-root/app-user-account/table/tbody/tr/td[9]/button")).click();
  System.out.println("User Roles Changed");
  }

  @Test(priority=4) 
  public void checkbookRequests() {
  //Checkbook Request Hyperlink
  driver.findElement(By.xpath("////*[@id=\"navbarsExample04\"]/ul/li[6]/a")).click();
  //Confirm Request Button
  driver.findElement(By.xpath("/html/body/div/div/div[3]/button[1]")).click();
  System.out.println("Request Confirmed");

  }

  @Test(priority=3) 
  public void authorization() {
  //Authorization link
  driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/div[3]/a")).click();
  //Create Account Button
  driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div")).click();
  System.out.println("Authorized");
  //Cancel Button
  driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[11]/button")).click();
  System.out.println(" Not Authorized");

  }

  @Test(priority=5) 
  public void logout() {
	//LogOut Button
  driver.findElement(By.xpath("/html/body/app-root/di//*[@id=\"navbarsExample04\"]/ul/li[7]/div/a[2]v/nav/div/ul/li[4]/a")).
  click(); System.out.println("Logged Out");

  }

  @Test(priority=6) 
  public void login_Fail() {
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.name("inputUserName")).sendKeys("admin");
		  driver.findElement(By.name("password")).sendKeys("admin@123");
		  //Login Button
		  driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/button")).click();
		  Alert alert = driver.switchTo().alert();
		  alert.accept();
		  String actualUrl="http://localhost:4200/user-account";
		  String expectedUrl= driver.getCurrentUrl();
		  if(!actualUrl.equalsIgnoreCase(expectedUrl)) {
		  System.out.println("Login UnSuccessful"); }
		  driver.manage().window().maximize();
}



}




