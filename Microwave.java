import java.util.Scanner;

/**
 * This program calculates how long something should be in the microwave for.
 *
 * @author Ioana Marinescu
 * @version 1.0
 * @since 2024-02-29
 */
public final class Microwave {
  /** Private constructor to prevent instantiation of this utility class. */
  private Microwave() {
    // testing something
  }

  /**
   * Calculates the total time based on the amount and base time.
   *
   * @param amount The number of food in microwave.
   * @param baseTime The base time for 1 food to heat.
   * @return The total time calculated.
   */
  public static double amountToTime(final int amount, final double baseTime) {
    // declaration of variables
    final double fiftyPercent = 1.5;
    final int three = 3;
    final double hundredPercent = 2;
    // checks if only 1 food -> base time
    if (amount == 1) {
      return baseTime;

      // checks if 2 food -> 50% more time spent cooking
    } else if (amount == 2) {
      return baseTime * fiftyPercent;

      // checks if 3 food -> 100% more time spent cooking
    } else if (amount == three) {
      return baseTime * hundredPercent;
    }
    // user did not enter valid amount of food
    return 0;
  }

  /**
   * Calculate and display the time it takes for the microwave to heat the food.
   *
   * @param time The amount of time it takes to heat up food.
   */
  public static void displayTime(final double time) {
    // calculate minutes
    final int minutes = (int) (time);
    // calculate seconds
    final int seconds = (int) (time * 60 - minutes * 60);

    // output to console
    System.out.print("It will take " + minutes);
    System.out.println(" minute(s) and " + seconds + " seconds.");
  }

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

    // declaration of variables & magic Numbers
    final double baseTime;
    final double totalTime;
    final double oneAndFortyFiveSeconds = 1.75;
    final double fortyFiveSeconds = 0.75;

    try {
      // converts string to int and store in variable
      int userAmount = Integer.parseInt(userAmountStr);

      // if statement calculating the time based on food
      // user chose sub
      if (userFood.equals("sub")) {
        // sets base time
        baseTime = 1;
        // calculates total time it for food to heat
        totalTime = amountToTime(userAmount, baseTime);
        // checks invalid input (amount)
        if (totalTime == 0) {
          System.out.print("That is not a valid amount of ");
          System.out.println("food to put in the microwave!");

          // displays time in mins and sec to user
        } else {
          displayTime(totalTime);
        }

        // user chose pizza
      } else if (userFood.equals("pizza")) {
        // sets base time
        baseTime = fortyFiveSeconds;
        // calculates total time it for food to heat
        totalTime = amountToTime(userAmount, baseTime);
        // checks invalid input (amount)
        if (totalTime == 0) {
          System.out.print("That is not a valid amount of ");
          System.out.println("food to put in the microwave!");

          // displays time in mins and sec to user
        } else {
          displayTime(totalTime);
        }

        // user chose soup
      } else if (userFood.equals("soup")) {
        // sets base time
        baseTime = oneAndFortyFiveSeconds;
        // calculates total time it for food to heat
        totalTime = amountToTime(userAmount, baseTime);
        // checks invalid input (amount)
        if (totalTime == 0) {
          System.out.print("That is not a valid amount of");
          System.out.println(" food to put in the microwave!");

          // displays time in mins and sec to user
        } else {
          displayTime(totalTime);
        }

        // invalid input (food)
      } else {
        totalTime = 0;
        System.out.print("Please enter either sub, pizza,");
        System.out.println(" or soup. No other input is valid.");
      }

      // user did not enter a number for the amount
    } catch (NumberFormatException error) {
      // displays error message
      System.out.print("That is not a valid amount of food to");
      System.out.println(" put in the microwave!");
    }

    // closes scanner
    scanner.close();
  }
}
