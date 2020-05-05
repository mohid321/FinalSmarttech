import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1st TestCase = go to CNN
		System.setProperty("webdriver.chrome.driver.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cnn.com/business");
		System.out.println(driver.getTitle());
		
// 2nd testcases = go to all page or Muule and get title
		
	//	List<WebElement> allPages = driver.findElements(By.x))
				
	}

}
