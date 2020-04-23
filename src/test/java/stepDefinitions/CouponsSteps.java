package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagesobjects.CouponObjects;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CouponsSteps {
    private WebDriver driver;
    static CouponObjects couponObjects;


    public CouponsSteps() {
        this.driver = Hooks.driver;
        couponObjects = PageFactory.initElements(Hooks.driver, CouponObjects.class);
        couponObjects.setDriver(driver);
    }




    @Given("User makes get request")
    public void userMakesGetRequest() {
        System.out.println("1");
        couponObjects.getRequestRA();
    }

    @Then("^User tests body text$")
    public void userTestsBodyText() {
        couponObjects.getRequestBody();
    }

    @And("^User tests header server$")
    public void userTestsHeaderServer() {
        couponObjects.getRequestHeader();
    }

    @And("^User tests negative response$")
    public void userTestsNegativeResponse() {
        couponObjects.getRequestAuth();
    }

    @Then("^User does post test$")
    public void userDoesPostTest() {
        couponObjects.postRequest();
    }
}
