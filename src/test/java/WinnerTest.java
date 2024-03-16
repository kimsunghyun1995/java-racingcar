import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingCar.Car;
import racingCar.Position;
import racingCar.Winner;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class WinnerTest {
    private List<Car> setUp(int position1, int position2, int position3) {
        Car car = new Car("자동차", new Position(position1));
        Car car1 = new Car("자동차1", new Position(position2));
        Car car2 = new Car("자동차2", new Position(position3));
        List<Car> carList = Arrays.asList(car, car1, car2);
        return carList;
    }

    @Test
    @DisplayName("우승자_찾기")
    void 우승자_찾기() {
        List<Car> setUpCars = setUp(1,2,3);
        Winner winners = new Winner(setUpCars);
        List<Car> winnersCar = winners.findWinner();
        assertThat(winnersCar).hasSize(1);
        assertThat(winnersCar.get(0).getName()).isEqualTo(setUpCars.get(2).getName());
    }

    @Test
    @DisplayName("우승자_찾기")
    void 공동_우승자_찾기() {
        List<Car> setUpCars = setUp(0,0,0);
        Winner winners = new Winner(setUpCars);

        List<Car> winnersCar = winners.findWinner();
        assertThat(winnersCar).hasSize(3);
    }
}
