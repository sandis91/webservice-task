package pagesobjects;

import gherkin.lexer.Th;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;


import java.sql.Driver;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;


public class CouponObjects<startTime> {


    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor js;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
        wait = (WebDriverWait) new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class);
    }


    public void firstGetRequest() {
        System.out.println("1");
        String api = "https://postman-echo.com/get";
        int code = get(api).getStatusCode();
        System.out.println("Code: " + code);
        System.out.println("body:" + get(api).getBody());
        System.out.println("header:" + get(api).getHeaders());
        Assert.assertEquals(code, 200);
        api = "https://postman-echo.com/basic-auth";
        code = get(api).getStatusCode();
        System.out.println("Code: " + code);
        Assert.assertEquals(code, 401);
    }

    public void getRequestRA() {
        baseURI = "https://postman-echo.com";
        given().
                param("foo1", "bar1").
                param("foo2", "bar2");
        when().
                get("get").
                then().
                assertThat().
                statusCode(200);
    }

    public void getRequestBody() {
        baseURI = "https://postman-echo.com";
        given().
                param("timestamp", "2020-04-22");
        when().
                get("time/object").
                then().
                assertThat().body("years", equalTo(2020));
    }
    public void getRequestHeader(){
        baseURI = "https://postman-echo.com";
        given().
                param("timestamp", "2020-04-22");
        when().
                get("time/object").
                then().
                assertThat().header("Server","nginx");
    }
    public void getRequestAuth() {
        baseURI = "https://postman-echo.com";
        given().
        when().
                get("basic-auth").
                then().
                assertThat().
                statusCode(401);
    }
    public void postRequest(){
        String b="{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        given().
                body(b).
                post("https://reqres.in/api/users").
                then().
                assertThat().statusCode(201);
    }
}