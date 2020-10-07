import java.util.Scanner;
/**
 *Sum of odd number
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner
    Scanner input = new Scanner(System.in);
    //ask user for maximum number
    System.out.println("Please enter the maximum number to sum to:");
    //declare a variable to store users number
    int userNum = input.nextInt();
    //create an accumalator for the total sum 
    int sum = 0;
    //create a loop to calculate the total sum for all odd numbers
    for(int count = 1; count <= userNum; count++){
      //if the user number is odd add it to the sum that is being added
      if(count % 2 != 0){
       sum = sum + count;
      }
    } 
      //print the users sum 
      System.out.println("The sum of the odd numbers is " + sum);

    
  }
}
