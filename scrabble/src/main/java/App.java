import java.io.Console;
import java.util.HashMap;

public class App {
  public static void main(String[] args) {
    // Console myConsole = System.console();
    // System.out.println("Enter a Word and we'll calculate the Scrabble Score.");
    // String userString = myConsole.readLine();
    // System.out.println(leetspeak(userString));
  }

    public Integer scrabbleScore(String userString) {
      char[] userCharArray = userString.toLowerCase().toCharArray();
      Integer totalScore = 0;

      HashMap<Character, Integer> scoreHash = new HashMap<Character, Integer>();
          scoreHash.put('a', 1);
          scoreHash.put('e', 1);
          scoreHash.put('i', 1);
          scoreHash.put('o', 1);
          scoreHash.put('u', 1);
          scoreHash.put('r', 1);
          scoreHash.put('l', 1);
          scoreHash.put('s', 1);
          scoreHash.put('t', 1);
          scoreHash.put('n', 1);
          scoreHash.put('d', 2);
          scoreHash.put('g', 2);
          scoreHash.put('b', 3);
          scoreHash.put('c', 3);
          scoreHash.put('m', 3);
          scoreHash.put('p', 3);
          scoreHash.put('f', 4);
          scoreHash.put('h', 4);
          scoreHash.put('v', 4);
          scoreHash.put('w', 4);
          scoreHash.put('y', 4);
          scoreHash.put('k', 5);
          scoreHash.put('j', 8);
          scoreHash.put('x', 8);
          scoreHash.put('q', 10);
          scoreHash.put('z', 10);

      for (char eachChar : userCharArray ) {
        Integer letterValue = scoreHash.get(eachChar);
        totalScore = totalScore + letterValue;
      } return totalScore;
    }
  }


  //       if (eachChar == 'a' || eachChar == 'e'|| eachChar == 'i' || eachChar == 'o' || eachChar == 'u' || eachChar == 'l' || eachChar == 'r' || eachChar == 's' || eachChar == 't' || eachChar == 'n') {
  //         totalScore = totalScore + 1;
  //       } else if (eachChar == 'd' || eachChar == 'g') {
  //         totalScore = totalScore + 2;
  //       } else if (eachChar == 'b' || eachChar == 'c' || eachChar == 'm' || eachChar == 'p') {
  //       totalScore = totalScore + 3;
  //       } else if (eachChar == 'f' || eachChar == 'h' || eachChar == 'v' ||           eachChar == 'w' || eachChar == 'y') {
  //       totalScore = totalScore + 4;
  //      }
  //    } return totalScore;
  //   }
  // }
