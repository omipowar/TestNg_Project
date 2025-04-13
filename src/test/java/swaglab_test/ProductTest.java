package swaglab_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import swaglab_pages.CartPage;
import swaglab_pages.LoginPage;
import swaglab_pages.ProductPage;

public class ProductTest extends BaseClass {
	WebDriver driver=BaseClass.driver;
	
	@Test 
	public void AddToCartTest() {
		LoginPage lp = new LoginPage();
		lp.LoginFunction("standard_user","secret_sauce");
		
		ProductPage pp = new ProductPage();
		pp.AddToCart("Sauce Labs Bolt T-Shirt");
		
			
		WebElement ProductInCart = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		Assert.assertEquals(ProductInCart.getText(),"Sauce Labs Bolt T-Shirt");

	}
	
}
