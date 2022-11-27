package testData;

import com.github.javafaker.Faker;
import utils.randomMonth;

import java.util.Locale;

public class UserData {

    private static final Faker faker = new Faker(new Locale("en"));

    public static String firstName = faker.name().firstName();
    public static String lastName = faker.name().lastName();
    public static String email = faker.internet().emailAddress();
    public static String gender = faker.demographic().sex();
    public static String phoneNumber = faker.phoneNumber().subscriberNumber(10);
    public static String day = String.valueOf(faker.number().numberBetween(1, 31));
    public static String month = String.valueOf(randomMonth.getRandomMonth());
    public static String year = String.valueOf(faker.number().numberBetween(2000, 2022));
    public static String hobby = "Sports";
    public static String subject = "Computer Science";
    public static String picture = "testImage.jpeg";
    public static String address = faker.address().fullAddress();
    public static String state = "Haryana";
    public static String city = "Panipat";
}
