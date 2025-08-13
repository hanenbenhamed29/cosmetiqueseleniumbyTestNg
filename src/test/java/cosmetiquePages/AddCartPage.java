package cosmetiquePages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddCartPage {
 private WebDriver driver;
 private WebDriverWait wait;
    
	private static final By titleproduct=By.linkText("Topface Mascara 3 dimension volume noir pt 314");
	private static final By titleProduct2=By.cssSelector("h1.page-title");
	private static final By addProductCart=By.cssSelector("button.btn.btn-primary.btn-lg.add-to-cart");
	private static final By visibleModel =By.id("blockcart-modal");
	private static final By btnCommander = By.cssSelector("#blockcart-modal .cart-content-btn a.btn.btn-primary");
	private static final By titleAddProduct=By.cssSelector("modal-header.modal-title");
	private static final By priceProduct =By.cssSelector("div.col.col-auto.col-md.price span.product-price strong");
	
	
	public AddCartPage(WebDriver driver) {
	    this.driver=driver;
	}
	
	//---first void cliquer sur le titre de produit 
	public void clickAllMyProduct() {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement product=wait.until(ExpectedConditions.visibilityOfElementLocated(titleproduct));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", product);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", product);
		//product.click();
	}
	
	
	
	//--assert url de mon produit 
	public boolean assertDetails() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.urlToBe("https://cosmetique.tn/les-mascaras/2407-mascara-3-dimension-volume-noir-pt314-topface.html"));
	}

		
	//--assert par titre de mon produit 
	public void assertNameProduct() {
		String expectedNameProduct="Topface Mascara 3 dimension volume noir pt 314";
		
		
		WebElement title1 =driver.findElement(titleProduct2);
		String actualNameProduct=title1.getText();
		
		Assert.assertEquals(actualNameProduct,expectedNameProduct);
	}
	//--ajouter le produit au panier 
	public void clickAddToCart()  {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));//meme chose que 		new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement add =driver.findElement(addProductCart);
		add.click();
		try {
			WebElement poup=wait.until(ExpectedConditions.visibilityOfElementLocated(visibleModel));
			WebElement commander=wait.until(ExpectedConditions.elementToBeClickable(btnCommander));
			commander.click();
			//Thread.sleep(5000);
		}catch (Exception e) 
		{System.out.println("add to cart failed: "+e.getMessage());
			
		}
		
	} 
	
	public void assertWithLink() {
		String expectedUrl="https://cosmetique.tn/panier?action=show";
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(expectedUrl));
		String actualUrl=driver.getCurrentUrl();
		
		Assert.assertEquals(expectedUrl, actualUrl);
		
	}
	public void assertPrice() {
	String expectedPrice ="28,200 TND";
	WebElement price =driver.findElement(priceProduct);
	
	// Use JavaScript to get the float value directly
    String actualPrice =price.getText().trim().replace("\u00a0", " ");
    Assert.assertEquals(expectedPrice, actualPrice); // The third parameter is the delta for float comparison
	}

	
	public void assertAddProductToCart() {
		
		String expectedAddProduct="Produit ajouté au panier avec succès";
		WebElement title2= driver.findElement(titleAddProduct);
		String actualAddProduct=title2.getText();
		Assert.assertEquals(actualAddProduct,expectedAddProduct);
	}
	
}

