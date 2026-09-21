
package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

 WebDriver driver;

 public LoginPage(WebDriver driver){
  this.driver = driver;
  PageFactory.initElements(driver,this);
 }

 @FindBy(id="email")
 WebElement email;

 @FindBy(id="password")
 WebElement password;

 @FindBy(xpath="//*[@id=\"FormSubmitButton\"]/div/div[2]/span/span")
 WebElement continueBtn;
 
 @FindBy(xpath="(//*[name()='path'])[4]")
 WebElement propBtn;
 

 public void enterEmail(String value){
  email.sendKeys(value);
 }

 public void enterPassword(String value)
 {
  password.sendKeys(value);
 }

 public void clickContinue()
 {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
  //continueBtn.click();
 }
 
 public void clickpropfile() throws InterruptedException
 {
	 propBtn.click();
	 Thread.sleep(3000);
 }

}
