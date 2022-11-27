package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    public CalendarComponent setDate(String day, String month, String year) {
        int calendarDay = Integer.parseInt(day);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0" + String.format("%02d", calendarDay) + ":not(.react-datepicker__day--outside-month)").click();

        return this;
    }
}
