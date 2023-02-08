import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class MidTerm {

	@Test
	void test() throws InterruptedException {
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		driver.findElement(By.xpath("//*[@id=\"vfb-5\"]")).sendKeys("Arpapat");
		driver.findElement(By.xpath("//*[@id=\"vfb-7\"]")).sendKeys("Yipram");
		
		driver.findElement(By.xpath("//*[@id=\"vfb-13-address\"]")).sendKeys("115 ");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-address-2\"]")).sendKeys("456");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-city\"]")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("工没傲");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-zip\"]")).sendKeys("工没傲");
		
		driver.findElement(By.xpath("//*[@id=\"vfb-14\"]")).sendKeys("Arpapat236@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"vfb-18\"]")).sendKeys("02/08/2023");
		driver.findElement(By.xpath("//*[@id=\"vfb-18\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"vfb-19\"]")).sendKeys("1234567890");
		
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-20-0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-5\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"vfb-23\"]")).sendKeys("java");
		driver.findElement(By.xpath("//*[@id=\"vfb-3\"]")).sendKeys("99");
		driver.findElement(By.xpath("//*[@id=\"vfb-4\"]")).click();
		
		
		//Add Valiabate  and Assert
        String result = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div/div/div/div/div/div/h2")).getText();

        assertEquals("Dynamic Transaction Verification",result);
        
		Thread.sleep(2000);
		driver.quit();
        driver = null;

	}
}
