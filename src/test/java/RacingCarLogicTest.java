import org.junit.jupiter.api.Test;
import racingCar.RacingCarLogic;

public class RacingCarLogicTest {
    @Test
    public void 자동차_메인_로직_통합_테스트() {
        String names = "somin,pobi,jun";
        int tryNumber = 3;
        RacingCarLogic.carGameMainLogic(names, tryNumber);
    }
}
