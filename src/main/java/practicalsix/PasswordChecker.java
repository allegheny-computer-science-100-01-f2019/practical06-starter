package practicalsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

/**
 * The PasswordChecker class contains methods to validate password.
 **/

public class PasswordChecker {

  private static final int MAX_TRIES = 5;
  private static int PASSWORD_MINIMUM_LENGTH = 8;

  /**
   * Determine if the password satisfies requirements.
   *
   **/
  public static void main(String[] args) {

    // TODO: Display name and a date
    System.out.println("Add Your Name Here " + new Date());
    System.out.println();

    Scanner scanner = new Scanner(System.in);

    // Read in the password from the terminal
    System.out.println("Please enter a password.");
    String password = scanner.nextLine();

    // boolean variables to update when the requirement has been satisfied
    boolean isValidNoSpace = false;
    boolean isValidLength = false;
    boolean isValidDigit = false;
    boolean isValidCapitalized = false;
    boolean isValidPassword = false;


    // Repeatedly check the password for all requirements
    while (isValidPassword == false) {

      // TODO: check if the password contains space

      // TODO: check that the length requirement is satisfied

      // TODO: check that at least one character is a digit

      // TODO: check that the password contains at least one upper case

      // validate the password
      if (isValidNoSpace && isValidLength && isValidDigit && isValidCapitalized) {
        isValidPassword = true;
        System.out.println("Your password satisfies all requirements.");
      } else {
        isValidPassword = false;
        System.out.println("Your password does not satisfy all requirements.");
        System.out.println("Please enter another password");
        password = scanner.nextLine();
      }
    }

    // TODO: Display the closing message
    System.out.println();
  }
}
