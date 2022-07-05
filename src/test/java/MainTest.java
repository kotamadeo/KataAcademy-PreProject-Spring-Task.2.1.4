import koschei.KoscheiTheDeathless;
import koschei.config.AppConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class MainTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void mainTest() {
        String text = "На свете есть океан , на океане остров , на острове дерево , на дереве сундук , " +
                "в сундуке заяц , в зайце утка , в утке яйцо , в яйце иголка , смерть Кощея на игле \uD83D\uDE2D!" +
                "Кощей - \uD83D\uDC80\u2620\uFE0F\u26B1\uFE0F";

        KoscheiTheDeathless koscheiTheDeathless = applicationContext.getBean(KoscheiTheDeathless.class);
        System.out.println(koscheiTheDeathless.getRulesByDeath());
        String testText = koscheiTheDeathless.getRulesByDeath();

        if (!testText.contains(text) && testText.length() <= text.length()) {
            Assert.fail("Тест провален, не корректная связь бинов. Итоговая фраза не верна.");
        }
    }

}
