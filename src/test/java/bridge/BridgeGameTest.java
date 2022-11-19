package bridge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BridgeGameTest {

    BridgeGame bridgeGame = new BridgeGame();
    List<String> answerBridge  = List.of("U", "D", "U");

    @DisplayName("다리 이동 입력과 생성된 다리와 일치하면 true, 일치하지 않으면 false를 반환한다.")
    @Test
    void isSameBridge() {
        boolean firstResult = bridgeGame.move("U", answerBridge, 0);
        assertThat(firstResult).isTrue();

        boolean secondResult = bridgeGame.move("U", answerBridge, 1);
        assertThat(secondResult).isFalse();

        boolean lastResult = bridgeGame.move("U", answerBridge, 2);
        assertThat(lastResult).isTrue();
    }
}