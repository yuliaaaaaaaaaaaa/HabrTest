package org.example.habrtest.pages;

import org.example.habrtest.AllureLogger;
import org.openqa.selenium.By;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.$;

public class HabrMarketingPage {

    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(HabrPage.class));


    private static final By MARKETING_ARTICLES_ELEMENT = By.xpath("//span/a[@href='/ru/flows/marketing/']");
    private static final By POSTS_ELEMENT = By.xpath("//span/a[@href='/ru/flows/marketing/posts/']");
    private static final By NEWS_ELEMENT = By.xpath("//span/a[@href='/ru/flows/marketing/news/']");
    private static final By HUBS_ELEMENT = By.xpath("//span/a[@href='/ru/flows/marketing/hubs/']");
    private static final By AUTHORS_ELEMENT = By.xpath("//span/a[@href='/ru/flows/marketing/authors/']");

    public Boolean MarketingArticlesElementIsDisplayed() {
        LOG.info("Проверка, что элемент Статьи есть на странице");
        return $(MARKETING_ARTICLES_ELEMENT).isDisplayed();
    }

    public Boolean PostsElementIsDisplayed() {
        LOG.info("Проверка, что элемент Посты есть на странице");
        return $(POSTS_ELEMENT).isDisplayed();
    }

    public Boolean NewsElementIsDisplayed() {
        LOG.info("Проверка, что элемент Новости есть на странице");
        return $(NEWS_ELEMENT).isDisplayed();
    }

    public Boolean HubsElementIsDisplayed() {
        LOG.info("Проверка, что элемент Хабы есть на странице");
        return $(HUBS_ELEMENT).isDisplayed();
    }

    public Boolean AuthorsElementIsDisplayed() {
        LOG.info("Проверка, что элемент Авторы есть на странице");
        return $(AUTHORS_ELEMENT).isDisplayed();
    }
}
