package lotto;

import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;
public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
            final int LOTTO_PRICE = 1000;
            Lotto win_lotto = (Lotto) Randoms.pickUniqueNumbersInRange(1, 45, 6);

            // 기능1. 로또 구입 금액을 입력하면 구입 금액에 해당하는 만큼 1장 당 1000원의 로또를 발행해야 한다.
            // 1000원으로 나눠 떨어지지 않는 경우 예외처리를 한다.
            System.out.println("구입금액을 입력해 주세요.");
            int amount = Integer.parseInt(Console.readLine());

            try {
                // buyLottos 메서드를 구현하여 1000원으로 나눠떨어지지 않는 경우 IllegalArgumentException을 발생시키도록 함.
                List<Lotto> lottos = Lotto.buyLottos(amount);
                System.out.println(amount / LOTTO_PRICE + "개를 구매했습니다.");

            } catch (IllegalArgumentException e) {
                System.out.println("[ERROR]");
        }

    }
}
