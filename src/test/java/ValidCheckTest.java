import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingCar.ValidCheck;
import static org.assertj.core.api.Assertions.assertThat;

public class ValidCheckTest {

    @Test
    @DisplayName("자동차는 5자 이하 이름을 가져야하는 경우")
    public void 자동차_이름_체크() {
        boolean isTrueCase = ValidCheck.isCarName("car");
        assertThat(isTrueCase).isTrue();
        boolean isFalseCase = ValidCheck.isCarName("cartest");
        assertThat(isFalseCase).isFalse();
    }

    @Test
    @DisplayName("시도 횟수는 1이상의 값을 가져야하는 경우")
    public void 시도_횟수_체크() {
        boolean isTrueCase = ValidCheck.isTryNumber(1);
        boolean isFalseCase = ValidCheck.isTryNumber(0);
        assertThat(isTrueCase).isTrue();
        assertThat(isFalseCase).isFalse();
    }


}
