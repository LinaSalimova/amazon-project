package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
@Tag("Login")
@Epic("Login")
@Owner("Lina Alekseeva")
@Severity(SeverityLevel.CRITICAL)
@Story("Successful authorization")
@DisplayName("Authorization check with correct credentials")
public class AuthorizationTests extends TestBase {
    @Test
    void AuthorizationForm() {
        step("Заполнить поля формы", () -> {
            authorizationPage.openPage()
                    .signIn()
                    .inputEmail()
                    .inputPasswd();

        });
        step(" Проверить результат", () -> {
            authorizationPage.results();
        });

        Assertions.fail("Authorization is possible under certain conditions");
        Assertions.fail(AuthorizationTests::message);
    }
        private static String message () {
            return "Authorization is possible under certain conditions";
        }
    }
