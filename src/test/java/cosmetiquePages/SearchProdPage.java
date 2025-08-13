package cosmetiquePages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SearchProdPage {

	private WebDriver driver;
	
	private static final By inputSearch=By.name("s");
	private static final By iconeSearch=By.className("search-btn");
	private static final By nameProduct=By.cssSelector("h2.product-title a");
	
	public SearchProdPage(WebDriver driver) {
		this.driver=driver;
		
		
	}
	
	public void serachProdut() {
		
		WebElement search=driver.findElement(inputSearch);
		search.sendKeys("Topface Mascara 3 dimension volume noir pt 314");
		WebElement button=driver.findElement(iconeSearch);
		
		
		//button.click();
		search.sendKeys(Keys.ENTER);
	
		
	}
	public void assertProductName() {
		String expectedName="Topface Mascara 3 dimension volume noir pt 314";
	
		WebElement title=driver.findElement(nameProduct);
		String actuelName=title.getText();
		Assert.assertEquals(actuelName, expectedName);
		
	}
	
	
	
}
