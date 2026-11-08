package cosmetiquePages;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddCartPage {
 WebDriver driver;
 WebDriverWait wait;
    
	private static final By titleproduct=By.xpath("//img[@alt='Alania Masque capillaire Réparateur Prodige 150 g']/ancestor::a[1]");
	private static final By titleProduct2=By.cssSelector("h1.page-title");
	private static final By addProductCart=By.xpath("//button[@class='btn btn-primary btn-lg add-to-cart']");
	private static final By titleAddProduct=By.xpath("//div[@class='modal-header']/span[@class='modal-title' and contains(.,'Produit ajouté au panier avec succès')]");

	//private static final By visibleModel =By.id("blockcart-modal");
	private static final By btnCommander = By.cssSelector("#blockcart-modal .cart-content-btn a.btn.btn-primary");
	
	public AddCartPage(WebDriver driver) {
	    this.driver = driver;
	    this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	//---first void cliquer sur le titre de produit 
	public void clickAllMyProduct() {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement product=wait.until(ExpectedConditions.visibilityOfElementLocated(titleproduct));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", product);
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", product);
		product.click();
	}
	
	
	
	//--assert url de mon produit 
	public boolean assertDetails() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.urlToBe("https://cosmetique.tn/masques/10022-alania-masque-reparateur-prodige-150g.html"));
	}

		
	//--assert par titre de mon produit 
	public void assertNameProduct() {
		String expectedNameProduct="Alania Masque capillaire Réparateur Prodige 150 g";
		
		
		WebElement title1 =driver.findElement(titleProduct2);
		String actualNameProduct=title1.getText();
		
		Assert.assertEquals(actualNameProduct,expectedNameProduct);
	}
	//--ajouter le produit au panier 
	public void clickAddToCart()  {
		//WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));

		WebElement add =driver.findElement(addProductCart);
		add.click();
		
		
		
	}
		
public void assertAddProductToCart() {
			
			String expectedAddProduct="Produit ajouté au panier avec succès";
			//WebElement title2=driver.findElement(titleAddProduct);
			WebElement title2=wait.until(ExpectedConditions.visibilityOfElementLocated(titleAddProduct));
			String actualAddProduct=title2.getText();
			//Assert.assertEquals(actualAddProduct,expectedAddProduct);
			Assert.assertTrue(actualAddProduct.contains(expectedAddProduct));
}
public void commanderproduct() {
			WebElement commander=wait.until(ExpectedConditions.elementToBeClickable(btnCommander));
			commander.click();
		
	} 
	
	public void assertWithLink() {
		String expectedUrl="https://cosmetique.tn/commande";
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(expectedUrl));
		String actualUrl=driver.getCurrentUrl();
		
		Assert.assertEquals(expectedUrl, actualUrl);
		
	}
	


	
	
	
}