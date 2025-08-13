package cosmetiquePages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LogOutPage {

	
	private WebDriver driver ;
	private WebDriverWait wait ;
	
	private static final By iconeProfile =By.id("header-user-btn");
	private static final By nameDeconnexion =By.cssSelector("a[href='https://cosmetique.tn/?mylogout=']");
	
	
	public LogOutPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void logOut(){
		try {
			
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement icone =wait.until(ExpectedConditions.elementToBeClickable(iconeProfile));
		icone.click();
		
		WebElement deconnexion =wait.until(ExpectedConditions.elementToBeClickable(nameDeconnexion));
		deconnexion.click();
		
		}catch(Exception e) {
			e.printStackTrace();
		}

		

	}
	public void assertLogin() {
		String expectedUrl="https://cosmetique.tn/panier?action=show";//we have bug in this link 
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(expectedUrl));
	   String actualUrl=driver.getCurrentUrl();
	   Assert.assertEquals(actualUrl, expectedUrl);
	}
}
 