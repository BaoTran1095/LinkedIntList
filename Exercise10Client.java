/******************************************************************************
 * Bellevue Class: CS-211
 *           Term: Winter 2015
 *     Instructor: Robert Main
 *     
 * Textbook: Building Java Programs, A Back to Basics Approach
 *  Edition: 3rd
 *  Authors: Stuart Reges and Marty Stepp
 *  
 * Assigned Project: 9
 *
 *     Class: Exercise10Client
 * File Name: Exercise10Client.java
 *
 * Programmer: Bao Tran
 *
 * Revision     Date                        Release Comment
 * --------  ----------  ------------------------------------------------------
 *   1.0     3/8/2015  Initial Release
 *
 * File Description
 * ----------------
 * This file defines the the class Exercise10Client, which includes all methods,
 * variables, and constant values. Specifically, this class contains the Console
 * application entry method, main(), which is a static method, since no object
 * of the class type is ever instantiated.
 *
 * 
 * Program Inputs
 * --------------
 *  Device                              Description
 * --------  ------------------------------------------------------------------
 * Keyboard  Enter a number, or 'done' to proceed, or 'quit' to quit
 *
 * 
 * Program Outputs
 * ---------------
 *  Device                            Description
 * --------  ------------------------------------------------------------------
 * Monitor   strech the numbers in this list to the disired time
 *
 * 
 * Class Methods
 * -------------
 *    Name                                    Description
 * ----------  ----------------------------------------------------------------
 * main        The OS transfers control to this method upon program execution
 *
 ******************************************************************************
 */
// Imported Packages
package Project9;
import java.util.Scanner;
public class Exercise10Client {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean done = false;
		LinkedIntList link = new LinkedIntList();
		
		
		
		while(!quit){
			System.out.print("Enter a number, or 'done' to proceed, or 'quit' to quit: ");
			if(scanner.hasNextInt()){
				
				link.add(scanner.nextInt());
			}else{
				String str = scanner.next();
				if (str.equalsIgnoreCase("quit")){
					quit = true;
				}else if ( str.equalsIgnoreCase("done")){
					if(link.size()==0){
						System.out.println("The list is empty.");
					}else{
						System.out.print("Enter a number to strech the list: ");
						
						link.strech(scanner.nextInt());
						System.out.println(link);
						link = new LinkedIntList();
					}
					
				}
				
			}
			
				
		}
		System.out.print("Good Bye!");
	}
}
