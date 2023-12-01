package Web2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaoCuocHoiThoai {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\chromedriver-win64\\chromedriver.exe");		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost:5173/login");
		
		
		WebElement email =  driver.findElement(By.id(":r1:"));
		email.sendKeys("thinh@gmail.com");
		Thread.sleep(1000);
		
		
		WebElement pass =  driver.findElement(By.id(":r3:"));
		pass.sendKeys("123456");
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div/main/div[2]/div/div/form/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/form/button")).click();
		Thread.sleep(1000);
		
		//TIM KIEM USER THEM VAO DOAN CHAT
		WebElement keyword =  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[1]/form/div/input"));
		keyword.sendKeys("h");
		Thread.sleep(1000);
		
		keyword.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[1]/div/ul/li/div[3]/button")).click();
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/ul")).click();
		
//		WebElement noidung =  driver.findElement(By.id("/html/body/div/div/div[2]/div[2]/div/form/div/input"));
//		noidung.sendKeys("Hello bạn, lâu ngày khum gặp?");
//		Thread.sleep(1000);
	}

}
