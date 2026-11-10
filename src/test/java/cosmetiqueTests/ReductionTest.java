package cosmetiqueTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import cosmetiquePages.ReductionPage;

public class ReductionTest extends BaseTest {

	
	
	@Test(priority=4)
	public void OpendiscountApplication() {
		ReductionPage discount= new ReductionPage(driver);
		discount.discount();
		Assert.assertTrue(discount.assertReduction(),"La page Reduction ne s'est pas affichée !");
	}
}
