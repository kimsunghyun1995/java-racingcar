package view;

import racingCar.Car;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {

    public static void printResult(List<Car> cars) {
        for(Car car: cars) {
            String carName = "";
            carName += car.getName()+" ";
            carName += printCarPosition(car);
            System.out.println(carName);
        }
        System.out.println();
    }
    public static String printCarPosition(Car car) {
        String position = "";
        for (int i=0; i< car.position.getPosition(); i++) {
            position+="-";
        }
        return position;
    }
    public static void printWinner(List<Car> cars) {
        System.out.print(cars.stream()
                .map(Car::getName)
                .collect(Collectors.joining(",")));
        System.out.print("가 최종우승했습니다.");
    }
}
