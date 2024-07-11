
import java.util.Scanner;

public class prob_10 {
  public static void main(String[] args) {

    // if even, divide by two; if odd, triple it and add one

    Scanner scan = new Scanner(System.in);
    int num_1 = 0;
    int cord = 0;
    System.out.println("Enter your integer : ");
    int number = scan.nextInt();
    
    for (int i = 0; i < number; i++) {
      num_1 = number % (10);
      number = number / (10);
      
      System.out.println("num_1 : " + num_1);
      System.out.println("number : " + number);
      
      
      cord += num_1;
      System.out.println(cord);
    }
    
    if (number % 2 != 0) {
      cord += number;  
      System.out.println(cord); 
    }else{}

    if (cord % 2 == 0) {
      System.out.println("The sum is even.");
    }else if (cord % 2 != 0) {
      System.out.println("The sum is odd.");
    }
    
    scan.close();
  }
}
