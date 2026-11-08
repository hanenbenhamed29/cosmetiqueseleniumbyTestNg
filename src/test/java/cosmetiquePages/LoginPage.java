package cosmetiquePages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
 WebDriver driver;
 WebDriverWait wait;
private static final By inputEmail = By.id("field-email");
private static final By inputPassword = By.id("field-password");
private static final By inputConnexion = By.id("submit-login");

public LoginPage (WebDriver driver) {
	this.driver=driver;
} 

public void login(String email,String password) {
	driver.findElement(inputEmail).sendKeys(email);
	driver.findElement(inputPassword).sendKeys(password);
	driver.findElement(inputConnexion).click();
	
}

public boolean assertHomePage() {
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	return wait.until(ExpectedConditions.urlToBe("https://cosmetique.tn/"));
	

	
}
}


	
	
	
	
	
