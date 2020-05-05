package step_Def;

import java.util.ArrayList;
import java.util.Collections;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.JsonDeserializer;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_Factory.Finalpf;

public class LoginStepdef {
	    static JavascriptExecutor js;
		static WebDriver driver;
		static Finalpf pf;// have to create in order to call from PageFactory page
		static Actions mouseover;
		static WebDriverWait explicit;
		

	@Given("^user open web browser and navigate to Automation Practice$")
	public void user_open_web_browser_and_navigate_to_Automation_Practice() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		// Initialize browser

		driver = new ChromeDriver();

		mouseover =new Actions(driver);
		// Open automation practice
		driver.get("http://automationpractice.com/index.php");
		
		explicit = new WebDriverWait(driver, 20);
		

		// Maximize browser
		driver.manage().window().maximize();
		
		
		
		pf = PageFactory.initElements(driver, Finalpf.class);
		js = (JavascriptExecutor) driver;

	}

	@Given("^user click on sign in button$")
	public void user_click_on_sign_in_button() throws Throwable {
		//driver.findElement(By.xpath("//*[contains(text(),'Sign in')]")).click();
		pf.getSgin_btn().click();
	}

	@Given("^user enter valid username and password$")
	public void user_enter_valid_username_and_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("mhossain789@gmail.com");
//		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("12345678");
		pf.getUs().sendKeys("mhossain789@gmail.com");
		pf.getPass().sendKeys("12345678");
	}

	@Given("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	pf.getLogin().click();
	}

	@Given("^user navigate to page to verify \"([^\"]*)\" as page title$")
	public void user_navigate_to_page_to_verify_as_page_title(String arg1) throws Throwable {
		
	 System.out.println(driver.getTitle());
	}

	@When("^user click on dress icon to see five items$")
	public void user_click_on_dress_icon_to_see_five_items() throws Throwable {
	
		pf.getDress_btn().click();	
	}

	@Then("^user print all dress price in decending order$")
	public void user_print_all_dress_price_in_decending_order() throws Throwable {
		
		ArrayList<String> prices = new ArrayList<String>();
		
		
		explicit.until(ExpectedConditions.visibilityOf(pf.getDress1()));
		
		prices.add(pf.getDress1().getText());
		
		explicit.until(ExpectedConditions.visibilityOf(pf.getDress2()));

		prices.add(pf.getDress2().getText());
		
		explicit.until(ExpectedConditions.visibilityOf(pf.getDress3()));
		prices.add(pf.getDress3().getText());
		
		explicit.until(ExpectedConditions.visibilityOf(pf.getDress4()));
		
		prices.add(pf.getDress4().getText());
		
		explicit.until(ExpectedConditions.visibilityOf(pf.getDress5()));
		
		
		prices.add(pf.getDress5().getText());
		
		

		for (String str : prices) {

			System.out.println(str);

		}
		
		

		Collections.sort(prices, Collections.reverseOrder());

		System.out.println("ArrayList in descending order:");
		for (String str : prices) {
			System.out.println(str);
		}
		
		
	}

	@Then("^user select the second dress on the list$")
	public void user_select_the_second_dress_on_the_list() throws Throwable {
	
		explicit.until(ExpectedConditions.visibilityOf(pf.getSecdress()));
		
		mouseover.moveToElement(pf.getSecdress()).perform();

		}
	@Then("^user add dress to the cart$")
	public void user_add_dress_to_the_cart() throws Throwable {
		
	explicit.until(ExpectedConditions.elementToBeClickable(pf.getCart()));
	
	pf.getCart().click();	
	
	}
	
	@Then("^user click on proceed button$")
	public void user_click_on_proceed_button() throws Throwable {
		
		
		explicit.until(ExpectedConditions.elementToBeClickable(pf.getProced()));
		pf.getProced().click();


	}
    @Then("^user verify total price with shipping$")
    public void user_verify_total_price_with_shipping() throws Throwable {
    	
    	js.executeScript("window.scrollBy(0,500)");	
    	
    //	we used explicit waite
    explicit.until(ExpectedConditions.visibilityOf(pf.getTotalprice()));
    String totalprice = pf.getTotalprice().getText();
    System.out.println("verifying total price " + totalprice); 
    String expectedprice = "$52.99";
    Assert.assertEquals(expectedprice, totalprice);
    
    	
    }
    @Then("^user logout from Automation practice$")
    public void user_logout_from_Automation_practice() throws Throwable {
   	
	//	js.executeScript("window.scrollTo(0, 0)");
		
		explicit.until(ExpectedConditions.elementToBeClickable(pf.getLogout()));
    	
    pf.getLogout().click();
    	   
}
    @Then("^user close the window$")
    public void user_close_the_window() throws Throwable {
    	
    	driver.close();
    
    
}
}

	
	

	   
	
	

	

	



	