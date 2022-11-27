package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultTableComponent {

    private final static String TITLE_TEXT = "Thanks for submitting the form";
    private SelenideElement
            modalDialog = $("#firstName"),
            modalTitle = $("#example-modal-sizes-title-lg"),
            responsiveTable = $(".table-responsive table");

    public ResultTableComponent checkVisible() {
        modalDialog.should(appear);
        modalTitle.shouldHave(text(TITLE_TEXT));

        return this;
    }

    public ResultTableComponent checkResult(String key, String value) {
        responsiveTable.$(byText(key))
                .parent().shouldHave(text(value));
        return this;
    }
}
