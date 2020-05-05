package javaFinal;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class JavaCoding {
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
		

		// This is
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		// Initialize browser

		WebDriver driver = new ChromeDriver();

		// Open automation practice
		driver.get("http://automationpractice.com/index.php");

		// Maximize browser
		driver.manage().window().maximize();
		// click_to_signin btn and click it
		WebElement signin = driver.findElement(By.xpath("//*[@class = 'login']"));
		signin.click();
		// print_website_Tittle
		
		
		//put UserName and Password then Click it
		
		//for username
		WebElement username = driver.findElement(By.xpath("(//*[ @name='email'])[1]"));
		username.sendKeys("rakib123@gmail.com");
		//for password
		WebElement password = driver.findElement(By.xpath("(//*[@name = 'passwd'])"));
		password.sendKeys("123456");
		
		// print_website_Tittle
				System.out.println(driver.getTitle());
		
		
		
		//for loging_btn
		WebElement loging_btn = driver.findElement(By.xpath("//*[@class='icon-lock left']"));
		loging_btn.click();
		
		WebElement Dress_btn = driver.findElement(By.xpath("(//*[@title='Dresses'])[2]"));
		Dress_btn.click();
		

		
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		
		System.out.println(driver.findElement(By.xpath("(//*[@class='price product-price'])[2]")).getText());

		WebElement p1 = driver.findElement(By.xpath("(//*[@class='price product-price'])[2]"));
		WebElement p2 = driver.findElement(By.xpath("(//*[@class='price product-price'])[4]"));
		WebElement p3 = driver.findElement(By.xpath("(//*[@class='price product-price'])[6]"));
		WebElement p4 = driver.findElement(By.xpath("(//*[@class='price product-price'])[8]"));
		WebElement p5 = driver.findElement(By.xpath("(//*[@class='price product-price'])[10]"));

		ArrayList<String> price = new ArrayList<String>();

		price.add(p1.getText());
		price.add(p2.getText());
		price.add(p3.getText());
		price.add(p4.getText());
		price.add(p5.getText());

		for (String allprices : price) {
			System.out.println(allprices);
		}

		Collections.sort(price, Collections.reverseOrder());
		System.out.println("ArrayList in descending order");

		for (String allprices : price) {
			System.out.println(allprices);
		}

		WebElement rightblock = driver.findElement(By.xpath("(//*[@class='right-block'])[2]"));
		WebElement cart = driver.findElement(By.xpath("(//*[@title='Add to cart'])[2]"));
		WebElement checkout = driver.findElement(By.xpath("//*[@class='btn btn-default button button-medium']"));

		Actions mouseover = new Actions(driver);
		mouseover.moveToElement(rightblock).perform();
		cart.click();

		Thread.sleep(2000);
		checkout.click();

		js.executeScript("window.scrollBy(0, 500)");

		String totalprice = driver.findElement(By.xpath("//*[@id='total_price']")).getText();
		System.out.println("total price with shipping: " + totalprice);

		// String finalprice = "$52.00";

		String finalprice = "$52.99";
		Assert.assertEquals(finalprice, totalprice);

		// Thread.sleep(3000);

		js.executeScript("window.scrollBy(0, -500)");

		driver.findElement(By.xpath("//*[@class='logout']")).click();

		
	












			
		}
		
	
		
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


