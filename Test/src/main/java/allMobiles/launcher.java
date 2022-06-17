package allMobiles;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;





	public class launcher {
	WebDriver driver;
	@Test
	public void Lanching_the_Browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva.n\\eclipse-workspace\\Test\\src\\chromeDriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net");
	driver.manage().window().maximize();


	}
	}




