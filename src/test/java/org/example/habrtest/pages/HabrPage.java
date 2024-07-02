package org.example.habrtest.pages;

import org.example.habrtest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

import java.time.Duration;


public class HabrPage {

    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(HabrPage.class));

    WebDriver driver;

    @FindBy(xpath = "//*[@href='/ru/feed/']")
    public WebElement FeedElement;

    @FindBy(xpath = "//*[@href='/ru/articles/']")
    public WebElement ArticlesElement;

    @FindBy(xpath = "//*[@href='/ru/flows/develop/']")
    public WebElement DevelopElement;

    @FindBy(xpath = "//*[@href='/ru/flows/admin/']")
    public WebElement AdminElement;

    @FindBy(xpath = "//*[@href='/ru/flows/design/']")
    public WebElement DesignElement;

    @FindBy(xpath = "//*[@href='/ru/flows/management/']")
    public WebElement ManagementElement;

    @FindBy(xpath = "//*[@href='/ru/flows/marketing/']")
    public WebElement MarketingElement;

    @FindBy(xpath = "//*[@href='/ru/flows/popsci/']")
    public WebElement PopsciElement;

    public Boolean FeedElementIsDisplayed() {
        LOG.info("Проверка, что элемент Моя лента есть на странице");
        return FeedElement.isDisplayed();
    }

    public Boolean ArticlesElementIsDisplayed() {
        LOG.info("Проверка, что элемент Все потоки есть на странице");
        return ArticlesElement.isDisplayed();
    }

    public Boolean DevelopElementIsDisplayed() {
        LOG.info("Проверка, что элемент Разработка есть на странице");
        return DevelopElement.isDisplayed();
    }

    public Boolean AdminElementIsDisplayed() {
        LOG.info("Проверка, что элемент Администрирование есть на странице");
        return AdminElement.isDisplayed();
    }

    public Boolean DesignElementIsDisplayed() {
        LOG.info("Проверка, что элемент Дизайн есть на странице");
        return DesignElement.isDisplayed();
    }

    public Boolean ManagementElementIsDisplayed() {
        LOG.info("Проверка, что элемент Менеджмент есть на странице");
        return ManagementElement.isDisplayed();
    }

    public Boolean MarketingElementIsDisplayed() {
        LOG.info("Проверка, что элемент Маркетинг есть на странице");
        return MarketingElement.isDisplayed();
    }

    public Boolean PopsciElementIsDisplayed() {
        LOG.info("Проверка, что элемент Научпоп есть на странице");
        return PopsciElement.isDisplayed();
    }

    public String ArticlesElementClick() {
        LOG.info("Нажатие на элемент Все потоки");
        ArticlesElement.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("/ru/articles/"));
        return driver.getCurrentUrl();
    }

    public String DevelopElementClick() {
        LOG.info("Нажатие на элемент Разработка");
        DevelopElement.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("/ru/flows/develop/articles/"));
        return driver.getCurrentUrl();
    }

    public String AdminElementClick() {
        LOG.info("Нажатие на элемент Администрирование");
        AdminElement.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("/ru/flows/admin/articles/"));
        return driver.getCurrentUrl();
    }

    public String DesignElementClick() {
        LOG.info("Нажатие на элемент Дизайн");
        DesignElement.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("/ru/flows/design/articles/"));
        return driver.getCurrentUrl();
    }

    public String ManagementElementClick() {
        LOG.info("Нажатие на элемент Менеджмент");
        ManagementElement.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("/ru/flows/management/articles/"));
        return driver.getCurrentUrl();
    }

    public String MarketingElementClick() {
        LOG.info("Нажатие на элемент Маркетинг");
        MarketingElement.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("/ru/flows/marketing/articles/"));
        return driver.getCurrentUrl();
    }

    public String PopsciElementClick() {
        LOG.info("Нажатие на элемент Научпоп");
        PopsciElement.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("/ru/flows/popsci/articles/"));
        return driver.getCurrentUrl();
    }

    public HabrPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
