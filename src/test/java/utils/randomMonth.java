package utils;

import java.util.Random;

public enum randomMonth {
    January, February, March, April,
    May, June, July, August,
    September, October, November, December;

    public static randomMonth getRandomMonth() {
        int pick = new Random().nextInt(randomMonth.values().length);
        return randomMonth.values()[pick];
    }
}
