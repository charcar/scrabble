import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_1() {
    App app = new App();
    Integer score = 1;
    assertEquals(score, app.scrabbleScore("a"));
  }
  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_2() {
    App app = new App();
    Integer score = 2;
    assertEquals(score, app.scrabbleScore("d"));
}
}
