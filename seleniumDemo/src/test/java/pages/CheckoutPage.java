package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
	private WebElement proceedButton;
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id=\"passwd\"]")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
	private WebElement signInButton;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
	private WebElement proceedButton2;
	
	@FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
	private WebElement proceedButton3;
	
	@FindBy(xpath = "//*[@id=\"cgv\"]")
	private WebElement tAndcBox;
	
	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	private WebElement payment;
	
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
	private WebElement confirm;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/p/strong")
	private WebElement confirmMessage;
	
	

	private WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void proceed() {
		proceedButton.click();
	}
	
	public void signIn() {
		email.sendKeys("jtjgt@jgjg.com");
		password.sendKeys("password");
		signInButton.click();
	}
	
	public void proceedAgain() {
		proceedButton2.click();
	}
	
	public void proceedAgainAgain() {
		proceedButton3.click();
	}
	
	public void checkBox() {
		tAndcBox.click();
	}
	
	public void payment() {
		payment.click();
	}
	
	public void confirm() {
		confirm.click();
	}
	
	public String confirmMessage() {
		return confirmMessage.getText();
	}
	
	

}
