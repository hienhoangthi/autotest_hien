package Web2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DangNhapUserChuaTao {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\chromedriver-win64\\chromedriver.exe");		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost:5173/login");
		
		
		WebElement email =  driver.findElement(By.id(":r1:"));
		email.sendKeys("mylinhhh@gmail.com");
		Thread.sleep(1000);
		
		
		WebElement pass =  driver.findElement(By.id(":r3:"));
		pass.sendKeys("123456");
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div/main/div[2]/div/div/form/button")).click();
	}

}
