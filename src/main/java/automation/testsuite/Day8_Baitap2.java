package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.common.CommonBase;

public class Day8_Baitap2 extends CommonBase{
	@BeforeMethod
	public void openBrowser(){
		driver = initChromeDriver("https://automationfc.github.io/basic-form/index.html");}
	
	@Test 
	public void getElementBy() {
		WebElement txtName = driver.findElement(By.id("name"));
		System.out.println(txtName);
		
		WebElement txtAddress = driver.findElement(By.name("address"));
		System.out.println(txtAddress);
		
		WebElement linkCopyRight = driver.findElement(By.linkText("Dam Dao - AutomationFC"));
		System.out.println(linkCopyRight);
		
		WebElement partialLinkCopyRight = driver.findElement(By.partialLinkText("AutomationFC"));
		System.out.println(partialLinkCopyRight);
		
		WebElement tagName = driver.findElement(By.tagName("button"));
		System.out.println(tagName);
	
		
	}
}
