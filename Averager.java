/**
*
* Reads in scores until a negative value is encountered, at which point it determines and prints the average
*
* @author <Sam Rooney>
* @version <17/10/14>
*
*/

 import java.util.Scanner;
public class Averager {
   public static void main(String[] args) {
      
      Scanner s = new Scanner(System.in);
      
      double numTest = 0.0;
      
      double totalTest = 0.0;
      
      System.out.println("Enter number you would like to be averged, ");
      
      System.out.println ("when finished enter value -7.");
      
      double addTest = s.nextDouble();
      
      while (addTest != -7) { // while addTest does NOT have the value of -5
      
      totalTest = totalTest + addTest;
      
      numTest = numTest + 1;
      
      System.out.println("Do me a favour and enter another number");
      
      System.out.println("or -7 to exit will ya.");
     
      addTest = s.nextDouble();
      }
      System.out.println("The average of numbers is: " + totalTest / numTest);
   }
}      
      
      
      
      
