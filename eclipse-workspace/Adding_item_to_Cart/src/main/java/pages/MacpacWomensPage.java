package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MacpacWomensPage {
	public WebDriver driver;
	
	public MacpacWomensPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void select_Item() {
		driver.findElement(By.xpath("//a[normalize-space()='macpac Womens Uber Light Down Jacket']")).click();
	}
	

}
