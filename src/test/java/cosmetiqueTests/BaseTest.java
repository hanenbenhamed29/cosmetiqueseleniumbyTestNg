package cosmetiqueTests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
protected static WebDriver driver ;

@Parameters("url")
@BeforeTest
public void setUp(String url) {
	if(driver==null) {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver() ;
	driver.manage().window().maximize();
	//String url ="https://cosmetique.tn/";
	driver.get(url);
	
	}
	
}
@AfterTest
public void close() {
if(driver !=null) {
driver.quit();
}
}
}

