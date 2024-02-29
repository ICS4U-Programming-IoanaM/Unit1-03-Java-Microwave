import java.util.Scanner;

/**
 * This program calculates how long 
 * something should be in the microwave for.
 *
 * @author Ioana Marinescu
 * @version 1.0
 * @since 2024-02-25
 */
public final class Einstein {
  /** Private constructor to prevent instantiation of this utility class. */
  private Einstein() { }

  /**
   * The main method prints a stylish greeting message.
   *
   * @param args Command-line arguments (not used in this program)
   */
  public static void main(final String[] args) {
    // gets user input (pt.1)
    final Scanner scanner = new Scanner(System.in);
    System.out.println("What is the mass of your object (kg):");

    // variable declaration
    final double mass;

    try {
      // gets user input (pt.2)
      final String massStr = scanner.nextLine();

      // converts string to double
      mass = Double.parseDouble(massStr);

      // checks if user input is positive
      if (mass > 0) {
        // initialization of speed of light
        final int speedOfLight = 299792458;

        // calculation of energy
        final double energy = mass * Math.pow(speedOfLight, 2);

        // output result to console
        System.out.format("The energy released is %.3f", energy);
        System.out.println();

        // user imputed a negative or null mass
      } else {
        System.out.println("Invalid input, please enter"
        + " a positive integer or decimal input.");
      }

      // user did not enter in a double input
    } catch (NumberFormatException error) {
      // displays error message
      System.out.println("Invalid input, please enter"
      + " a positive integer or decimal input.");
    }

    // closes scanner
    scanner.close();
  }
}
