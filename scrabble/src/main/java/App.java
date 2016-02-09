import java.io.Console;

public class App {
  public static void main(String[] args) {
    // Console myConsole = System.console();
    // System.out.println("Enter a Word and we'll calculate the Scrabble Score.");
    // String userString = myConsole.readLine();
    // System.out.println(leetspeak(userString));
  }

    public Integer scrabbleScore(String userString) {
      char[] userCharArray = userString.toCharArray();
      Integer totalScore = 0;
      for (char eachChar : userCharArray ) {
        if (eachChar == 'a' || eachChar == 'e'|| eachChar == 'i' || eachChar == 'o' || eachChar == 'u' || eachChar == 'l' || eachChar == 'r' || eachChar == 's' || eachChar == 't' || eachChar == 'n') {
          totalScore = totalScore + 1;
        } else if (eachChar == 'd' || eachChar == 'g') {
          totalScore = totalScore + 2;
        } else if (eachChar == 'b' || eachChar == 'c' || eachChar == 'm' || eachChar == 'p') {
        totalScore = totalScore + 3;
        } else if (eachChar == 'f' || eachChar == 'h' || eachChar == 'v' ||           eachChar == 'w' || eachChar == 'y') {
        totalScore = totalScore + 4;
       }
     } return totalScore;
    }
  }


// public static String leetspeak(String normalInput) {
//   String[] wordsArray = normalInput.split(" ");
//   String newWord = "";
//   for (String wordsInArray : wordsArray) {
//     wordsInArray = wordsInArray.replaceAll("e", "3");
//     wordsInArray = wordsInArray.replaceAll("E", "3");
//     wordsInArray = wordsInArray.replaceAll("o", "0");
//     wordsInArray = wordsInArray.replaceAll("O", "0");
//     wordsInArray = wordsInArray.replaceAll("I", "1");
//     if (wordsInArray.startsWith("s")) {
//       wordsInArray = wordsInArray.replaceAll("s", "z");
//       wordsInArray = wordsInArray.replaceFirst("z", "s");
//     } else if (wordsInArray.startsWith("S")) {
//       wordsInArray = wordsInArray.replaceAll("S", "Z");
//       wordsInArray = wordsInArray.replaceFirst("Z", "S");
//       wordsInArray = wordsInArray.replaceAll("s", "z");
//     } else {
//       wordsInArray = wordsInArray.replaceAll("s", "z");
//       wordsInArray = wordsInArray.replaceAll("S", "Z");
//       }
//       newWord = newWord.concat(" " + wordsInArray);
//       newWord = newWord.trim();
//     } return newWord;
//   }
// }
