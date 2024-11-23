package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage {
	public WebDriver driver;
	
	public AddToCartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void select_size() {
		driver.findElement(By.id("va-size")).click();
	}
	
	public void add_to_cart() {
		driver.findElement(By.id("add-to-cart")).click();
	}
	
	public WebElement get_success_message() {
		WebElement successMessageElement= driver.findElement(By.xpath("//div[contains(text(),'Item successfully added to cart')]"));
		return successMessageElement;
	}
}
