package youTubeHm;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class YtbeTest extends CommonApi {
    @Test
    public void yTbeSearch(){
        SearchVideo("#search","search-icon-legacy","video-title");
    }
//    @Test
//    public void selectVideo(){
//        driver.findElement(By.id("guide-button")).click();
//        driver.findElement(By.className("title style-scope ytd-guide-entry-renderer")).click();
//    }
}
