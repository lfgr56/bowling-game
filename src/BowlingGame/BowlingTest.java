package BowlingGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingTest {

  private Game g;

  @BeforeEach
  void setUp() {
    g = new Game();
  }

  @Test
  public void canRoll() throws Exception {
    g.roll(0);
  }

}
