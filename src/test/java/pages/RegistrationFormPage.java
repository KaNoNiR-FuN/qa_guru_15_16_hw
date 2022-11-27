package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.ResultTableComponent;
import pages.components.StateAndCityComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPage {

    private final static String TITLE_TEXT = "Student Registration Form";
    private ResultTableComponent resultTableComponent = new ResultTableComponent();
    private CalendarComponent calendarComponent = new CalendarComponent();
    private StateAndCityComponent stateAndCityComponent = new StateAndCityComponent();
    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            numberInput = $("#userNumber"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            subjectInput = $("#subjectsInput"),
            uploadPictureButton = $("#uploadPicture"),
            currentAddressInput = $("#currentAddress"),
            submitButton = $("#submit"),
            dateOfBirthInput = $("#dateOfBirthInput");

    public RegistrationFormPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }

    public RegistrationFormPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);

        return this;
    }

    public RegistrationFormPage setLastName(String lastName) {
        lastNameInput.setValue(lastName);

        return this;
    }

    public RegistrationFormPage setEmail(String email) {
        emailInput.setValue(email);

        return this;
    }

    public RegistrationFormPage setGender(String gender) {
        genderWrapper.$(byText(gender)).click();

        return this;
    }

    public RegistrationFormPage setNumber(String number) {
        numberInput.setValue(number);

        return this;
    }

    public RegistrationFormPage setHobby(String hobby) {
        hobbiesWrapper.$(byText(hobby)).click();

        return this;
    }

    public RegistrationFormPage setSubject(String subject) {
        subjectInput.setValue(subject).pressEnter();

        return this;
    }

    public RegistrationFormPage uploadPicture(String pictureName) {
        uploadPictureButton.uploadFromClasspath(pictureName);

        return this;
    }

    public RegistrationFormPage setAddress(String address) {
        currentAddressInput.setValue(address);

        return this;
    }

    public RegistrationFormPage clickSubmit() {
        submitButton.click();

        return this;
    }

    public RegistrationFormPage checkResultsTableVisible() {
        resultTableComponent.checkVisible();

        return this;
    }

    public RegistrationFormPage checkResult(String key, String value) {
        resultTableComponent.checkResult(key, value);

        return this;
    }

    public RegistrationFormPage setBirthDate(String day, String month, String year) {
        dateOfBirthInput.click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public RegistrationFormPage setStateAndCity(String state, String city) {
        stateAndCityComponent.setStateAndCity(state, city);

        return this;
    }

}
