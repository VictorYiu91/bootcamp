import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input a number:");
    int number = scanner.nextInt();
    System.out.println("The inpust is " + number);
    // Game: Bomb
    // Random (1-100)
    // if user selected number = bomb, exit loop
    // ask question: please select a number between x and y:
    // collected user input
    // validate user input, if it is out of range, ask the quesntion again. (continue)
    // revise the range of numbers for next round

    int bombNum = (int)((Math.random()*99)+1);
    System.out.println(bombNum);
    int minNum = 1;
    int maxNum = 100;
    int targetNum = -1;
    
    while (bombNum != targetNum) {
      System.out.println("Please select a number between " + minNum + " and " + maxNum + ":");
      targetNum = scanner.nextInt();
      if (targetNum > bombNum) {
        maxNum = targetNum - 1;
      } else if (targetNum < bombNum) {
        minNum = targetNum + 1;
      }
    } System.out.println("Game Over! It is " + bombNum);
    
    
    scanner.close();
  }
}
