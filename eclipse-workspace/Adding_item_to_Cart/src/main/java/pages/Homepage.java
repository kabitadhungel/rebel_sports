package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Homepage{
	public WebDriver driver;
	
	public Homepage(WebDriver driver){
		this.driver=driver;	
	}
	
	public void hoverOverBrands() {
		WebElement brandsElement=driver.findElement(By.xpath("//a[text()='Brands']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(brandsElement).perform();
	}
	
	public void clicks_macpac(){
		driver.findElement(By.xpath("//a[@id='240903-MM-Brands-Macpac']//div[@class='thumb']")).click();	
	}
}