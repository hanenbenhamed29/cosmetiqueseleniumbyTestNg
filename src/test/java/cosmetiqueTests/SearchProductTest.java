package cosmetiqueTests;

import org.testng.annotations.Test;

import cosmetiquePages.SearchProdPage;

public class SearchProductTest extends BaseTest {

	@Test(priority=2)
	public void searchMyprod() {
	SearchProdPage recherche =new SearchProdPage(driver); 
	recherche.serachProdut();
	recherche.assertProductName();
		
	}
	
	
	
	
	
}
