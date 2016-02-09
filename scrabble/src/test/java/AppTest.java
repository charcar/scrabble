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

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_3() {
    App app = new App();
    Integer score = 3;
    assertEquals(score, app.scrabbleScore("b"));
  }

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_4() {
    App app = new App();
    Integer score = 4;
    assertEquals(score, app.scrabbleScore("f"));
  }

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_5() {
    App app = new App();
    Integer score = 5;
    assertEquals(score, app.scrabbleScore("k"));
  }

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_8() {
    App app = new App();
    Integer score = 8;
    assertEquals(score, app.scrabbleScore("j"));
  }
  
  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_10() {
    App app = new App();
    Integer score = 10;
    assertEquals(score, app.scrabbleScore("q"));
  }
}
