/*
* This program pushes a user inputted integer to a stack and
* pops back the last two integers.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-12-09
*/

import java.util.Scanner;  // Import the Scanner class

public class StackForm {
  /**
   * This function allows the user to add an inputted number to a stack and
   * will show the user two numbers popped from the top of the stack.
   */
  public static void main(String[] args) {
    // Declaring stack by using the JacobStack class
    JacobStack stack = new JacobStack();

    try {
      // User input for size of stack
      Scanner stackInput = new Scanner(System.in);
      System.out.println("How many integers would you like for the stack: ");
      int stackSize = stackInput.nextInt();
      System.out.println();

      for (int counter = 0; counter < stackSize; counter++) {
        // User input for integer to be added to stack
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter an Integer for the Stack: ");
        int numberChosen = userInput.nextInt();
        System.out.println();

        // Placing the inputted integer on the stack
        stack.push(numberChosen);
      }

      // Popping the two most recent integers and returning it to the user
      System.out.println("First Number Popped From Stack: " + stack.pop());
      System.out.println("Second Number Popped From Stack: " + stack.pop());

      // Printing the current values in the stack
      System.out.println(stack.currentStack());

      // Catches and tells the user that an improper input was entered
    } catch (Exception e) {
      System.out.println();
      System.out.println("ERROR: Invalid Input");
    }
  }
}
