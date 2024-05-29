package org.example.habrtest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class MainPageTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.habr.com/");

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void autorTest() {
        WebElement userIcon = driver.findElement(By.cssSelector("[data-test-id='header']"));
        userIcon.click();

        WebElement rulesLink = driver.findElement(By.xpath("//*[contains(text(),'Все потоки')]"));
        rulesLink.click();

        assertTrue(driver.findElement(By.xpath("//span/a[contains(text(), 'Авторы')]")).isDisplayed(), "Авторы не найдены");
    }
    @Test
    public void statisticTest() {
        WebElement userIcon = driver.findElement(By.xpath("//*[contains(text(),'Все потоки')]"));
        userIcon.click();

        WebElement rulesLink = driver.findElement(By.xpath("//span/a[contains(text(), 'Авторы')]"));
        rulesLink.click();

        assertTrue(driver.findElement(By.xpath("//*[contains (text(), 'Статистика')]")).isDisplayed(), "Статистики нет");
    }
}
