package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


public class Language extends TestBase {
    @Test
    @Tag("language")
    void changeSettings() {
        step("Change language in settings into spanish", () -> {
            open("");
            languagePage.menu()
                    .language();
        });
        step("Checking the page for a language change", () -> {
            languagePage.verifyResultsChangeLanguage();
        });
    }
}
