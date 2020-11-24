/*
* This program tells the user the energy that an object
* could release given its mass.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-11-23
*/

import java.util.Scanner;  // Import the Scanner class

public class EnergyReleased {
  /**
   * This function tells the user the energy an object
   * could release based on the mass the user inputs.
   */
  public static void main(String[] args) {

    // Constants
    final double speedOfLight = 2.998 * Math.pow(10, 8);

    // Input
    Scanner massInput = new Scanner(System.in);
    System.out.println("Enter the mass of the object (in kilograms):");
    double objectMass = massInput.nextDouble();

    // Process
    double energyReleased = objectMass * Math.pow(speedOfLight, 2);
    double numberOfBombs = energyReleased / (4 * Math.pow(10, 12));

    // Output
    System.out.println();
    System.out.println("This object can potentially release " 
                       + energyReleased + " joules of energy.");
    System.out.println();
    System.out.println("This is the equivalent energy of " 
                       + numberOfBombs + " nuclear bombs.");
  }
}
