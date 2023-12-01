package Web2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TaoTheoMang {
	
	 public WebDriver driver;
	 
	  @BeforeMethod
	  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\chromedriver-win64\\chromedriver.exe");		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost:5173/sign-up");
	  }
	  @DataProvider (name = "mangUser")
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "a", "tran","a@gmail.com", "123456","123456"},
		  new Object[] {"b", "van","b@gmail.com", "123456","123456"},
//	      new Object[] { "binh", "tran","binh@gmail.com", "123456","123456"},
//	      new Object[] {"hung", "van","hung@gmail.com", "123456","123456"},
//	      new Object[] {"ngoc", "van","ngoc@gmail.com", "123456","123456"},
//	      new Object[] {"kha", "hoang","kha@gmail.com", "123456","123456"},
	    };
	  }
	  
      @Test (dataProvider = "mangUser")
  	  public void f(String fN, String lN, String email, String pass, String repass) throws InterruptedException {
	  	WebElement fName =  driver.findElement(By.id(":r1:"));
	  	fName.clear();
		fName.sendKeys(fN);
		Thread.sleep(1000);
		
		WebElement lastName =  driver.findElement(By.id(":r3:"));
		lastName.clear();
		lastName.sendKeys(lN);
		Thread.sleep(1000);
		
		
		WebElement em =  driver.findElement(By.id(":r5:"));
		em.clear();
		em.sendKeys(email);
		Thread.sleep(1000);
		
		
		WebElement pa =  driver.findElement(By.id(":r7:"));
		pa.clear();
		pa.sendKeys(pass);
		Thread.sleep(1000);
		
		
		WebElement re =  driver.findElement(By.id(":r9:"));
		re.clear();
		re.sendKeys(repass);
		Thread.sleep(1000);
		
		//Click Đăng ký
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/form/button")).click();
		Thread.sleep(1000);	

		
//		// Kiểm tra điều kiện đăng ký thành công
//        WebElement successMessage = driver.findElement(By.id("successMessage"));
//        assert successMessage.isDisplayed();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
