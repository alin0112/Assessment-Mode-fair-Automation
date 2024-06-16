package Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Convert currency from MYR to JPY then Swap currencies
public class TC002 {
	
	public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver driver= new ChromeDriver();
			
			driver.get("https://www.xe.com/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("(//label[text()='From']//following::input[@class='sc-73a056d4-0 sc-72844c23-5 eVknbT elaqNT combobox-input'])[1]")).sendKeys("MYR");
			driver.findElement(By.xpath("//ul[@id='midmarketFromCurrency-listbox']//following::div[text()='MYR']")).click();
			
			driver.findElement(By.xpath("(//label[text()='To']//following::input[@class='sc-73a056d4-0 sc-72844c23-5 eVknbT elaqNT combobox-input'])[1]")).sendKeys("JPY");
			driver.findElement(By.xpath("//ul[@id='midmarketToCurrency-listbox']//following::div[text()='JPY']")).click();

			driver.findElement(By.xpath("//label[text()='Amount']//following::input[@id='amount']")).sendKeys("100.00");	
			
			driver.findElement(By.xpath("//button[text()='Convert']")).click();
			
			driver.findElement(By.xpath("//div[@class='sc-4f0f6f94-3 gLhOsR']//button[@aria-label='Swap currencies']")).click();
			
			Thread.sleep(10000);
					
		    driver.close();
			
			
	}

}
