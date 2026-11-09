package cosmetiquePages;

// static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

public class LogOutPage {

	
	 WebDriver driver ;
	 WebDriverWait wait ;
	
	private static final By iconeProfile =By.id("header-user-btn");
	private static final By nameReduction =By.cssSelector("a.dropdown-item[href='https://cosmetique.tn/reduction']");
	
	public LogOutPage(WebDriver driver) {
		this.driver=driver;
	    this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	}
	public void logOut(){
		try {
			
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement icone =wait.until(ExpectedConditions.elementToBeClickable(iconeProfile));
		icone.click();
		
		WebElement reduction =wait.until(ExpectedConditions.elementToBeClickable(nameReduction));
		reduction.click();
		
		}catch(Exception e) {
			e.printStackTrace();
		}

		

	}
	/*public void assertLogin() {
		String expectedUrl="https://cosmetique.tn/reduction";//we have bug in this link 
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(expectedUrl));
	    String actualUrl=driver.getCurrentUrl();
	    Assert.assertEquals(actualUrl, expectedUrl);
	}*/
	
	
	public boolean assertLogin() {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.urlToBe("https://cosmetique.tn/reduction"));
		
}

}
 