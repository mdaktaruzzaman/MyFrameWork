package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonApi {
    public WebDriver driver = null;
    @Parameters({"url"})
    @BeforeMethod
    public void setup(String url) {
        System.setProperty("webdriver.chrome.driver", "/Users/mdaktaruzzaman/Desktop/eclipse-workspace/myFrameWork/Common/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanup() {
        driver.close();
    }

    public void typeOnId(String locator){
        driver.findElement(By.id(locator)).sendKeys("phone", Keys.ENTER);
    }

    public void typeOnCss(String locator){
        driver.findElement(By.cssSelector(locator)).sendKeys("phone", Keys.ENTER);
    }

    public void invalidSignInFb(String locator){

        try {
            driver.findElement(By.id(locator)).
                    sendKeys("invalidmail@gmail.com", Keys.TAB, "invalidPassword123", Keys.TAB, Keys.ENTER);
        }
        catch (Exception ex1){
            System.out.println("Id did not work, will try with class name");
            driver.findElement(By.className(locator)).
                    sendKeys("invalidmail@gmail.com", Keys.TAB, "invalidPassword123", Keys.TAB, Keys.ENTER);
        }
    }

    public void SecureSignIn(String locator1, String locator2){
        driver.findElement(By.id(locator1)).click();
        driver.findElement(By.cssSelector(locator2)).
                sendKeys("pntautomation007@gmail.com", Keys.TAB, "Testmail1234", Keys.TAB, Keys.TAB,Keys.TAB,Keys.ENTER);
    }

    public void SearchVideo(String locator1, String locator2, String locator3){
        driver.findElement(By.cssSelector(locator1)).sendKeys("selenium tutirial");
        driver.findElement(By.id(locator2)).click();
        driver.findElement(By.id(locator3)).click();
    }
}
