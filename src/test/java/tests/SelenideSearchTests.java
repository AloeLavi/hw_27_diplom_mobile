package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class SelenideSearchTests extends TestBase {

    @Test
    @DisplayName("Успешный поиск в Wikipedia")
    void successSearchTest() {
        step("Кликнуть на поисковую строку", () -> {
            back();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
        });
        step("Ввести в  поле поиска Java", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Java");
        });
        step("Проверить результат поиска", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));
    }
    @Test
    @DisplayName("Открытие статьи через поиск в Wikipedia")
    void searchArticleTest() {
        back();
        step("Нажать на Search Wikipedia", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
        });
        step("Ввести Twin Peaks", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Twin Peaks");
            $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0));
        });
        step("Открыть статью Twin Peaks", () -> {
            $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).findBy(text("Twin Peaks")).click();
            $(AppiumBy.className("android.webkit.WebView")).click();
            $(AppiumBy.className("android.widget.TextView")).shouldHave(text("Twin Peaks"));
        });
    }

    @Test
    @DisplayName("Добавление языка")
    void addLanguageTest(){
        step("Нажать на кнопку ADD OR EDIT LANGUAGES", () -> {
             $(AppiumBy.id("org.wikipedia.alpha:id/addLangContainer")).click();
        });
        step("Нажать на кнопку ADD LANGUAGE", () -> {
            $$(AppiumBy.id("org.wikipedia.alpha:id/wiki_language_title")).last().click();
        });
        step("Выбрать Русский язык", () -> {
        $(AppiumBy.xpath("//android.widget.TextView[@text='Русский']")).click();
        $(AppiumBy.xpath("//android.widget.TextView[@text='Русский']"))
                .shouldHave(attribute("text", "Русский"));
        });
        step("Вернуться на стартовый экран", () -> {
        $(AppiumBy.className("android.widget.ImageButton")).click();
        $(AppiumBy.id("org.wikipedia.alpha:id/languagesList"))
                .$$(AppiumBy.id("org.wikipedia.alpha:id/option_label")).shouldHave(size(2));
        });
    }
}
