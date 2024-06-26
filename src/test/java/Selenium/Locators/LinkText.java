package Selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkText {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testLinkText() {
        driver.get("https://www.google.com/");
        driver.findElement(By.linkText("About")).click();
    }

    @Test
    public void testLinkText1() {
        driver.get("https://www.javatpoint.com/java-tutorial");
        driver.findElement(By.linkText("Hello Java Program")).click();
    }
}
