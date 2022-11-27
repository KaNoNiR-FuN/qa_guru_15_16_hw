package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class StateAndCityComponent {

    private SelenideElement
            stateInput = $("#state"),
            stateWrapper = $("#stateCity-wrapper"),
            cityInput = $("#city"),
            cityWrapper = $("#stateCity-wrapper");

    public StateAndCityComponent setStateAndCity(String state, String city){
        stateInput.click();
        stateWrapper.$(byText(state)).click();
        cityInput.click();
        cityWrapper.$(byText(city)).click();

        return this;
    }
}
