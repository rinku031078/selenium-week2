package testsuit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HW3 extends BaseTest{

    @Before
    public void start() {
        String baseUrl = "http://automationpractice.com/index.php";
        openBrowser(baseUrl);

        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
    }
    @Test
    public void signIN(){
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc123@yahoo.com");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("fcr12");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();


    }
}
