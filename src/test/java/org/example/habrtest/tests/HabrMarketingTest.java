package org.example.habrtest.tests;

import io.qameta.allure.Step;
import org.example.habrtest.pages.HabrMarketingPage;
import org.example.habrtest.pages.HabrPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class HabrMarketingTest extends BaseTest {

    private HabrPage HabrPage;
    private HabrMarketingPage HabrMarketingPage;

    @BeforeEach
    @Override
    @Step("Переход на сайт habr")
    public void setUp() {
        super.setUp();
        open("https://www.habr.com/");
        HabrPage = new HabrPage();
        HabrMarketingPage = new HabrMarketingPage();
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }

    @Test
    @DisplayName("Проверка, что элемент Статьи есть на странице")
    public void marketingArticlesElementIsDisplayedTest() {
        HabrPage.MarketingElementClick();
        assertTrue(HabrMarketingPage.MarketingArticlesElementIsDisplayed(), "Элемента Статьи нет");
    }

    @Test
    @DisplayName("Проверка, что элемент Посты есть на странице")
    public void postsElementIsDisplayedTest() {
        HabrPage.MarketingElementClick();
        assertTrue(HabrMarketingPage.PostsElementIsDisplayed(), "Элемента Посты нет");
    }

    @Test
    @DisplayName("Проверка, что элемент Новости есть на странице")
    public void newsElementIsDisplayedTest() {
        HabrPage.MarketingElementClick();
        assertTrue(HabrMarketingPage.NewsElementIsDisplayed(), "Элемента Новости нет");
    }

    @Test
    @DisplayName("Проверка, что элемент Хабы есть на странице")
    public void hubsElementIsDisplayedTest() {
        HabrPage.MarketingElementClick();
        assertTrue(HabrMarketingPage.HubsElementIsDisplayed(), "Элемента Хабы нет");
    }

    @Test
    @DisplayName("Проверка, что элемент Авторы есть на странице")
    public void authorsElementIsDisplayedTest() {
        HabrPage.MarketingElementClick();
        assertTrue(HabrMarketingPage.AuthorsElementIsDisplayed(), "Элемента Авторы нет");
    }
}