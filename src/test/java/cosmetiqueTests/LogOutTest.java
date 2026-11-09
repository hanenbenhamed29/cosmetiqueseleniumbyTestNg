package cosmetiqueTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import cosmetiquePages.LogOutPage;

public class LogOutTest extends BaseTest {

	
	
	@Test(priority=4)
	public void logOutApplication() {
		LogOutPage outPage= new LogOutPage(driver);
		outPage.logOut();
		Assert.assertTrue(outPage.assertReduction(),"La page Reduction ne s'est pas affichée !");
	}
}
