package Revision.Selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class AlertTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjanikumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testSimpleAlert() {
        driver.get("https://demoqa.com/alerts");
        WebElement element = driver.findElement(By.id("alertButton"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void testConfirmationAlert() {
        driver.get("https://demoqa.com/alerts");
        WebElement element = driver.findElement(By.id("confirmButton"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void testPromptAlert() {
        WebElement element = driver.findElement(By.id("promtButton"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void tearDown() {
        driver.close();
    }
}
