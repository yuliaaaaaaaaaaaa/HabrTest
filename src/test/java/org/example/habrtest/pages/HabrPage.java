package org.example.habrtest.pages;

import org.example.habrtest.AllureLogger;
import org.openqa.selenium.By;
import org.slf4j.LoggerFactory;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;


public class HabrPage {

    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(HabrPage.class));


    private static final By FEED_ELEMENT = By.xpath("//*[@href='/ru/feed/']");
    private static final By ARTICLES_ELEMENT = By.xpath("//*[@href='/ru/articles/']");
    private static final By DEVELOP_ELEMENT = By.xpath("//*[@href='/ru/flows/develop/']");
    private static final By ADMIN_ELEMENT = By.xpath("//*[@href='/ru/flows/admin/']");
    private static final By DESIGN_ELEMENT = By.xpath("//*[@href='/ru/flows/design/']");
    private static final By MANAGEMENT_ELEMENT = By.xpath("//*[@href='/ru/flows/management/']");
    private static final By MARKETING_ELEMENT = By.xpath("//*[@href='/ru/flows/marketing/']");
    private static final By POPSCI_ELEMENT = By.xpath("//*[@href='/ru/flows/popsci/']");

    public Boolean FeedElementIsDisplayed() {
        LOG.info("Проверка, что элемент Моя лента есть на странице");
        return $(FEED_ELEMENT).isDisplayed();
    }

    public Boolean ArticlesElementIsDisplayed() {
        LOG.info("Проверка, что элемент Все потоки есть на странице");
        return $(ARTICLES_ELEMENT).isDisplayed();
    }

    public Boolean DevelopElementIsDisplayed() {
        LOG.info("Проверка, что элемент Разработка есть на странице");
        return $(DEVELOP_ELEMENT).isDisplayed();
    }

    public Boolean AdminElementIsDisplayed() {
        LOG.info("Проверка, что элемент Администрирование есть на странице");
        return $(ADMIN_ELEMENT).isDisplayed();
    }

    public Boolean DesignElementIsDisplayed() {
        LOG.info("Проверка, что элемент Дизайн есть на странице");
        return $(DESIGN_ELEMENT).isDisplayed();
    }

    public Boolean ManagementElementIsDisplayed() {
        LOG.info("Проверка, что элемент Менеджмент есть на странице");
        return $(MANAGEMENT_ELEMENT).isDisplayed();
    }

    public Boolean MarketingElementIsDisplayed() {
        LOG.info("Проверка, что элемент Маркетинг есть на странице");
        return $(MARKETING_ELEMENT).isDisplayed();
    }

    public Boolean PopsciElementIsDisplayed() {
        LOG.info("Проверка, что элемент Научпоп есть на странице");
        return $(POPSCI_ELEMENT).isDisplayed();
    }

    public String ArticlesElementClick() {
        LOG.info("Нажатие на элемент Все потоки");
        $(ARTICLES_ELEMENT).click();
        webdriver().shouldHave(urlContaining("/ru/articles/"), Duration.ofSeconds(5));
        return webdriver().driver().getCurrentFrameUrl();
    }

    public String DevelopElementClick() {
        LOG.info("Нажатие на элемент Разработка");
        $(DEVELOP_ELEMENT).click();
        webdriver().shouldHave(urlContaining("/ru/flows/develop/articles/"), Duration.ofSeconds(5));
        return webdriver().driver().getCurrentFrameUrl();
    }

    public String AdminElementClick() {
        LOG.info("Нажатие на элемент Администрирование");
        $(ADMIN_ELEMENT).click();
        webdriver().shouldHave(urlContaining("/ru/flows/admin/articles/"), Duration.ofSeconds(5));
        return webdriver().driver().getCurrentFrameUrl();
    }

    public String DesignElementClick() {
        LOG.info("Нажатие на элемент Дизайн");
        $(DESIGN_ELEMENT).click();
        webdriver().shouldHave(urlContaining("/ru/flows/design/articles/"), Duration.ofSeconds(5));
        return webdriver().driver().getCurrentFrameUrl();
    }

    public String ManagementElementClick() {
        LOG.info("Нажатие на элемент Менеджмент");
        $(MANAGEMENT_ELEMENT).click();
        webdriver().shouldHave(urlContaining("/ru/flows/management/articles/"), Duration.ofSeconds(5));
        return webdriver().driver().getCurrentFrameUrl();
    }

    public String MarketingElementClick() {
        LOG.info("Нажатие на элемент Маркетинг");
        $(MARKETING_ELEMENT).click();
        webdriver().shouldHave(urlContaining("/ru/flows/marketing/articles/"), Duration.ofSeconds(5));
        return webdriver().driver().getCurrentFrameUrl();
    }

    public String PopsciElementClick() {
        LOG.info("Нажатие на элемент Научпоп");
        $(POPSCI_ELEMENT).click();
        webdriver().shouldHave(urlContaining("/ru/flows/popsci/articles/"), Duration.ofSeconds(5));
        return webdriver().driver().getCurrentFrameUrl();
    }
}
