package page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Finalpf {
	WebDriver driver;

	public Finalpf(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

}

	@FindBy (how = How.XPATH,using = "//*[@class ='login']")
	private WebElement sgin_btn;
	
	@FindBy (how = How.NAME,using = "email")
	private WebElement us;
	
	@FindBy (how = How.XPATH,using = "//*[@id='passwd']")
	private WebElement pass;
	
	
	@FindBy (how = How.XPATH,using = "//*[@class='icon-lock left']")
	private WebElement login;
	
	@FindBy (how = How.XPATH,using = "(//*[@title='Dresses'])[2]")
	private WebElement dress_btn;
	
	public WebElement getDress_btn() {
		return dress_btn;
	}

	public void setDress_btn(WebElement dress_btn) {
		this.dress_btn = dress_btn;
	}

	@FindBy (how = How.XPATH,using = "(//*[@class='price product-price'])[2]")
	private WebElement dress1;
	
	@FindBy (how = How.XPATH,using = "(//*[@class='price product-price'])[4]")
	private WebElement dress2;
	
	@FindBy (how = How.XPATH,using = "(//*[@class='price product-price'])[6]")
	private WebElement dress3;
	
	@FindBy (how = How.XPATH,using = "(//*[@class='price product-price'])[8]")
	private WebElement dress4;
	
	@FindBy (how = How.XPATH,using = "(//*[@class='price product-price'])[10]")
	private WebElement dress5;
	
	@FindBy (how = How.XPATH,using = "(//*[@class='right-block'])[2]")
	private WebElement secdress; 
	
	@FindBy (how = How.XPATH,using = "(//*[contains(text(),'Add to cart')])[2]")
	private WebElement cart; 
	
	@FindBy (how = How.XPATH,using = "//*[@class='btn btn-default button button-medium']")
	private WebElement proced;
	
	@FindBy (how = How.XPATH,using = "//*[@id='total_price']")
	private WebElement totalprice;
	
	@FindBy (how = How.XPATH,using = "//*[@class='logout']")
	private WebElement logout;
	
	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
	}

	public WebElement getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(WebElement totalprice) {
		this.totalprice = totalprice;
	}

	public WebElement getProced() {
		return proced;
	}

	public void setProced(WebElement proced) {
		this.proced = proced;
	}

	public WebElement getCart() {
		return cart;
	}

	public void setCart(WebElement cart) {
		this.cart = cart;
	}

	public WebElement getSecdress() {
		return secdress;
	}

	public void setSecdress(WebElement secdress) {
		this.secdress = secdress;
	}

	public WebElement getDress5() {
		return dress5;
	}

	public void setDress5(WebElement dress5) {
		this.dress5 = dress5;
	}

	public WebElement getDress4() {
		return dress4;
	}

	public void setDress4(WebElement dress4) {
		this.dress4 = dress4;
	}

	public WebElement getDress3() {
		return dress3;
	}

	public void setDress3(WebElement dress3) {
		this.dress3 = dress3;
	}

	public WebElement getDress2() {
		return dress2;
	}

	public void setDress2(WebElement dress2) {
		this.dress2 = dress2;
	}

	
	
	
	
	
	public WebElement getDress1() {
		return dress1;
	}

	public void setDress1(WebElement dress1) {
		this.dress1 = dress1;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}

	

	public WebElement getUs() {
		return us;
	}

	public void setUs(WebElement us) {
		this.us = us;
	}

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSgin_btn() {
		return sgin_btn;
	}

	public void setSgin_btn(WebElement sgin_btn) {
		this.sgin_btn = sgin_btn;
	}

	
	}

	

