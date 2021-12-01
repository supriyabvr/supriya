package selecal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Substraction_cal {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\supii\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.findElement(By.xpath("//a[contains(text(),'Math Calculators')]")).click();
	    driver.findElement(By.xpath("//div[@id='sciOutPut']")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'8')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'0')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'9')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'8')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	    

	}

}
