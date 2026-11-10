package cosmetiqueTests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;

public class BaseTest {
	
protected static WebDriver driver ;

@BeforeMethod
public void setUp() {
    ChromeOptions options = new ChromeOptions();

    options.addArguments("--no-proxy-server");
    options.addArguments("--proxy-server=direct://");
    options.addArguments("--proxy-bypass-list=*");
    options.addArguments("--ignore-certificate-errors");


    driver = new ChromeDriver(options);

    driver.manage().window().maximize();	
	driver.get("https://cosmetique.tn/connexion?back=https%3A%2F%2Fcosmetique.tn%2F");
	
	
	
}
@AfterMethod
public void close() {
if(driver !=null) {
driver.quit();
}
}
}

