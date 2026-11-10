package cosmetiqueTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import cosmetiquePages.ReductionPage;

public class ReductionTest extends BaseTest {

	
	
	@Test(priority=4)
	public void discountApplication() {
		ReductionPage outPage= new ReductionPage(driver);
		outPage.discount();
		Assert.assertTrue(outPage.assertReduction(),"La page Reduction ne s'est pas affichée !");
	}
}
