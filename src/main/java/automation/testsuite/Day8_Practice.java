package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day8_Practice extends CommonBase {
	@BeforeMethod
	public void openBrowser(){
		driver = initChromeDriver("https://alada.vn/tai-khoan/dang-ky.html");
	}
	
	@Test
	public void getElementByID(){
		WebElement txtHovaTen = driver.findElement(By.id("txtFirstname"));
		System.out.println(txtHovaTen);
		
		WebElement txtEmail = driver.findElement((By.name("txtEmail")));
		System.out.println(txtEmail);
		
		WebElement linkChinhSach = driver.findElement(By.linkText("chính sách"));
		System.out.println(linkChinhSach);
		
		WebElement linkThoaThuan = driver.findElement(By.partialLinkText("thỏa thuận sử dụng"));
		System.out.println(linkThoaThuan);
		
		WebElement checkboxDongY = driver.findElement(By.className("marleft0"));
		System.out.println(checkboxDongY);
		
		WebElement buttonDangKy = driver.findElement(By.tagName("button"));
		System.out.println(buttonDangKy);
	} 
	
	
	
}
