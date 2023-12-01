package Web2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DangKy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\chromedriver-win64\\chromedriver.exe");		 
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("http://localhost:5173/sign-up");
			
			WebElement fName =  driver.findElement(By.id(":r1:"));
			fName.sendKeys("vu");
			Thread.sleep(1000);
			
			WebElement lastName =  driver.findElement(By.id(":r3:"));
			lastName.sendKeys("thinh");
			Thread.sleep(1000);
			
			
			WebElement email =  driver.findElement(By.id(":r5:"));
			email.sendKeys("thinh@gmail.com");
			Thread.sleep(1000);
			
			
			WebElement pass =  driver.findElement(By.id(":r7:"));
			pass.sendKeys("123456");
			Thread.sleep(1000);
			
			
			WebElement repass =  driver.findElement(By.id(":r9:"));
			repass.sendKeys("123456");
			Thread.sleep(1000);
			

			driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/form/div/div[6]/div/div/div/button")).click();
			Thread.sleep(1000);
				
			WebElement year =  driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]/button"));
			year.click();
			Thread.sleep(1000);
			
			//Năm 2012
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div/div[113]/button")).click();
			Thread.sleep(1000);
			
			
			//Ngày 6
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/button[5]")).click();
			Thread.sleep(1000);
			
			//Gioi tinh
					
			WebElement gioiTinh = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/form/div/div[7]/div/div"));
			gioiTinh.click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[3]")).click();
			Thread.sleep(1000);
			
			//Click Đăng ký
			driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/form/button")).click();
			Thread.sleep(1000);	

	}

}
