package UserActions;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Register {

	@Test
	public void register() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smitr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
	    
		WebDriver driver = new ChromeDriver();
	    
	    driver.get("http://localhost:4200/login");
	    Thread.sleep(5000);
	    
	    try {
	    	//WebDriverWait wait=new WebDriverWait(driver, 14);
	    	driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/div[3]/a")).click();
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[1]/input")).sendKeys("mrityunjay");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[2]/input")).sendKeys("thakur");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[3]/input")).sendKeys("mrityunjay");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[4]/input")).sendKeys("thakur123");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[5]/input")).sendKeys("17/08/2020");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[6]/input")).sendKeys("1234567890");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[7]/input")).sendKeys("Bangalore");
	    	Select id=new Select(driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[8]/select")));
	    	id.selectByIndex(2);
	    	//WebElement fileInput = driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[9]/select"));
	    	//fileInput.sendKeys("\"C:\\Users\\smitr\\Downloads\\assassins-creed-valhalla-pc-games-playstation-4-playstation-7680x4320-6153.jpg\"");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[9]/input")).sendKeys("1234");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[10]/input")).sendKeys("thakur@gmail.com");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[11]/button")).click();
	    	Thread.sleep(5000);
	    	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-login/div/form/h3")));
	    	System.out.println("Registration Successfull");
	    }
	    catch(Exception e) {
	    	System.out.println("Erro in web browser\nPlease have a look");
	    }
	    Thread.sleep(5000);  
	    driver.quit();
	}
}
