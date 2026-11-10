package cosmetiqueTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import cosmetiquePages.AddCartPage;

public class CartTest extends BaseTest {

    @Test(priority = 3)
    public void addProductCart() {
    	

        AddCartPage cartProduct = new AddCartPage(driver);

        cartProduct.clickAllMyProduct();

        Assert.assertTrue(
            cartProduct.assertDetails(),
            "Product URL verification failed"
        );

        cartProduct.assertNameProduct();

        cartProduct.clickAddToCart();

        cartProduct.assertAddProductToCart();
        cartProduct.commanderproduct();
        cartProduct.assertWithLink();
    }
}