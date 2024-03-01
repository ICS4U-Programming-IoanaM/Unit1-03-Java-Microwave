import java.util.Scanner;
/**
 * This program calculates how long 
 * something should be in the microwave for.
 *
 * @author Ioana Marinescu
 * @version 1.0
 * @since 2024-02-29
 */
public final class Microwave {
  /** Private constructor to prevent instantiation of this utility class. */
  private Microwave() { }

  /**
   * The main method prints a stylish greeting message.
   *
   * @param args Command-line arguments (not used in this program)
   */
  public static void main(final String[] args) {
    // scanner creation
    final Scanner scanner = new Scanner(System.in);

    // user input for food
    System.out.println("What would you like to heat up? (sub, pizza, soup)");
    final String userFood = scanner.nextLine();
    // user input for amount of food
    System.out.println("How many are you heating up? (1-3)");
    final String userAmountStr = scanner.nextLine();

    try {
      // converts string to int and store in variable
      int userAmount = Integer.parseInt(userAmountStr);

      // user did not enter in a double input
    } catch (NumberFormatException error) {
      // displays error message
      System.out.println("That is not a valid amount of food to put in the microwave!");
    }

    // closes scanner
    scanner.close();
  }
}
