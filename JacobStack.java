/*
* This class creates an integer stack
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-12-09
*/

import java.util.ArrayList;  // Import the ArrayList class

public class JacobStack {
  // Initializing the array list field
  private ArrayList<Integer> stackAsArray = new ArrayList<Integer>();

  /**
   * This method adds user input to a stack.
   */
  public void push(Integer inputNumber) {
    stackAsArray.add(inputNumber);
  }

  /**
   * This method pops the item on top of the stack and returns it.
   */
  public Integer pop() throws Exception {
    if (this.stackAsArray.size() <= 0) {
      throw new Exception();
    } else {
      int poppedNumber = this.stackAsArray.get(stackAsArray.size() - 1);
      stackAsArray.remove(stackAsArray.size() - 1);
      return poppedNumber;
    }
  }

  /**
   * This getter tells the user the most recent itteration of the array.
   */
  public String currentStack() {
    String currentValues = "Current ArrayList: ";
    for (int counter = 0; counter < stackAsArray.size(); counter++) {
      currentValues = currentValues + stackAsArray.get(counter) + ", ";
    }
    return currentValues;
  }
}
