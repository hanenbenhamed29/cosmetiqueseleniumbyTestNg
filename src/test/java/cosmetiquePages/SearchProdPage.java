package cosmetiquePages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchProdPage {

	private WebDriver driver;
	private WebDriverWait wait;
	
	private static final By inputSearch=By.name("s");
	private static final By iconeSearch=By.className("search-btn");
	private static final By nameProduct=By.xpath("//h3[contains(@class,'product-title')]/a");
	
	
	public SearchProdPage(WebDriver driver) {
		this.driver=driver;
		
		
	}
	
	public void serachProdut() {
		
		WebElement search=driver.findElement(inputSearch);
		search.sendKeys("Alania Masque capillaire Réparateur Prodige 150 g");
		WebElement button=driver.findElement(iconeSearch);
		
		
		//button.click();
		button.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameProduct));

		
	}
	public void assertProductName() {
		String expectedName="Alania Masque capillaire Réparateur Prodige 150 g";
	
		WebElement title=driver.findElement(nameProduct);
		String actuelName=title.getText();
		Assert.assertEquals(actuelName, expectedName);
		
	}
	
	
	
}
