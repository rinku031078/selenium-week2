package testsuit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class HW2 extends BaseTest {

    @Before
    public void start() {
        String baseUrl = "https://demo.nopcommerce.com/";
        openBrowser(baseUrl);
       /* driver.findElement(By.xpath("//div[contains(text(),'I agree')]")).click();
        WebElement one = driver.findElement(By.xpath("//input[@name='q']"));
        one.sendKeys("demo nopCommerce store", Keys.ENTER);*/
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
    }

    @Test
    public void Register() {
        driver.findElement(By.xpath("//input[@id='gender-male' ]")).click();
        driver.findElement((By.xpath("//input[@id='FirstName']"))).sendKeys("Anand");
        driver.findElement((By.xpath("//input[@id='LastName']"))).sendKeys("Tripathi");
        driver.findElement((By.xpath("//select[@name='DateOfBirthDay']"))).sendKeys("12");
        driver.findElement((By.xpath("//select[@name='DateOfBirthMonth']"))).sendKeys("March");
        driver.findElement((By.xpath("//select[@name='DateOfBirthYear']"))).sendKeys("1978");
        driver.findElement((By.xpath("//input[@name='Email']"))).sendKeys("abc123@yahoo.com");
        driver.findElement((By.xpath("//input[@id='Company']"))).sendKeys("JIRA");
        driver.findElement((By.xpath("//input[@id='Newsletter']"))).click();
        driver.findElement((By.xpath("//input[@id='Password']"))).sendKeys("admin1234");
        driver.findElement((By.xpath("//input[@id='ConfirmPassword']"))).sendKeys("admin1234");
        driver.findElement((By.xpath("//button[@id='register-button']"))).click();


    }

    @After
    public void finished() {

    }
}