
package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginSteps {

 WebDriver driver;
 LoginPage login;

 @Given("User opens PayDocker login page")
 public void openLoginPage(){

  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://dashboard.devpaydocker.cloud/login");

  login = new LoginPage(driver);
 }

 @When("User enters email {string}")
 public void enterEmail(String email){

  login.enterEmail(email);
 }

 @And("User enters password {string}")
 public void enterPassword(String password){

  login.enterPassword(password);
 }

 @And("User clicks continue button")
 public void clickLogin() throws InterruptedException{

  login.clickContinue();
  Thread.sleep(3000);
 }

 @Then("Login process executed")
 public void verify(){

  System.out.println("Login Test Executed");
  driver.quit();
 }

}
