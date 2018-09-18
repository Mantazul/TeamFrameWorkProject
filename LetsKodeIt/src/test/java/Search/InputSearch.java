package Search;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InputSearch extends CommonApi {


    @Test
    public void search() throws InterruptedException {
        driver.findElement(By.cssSelector("#name")).sendKeys("Juned");
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(5000);
    }

}
