package Web2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaoNhomMoiKhongCoThanhVien {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\chromedriver-win64\\chromedriver.exe");		 
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("http://localhost:5173/login");
			
			
			WebElement email =  driver.findElement(By.id(":r1:"));
			email.sendKeys("xuan@gmail.com");
			Thread.sleep(1000);
			
			
			WebElement pass =  driver.findElement(By.id(":r3:"));
			pass.sendKeys("123456");
			Thread.sleep(1000);
	
			driver.findElement(By.xpath("/html/body/div/main/div[2]/div/div/form/button")).click();
			
			//Nhấn tạo nhóm mới
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/button/span[1]")).click();
			
			//Nhập tên nhóm
			WebElement namegroup =  driver.findElement(By.xpath("/html/body/div[2]/div[3]/form[1]/div/div/input"));
			namegroup.sendKeys("NHÓM MỚI TOANH NÈ NHA MỌI NGƯỜI ƠI");
			Thread.sleep(1000);
			
			
			//Them thành viên
			WebElement key =  driver.findElement(By.xpath("/html/body/div[2]/div[3]/form[2]/div/div/div/input"));
			key.sendKeys("hiền");
			Thread.sleep(1000);
			key.sendKeys(Keys.ENTER);
			
			//Nhấn create
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/button")).click();
	}

}
