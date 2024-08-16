package org.example.habrtest.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1280x800";
        Configuration.timeout = 10000;
        Configuration.pageLoadStrategy = "eager";
    }

    @AfterEach
    public void tearDown() {
    }
}
