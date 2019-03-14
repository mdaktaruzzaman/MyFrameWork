package title;

import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonHome extends CommonApi {
    @Test
    public void test1(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }
    @Test
//    Product Search
    public void  test2() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes", Keys.ENTER);
    }

//    public void findDeals(){
//        driver.findElement(By.id())
//    }

}
