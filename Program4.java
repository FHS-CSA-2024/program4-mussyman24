//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        //Declare variables
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int sum = 0;
        double average = 0;
        
        //Create a Scanner
        Scanner numScanner = new Scanner(System.in);
        
        //Ask for user input
        System.out.println("Enter a three digit number: ");
        num1 = numScanner.nextInt();
        System.out.println("Enter a three digit number: ");
        num2 = numScanner.nextInt();
        System.out.println("Enter a three digit number: ");
        num3 = numScanner.nextInt();
        System.out.println("Enter a three digit number: ");
        num4 = numScanner.nextInt();
        
        // Calculate
        sum = num1 + num2 + num3 + num4;
        average = sum / 4.0;
        
        
        //Print results
        System.out.println("Your numbers are: " + num1 + " " + num2 + " " + num3 + " " + num4);
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
    
}


//Paste console output below:
/*
Enter a three digit number: 
475
Enter a three digit number: 
821
Enter a three digit number: 
369
Enter a three digit number: 
562
Your numbers are: 475 821 369 562
The sum is: 2227
The average is: 556.75
*/
