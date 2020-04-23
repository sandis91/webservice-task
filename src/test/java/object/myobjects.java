package object;

import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static io.restassured.RestAssured.*;

import java.net.MalformedURLException;

public class myobjects {
    private WebDriver driver;
    private WebDriverWait wait;
    static String libWithDriversLocation = System.getProperty("user.dir") + "\\lib\\";
    public void setDriver(WebDriver driver) {
        this.driver = driver;
        wait = (WebDriverWait) new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class);
    }
    public void openBrowser() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        wait = (WebDriverWait) new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class);
    }
    //String api="https://postman-echo.com/get?foo1=bar1&foo2=bar2";
  /*  public void firstGetRequest(){
        System.out.println("1");
        String api="https://postman-echo.com/get?foo1=bar1&foo2=bar2";
        int code=get("https://postman-echo.com/get?foo1=bar1&foo2=bar2").getStatusCode();
        System.out.println("1");
        System.out.println("Code: "+code);
        System.out.println("1");
        Assert.assertEquals(code,200);

    }
*/


}

