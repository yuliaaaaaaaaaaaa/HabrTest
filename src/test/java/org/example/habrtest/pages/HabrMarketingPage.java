package org.example.habrtest.pages;

import org.example.habrtest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

public class HabrMarketingPage {

    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(HabrPage.class));

    WebDriver driver;

    @FindBy(xpath = "//span/a[@href='/ru/flows/marketing/']")
    public WebElement MarketingArticlesElement;

    @FindBy(xpath = "//span/a[@href='/ru/flows/marketing/posts/']")
    public WebElement PostsElement;

    @FindBy(xpath = "//span/a[@href='/ru/flows/marketing/news/']")
    public WebElement NewsElement;

    @FindBy(xpath = "//span/a[@href='/ru/flows/marketing/hubs/']")
    public WebElement HubsElement;

    @FindBy(xpath = "//span/a[@href='/ru/flows/marketing/authors/']")
    public WebElement AuthorsElement;

    public Boolean MarketingArticlesElementIsDisplayed() {
        LOG.info("Проверка, что элемент Статьи есть на странице");
        return MarketingArticlesElement.isDisplayed();
    }

    public Boolean PostsElementIsDisplayed() {
        LOG.info("Проверка, что элемент Посты есть на странице");
        return PostsElement.isDisplayed();
    }

    public Boolean NewsElementIsDisplayed() {
        LOG.info("Проверка, что элемент Новости есть на странице");
        return NewsElement.isDisplayed();
    }

    public Boolean HubsElementIsDisplayed() {
        LOG.info("Проверка, что элемент Хабы есть на странице");
        return HubsElement.isDisplayed();
    }

    public Boolean AuthorsElementIsDisplayed() {
        LOG.info("Проверка, что элемент Авторы есть на странице");
        return AuthorsElement.isDisplayed();
    }

    public HabrMarketingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
