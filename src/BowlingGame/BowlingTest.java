package BowlingGame;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BowlingTest {

  private Game g;

  @Before
  public void setUp() {
    g = new Game();
  }

  @Test
  public void canRoll() throws Exception {
    g.roll(0);
  }

  @Test
  public void gutterGame() throws Exception {
    for(int i = 0; i < 20; i++){
      g.roll(0);
    }
    assertEquals(0,g.score());
  }

  @Test
  public void allOnes() throws Exception {
    for(int i = 0; i < 20; i++){
      g.roll(1);
    }
    assertEquals(20,g.score());
  }

}
