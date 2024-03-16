import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingCar.Car;
import racingCar.Position;

import static org.assertj.core.api.Assertions.assertThat;
public class CarTest {

    @Test
    @DisplayName("전진하는 경우")
    public void 전진() {
        Car car = new Car("내차", new Position(0));
        car.move();
        assertThat(car.position.getPosition()).isEqualTo(1);
    }

}
