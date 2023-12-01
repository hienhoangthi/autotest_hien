package Web2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DangKy_EmailSaiFormat {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\chromedriver-win64\\chromedriver.exe");		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost:5173/sign-up");
		
		WebElement fName =  driver.findElement(By.id(":r1:"));
		fName.sendKeys("tran");
		Thread.sleep(1000);
		
		WebElement lastName =  driver.findElement(By.id(":r3:"));
		lastName.sendKeys("kyyy");
		Thread.sleep(1000);
		
		
		WebElement email =  driver.findElement(By.id(":r5:"));
		email.sendKeys("1234@gmail.com");
		Thread.sleep(1000);
		
		
		WebElement pass =  driver.findElement(By.id(":r7:"));
		pass.sendKeys("123456");
		Thread.sleep(1000);
		
		
		WebElement repass =  driver.findElement(By.id(":r9:"));
		repass.sendKeys("123456");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/form/button")).click();
		Thread.sleep(1000);
	}

}
