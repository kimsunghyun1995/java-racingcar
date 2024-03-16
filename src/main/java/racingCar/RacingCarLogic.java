package racingCar;

import view.InputView;
import view.ResultView;

import java.util.ArrayList;
import java.util.List;

public class RacingCarLogic {

    private static final int initPosition = 0;
    public static void gameLogic() {
        String carNames = InputView.printInputName();
        int tryNumber = InputView.printInputTryNumber();
        carGameMainLogic(carNames, tryNumber);
    }

    public static void carGameMainLogic(String carNames, int tryNumber) {
        String [] playerNames = carNames.split(",");

        List<Car> cars = new ArrayList<>();

        for (String name : playerNames) {
            cars.add(new Car(name,new Position(initPosition)));
        }

        for (int i = 0; i < tryNumber; i++) {
            forward(cars);
            ResultView.printResult(cars);
        }
        Winner winner = new Winner(cars);
        ResultView.printWinner(winner.findWinner());
    }

    private static void forward(List<Car> cars) {
        for (Car car : cars) {
            int randomNumber = RandomManager.getRandomNumber();
            checkMove(car, randomNumber);
        }
    }

    private static void checkMove(Car car, int randomNumber) {
        if (isRandomNumber(randomNumber)) {
            car.move();
        }
    }

    private static boolean isRandomNumber(int randomNumber) {
        if (randomNumber >= 4) {
            return true;
        }
        return false;
    }

}
