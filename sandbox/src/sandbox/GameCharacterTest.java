package sandbox;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
public class GameCharacterTest {
	@Test
	public void test() {

        GameCharacter a = new GameCharacter(100);
        a.takeDamage(50);
        assert a.getHealth() == 50;
	}
}
