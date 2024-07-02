package org.example.habrtest.tests;

import io.qameta.allure.Step;
import org.example.habrtest.MyExtension;
import org.example.habrtest.pages.HabrPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MyExtension.class)
public class HabrTest extends BaseTest {

    private HabrPage HabrPage;

    @BeforeEach
    @Override
    @Step("Переход на сайт habr")
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.habr.com/");
        HabrPage = new HabrPage(getDriver());
    }

    @AfterEach
    public void tearDown() {
        super.tearDown();
    }

    @Test
    @DisplayName("Проверка, что элемент Моя лента есть на странице")
    public void feedElementIsDisplayedTest() {
        assertTrue(HabrPage.FeedElementIsDisplayed(), "Элемента Моя лента нет");
    }

    @Test
    @DisplayName("Проверка, что элемент Все потоки есть на странице")
    public void articlesElementIsDisplayedTest() {
        assertTrue(HabrPage.ArticlesElementIsDisplayed(), "Элемента Все потоки нет");
    }

    @Test
    @DisplayName("Проверка, что элемент Разработка есть на странице")
    public void developElementIsDisplayedTest() {
        assertTrue(HabrPage.DevelopElementIsDisplayed(), "Элемента Разработка нет");
    }

    @Test
    @DisplayName("Проверка, что элемент  Администрирование есть на странице")
    public void adminElementIsDisplayedTest() {
        assertTrue(HabrPage.AdminElementIsDisplayed(), "Элемента  Администрирование нет");
    }

    @Test
    @DisplayName("Проверка, что элемент Дизайн есть на странице")
    public void designElementIsDisplayedTest() {
        assertTrue(HabrPage.DesignElementIsDisplayed(), "Элемента  Дизайн нет");
    }

    @Test
    @DisplayName("Проверка, что элемент Менеджмент есть на странице")
    public void managementElementIsDisplayedTest() {
        assertTrue(HabrPage.ManagementElementIsDisplayed(), "Элемента Менеджмент нет");
    }

    @Test
    @DisplayName("Проверка, что элемент Маркетинг есть на странице")
    public void marketingElementIsDisplayedTest() {
        assertTrue(HabrPage.MarketingElementIsDisplayed(), "Элемента Маркетинг нет");
    }

    @Test
    @DisplayName("Проверка, что элемент Научпоп есть на странице")
    public void popsciElementIsDisplayedTest() {
        assertTrue(HabrPage.PopsciElementIsDisplayed(), "Элемента Научпоп нет");
    }

    @Test
    @DisplayName("Переход в раздел Все потоки")
    public void articlesElementClickTest() {
        String expectedUrl = "https://habr.com/ru/articles/";
        String actualUrl = HabrPage.ArticlesElementClick();
        assertEquals(expectedUrl, actualUrl, "Переход не на ту страницу");
    }

    @Test
    @DisplayName("Переход в раздел Разработка")
    public void developElementClickTest() {
        String expectedUrl = "https://habr.com/ru/flows/develop/articles/";
        String actualUrl = HabrPage.DevelopElementClick();
        assertEquals(expectedUrl, actualUrl, "Переход не на ту страницу");
    }

    @Test
    @DisplayName("Переход в раздел Администрирование")
    public void adminElementClickTest() {
        String expectedUrl = "https://habr.com/ru/flows/admin/articles/";
        String actualUrl = HabrPage.AdminElementClick();
        assertEquals(expectedUrl, actualUrl, "Переход не на ту страницу");
    }

    @Test
    @DisplayName("Переход в раздел Дизайн")
    public void designElementClickTest() {
        String expectedUrl = "https://habr.com/ru/flows/design/articles/";
        String actualUrl = HabrPage.DesignElementClick();
        assertEquals(expectedUrl, actualUrl, "Переход не на ту страницу");
    }

    @Test
    @DisplayName("Переход в раздел Менеджмент")
    public void managementElementClickTest() {
        String expectedUrl = "https://habr.com/ru/flows/management/articles/";
        String actualUrl = HabrPage.ManagementElementClick();
        assertEquals(expectedUrl, actualUrl, "Переход не на ту страницу");
    }

    @Test
    @DisplayName("Переход в раздел Маркетинг")
    public void marketingElementClickTest() {
        String expectedUrl = "https://habr.com/ru/flows/marketing/articles/";
        String actualUrl = HabrPage.MarketingElementClick();
        assertEquals(expectedUrl, actualUrl, "Переход не на ту страницу");
    }

    @Test
    @DisplayName("Переход в раздел Научпоп")
    public void popsciElementClickTest() {
        String expectedUrl = "https://habr.com/ru/flows/popsci/articles/";
        String actualUrl = HabrPage.PopsciElementClick();
        assertEquals(expectedUrl, actualUrl, "Переход не на ту страницу");
    }
}
