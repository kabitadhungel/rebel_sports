package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MacpacPage {
	public WebDriver driver;
	
	public MacpacPage(WebDriver driver) {
		this.driver=driver;
	}
		
	public void click_womens() {
		WebElement imageElement = driver.findElement(By.xpath("//img[@src='/on/demandware.static/-/Library-Sites-rebel-shared-library/default/dw7cc30f88/brand/macpac/cards/240429-XPLP-Macpac-Category-Womens.jpg'"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", imageElement);
		imageElement.click();
		}
}
	


