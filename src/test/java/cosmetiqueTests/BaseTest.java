package cosmetiqueTests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;



//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
protected static WebDriver driver ;

@BeforeTest
public void setUp() {

    driver = new ChromeDriver();
    driver.manage().window().maximize();	
	driver.get("https://cosmetique.tn/connexion?back=https%3A%2F%2Fcosmetique.tn%2F");
	
	
	
}
@AfterTest
public void close() {
if(driver !=null) {
driver.quit();
}
}
}

