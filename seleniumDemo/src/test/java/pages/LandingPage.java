package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
public static final String URL = "http://automationpractice.com/index.php";
	
	//this will be useful for testing own front-end of project, it may be slower and more bulky to create a class for each page, but it is more readable.
	//on this note, a class MUST be created for each page being used.
	
	private WebDriver driver;
	
	@FindBy(id = "search_query_top")
	private WebElement searchbar;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement dressImage;
	
	@FindBy(xpath = "//html/body/div/div[2]/div/div[4]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span")
	private WebElement cartButton;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	private WebElement checkoutButton;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void search(String searchText) {
		searchbar.sendKeys(searchText);
		searchbar.submit();
	}
	
	public void pickDress() {
		dressImage.click();
	}
	
	public void addToCart() {
		cartButton.click();
	}
	
	public void checkout() {
		checkoutButton.click();
	}
//	
//	search_query form-control ac_input
}
