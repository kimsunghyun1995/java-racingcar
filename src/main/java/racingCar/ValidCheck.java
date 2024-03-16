package racingCar;

public class ValidCheck {

    public static boolean isCarName(String carName) {
        return carName.length() < 6;
    }

    public static boolean isTryNumber(int tryNumber) {
        return tryNumber > 0;
    }
}
