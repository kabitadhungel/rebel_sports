package step_definition;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddToCartPage;
import pages.Homepage;
import pages.MacpacPage;
import pages.MacpacWomensPage;


public class StepDefinition{
	private WebDriver driver;
	private Homepage homepage;
	private MacpacPage macpacPage;
	private MacpacWomensPage womensPage;
	private AddToCartPage cartPage;
	
	@Before 
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "/Users/kabitadhungel/eclipse-workspace/Adding_item_to_Cart/src/test/java/Resources/chromedriver" );
	driver = new ChromeDriver();
	homepage = new Homepage(driver);
	macpacPage= new MacpacPage(driver);
	womensPage= new MacpacWomensPage(driver);
	cartPage= new AddToCartPage(driver); 
	driver.manage().window().maximize();
	}
	
	@Given("User is on the homepage")
	public void user_is_on_the_homepage() {
		driver.get("https://www.rebelsport.com.au/");
	}
	
	@When("User navigates to Brands")
	public void user_navigates_to_brands_clicks_macpac() {
		homepage.hoverOverBrands();
	}
	
	@And ("User clicks macpac")
	public void user_clicks_macpac() {
		homepage.clicks_macpac();
	}
	
	@And("User clicks womens category")
	public void user_is_on_macpac_page() {
		macpacPage.click_womens();
	}
	
	@And("User selects the item from displayed list")
	public void user_selects_item() {
		womensPage.select_Item();
	}
	
	@When("User selects the size eight")
	public void selecting_size() {
		cartPage.select_size();
	}
	
	@And("User click Add to Cart")
	public void adding_to_cart() {
		cartPage.add_to_cart();
	}
	
	@Then("Item will be successfully added to cart")
	public void validation_of_item_added() {
		String actualMessage = cartPage.get_success_message().getText();
		String expectedMessage = "Item successfully added to cart";
		Assert.assertEquals("Item is cannot be added to cart!", expectedMessage, actualMessage);
		
	}
	
	@After
	public void teardown() {
		if(driver !=null) {
			driver.quit();
		}		
	}
	
	
}