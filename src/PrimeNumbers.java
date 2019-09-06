/*
Write an application that will show the number and indicate whether or not it is prime.
There are two ways that you can achieve this.

Option 1:
The user will have to input a number, and you will display that number. You will check if that number is prime
and indicate that to the user.

For example, if the user typed 10, it would display the following output:


10 is not a prime number

Option 2:
Generate a random number between 1 and 250 (you can make this range larger if you'd like).  As with option 1,
you will print the number and whether it is a prime number. You may consult the class repositories and use any
of the two options we covered in class to generate a random number.

You can test to see whether a number is a prime number here (Links to an external site.).

If you are not sure how to write the code but can write the pseudocode for it, start there, and save is as a .txt file
that you can refer back to as you develop your program. (You do not need to turn that in) Get the simple part working
first, then add on  additional features.

Submit your assignment as a GitHub link.
 */


import java.util.Random;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randNum = 0;
        boolean prime = true;
        String option;

        System.out.println("Would you like to generate a random number? (Y/N)");
        option = sc.next();

        option.toLowerCase();
        if(option.equals("y")){
            randNum = rand.nextInt(250) + 1; // will generate a random number (1-250)
            System.out.println("Generating Random Number...");
        } else if(option.equals("n")){
            System.out.println("Please enter a number(1-250): ");
            randNum = sc.nextInt();
        }

        for(int j = 1; j <= randNum; j++){
            int count = 0;
            prime = true;

            for(int i = 1; i <= j; i++) {
                if(j % i == 0) {
                    count++;
                }
            }
            if(count != 2)
                prime = false;

            if(!prime){
                System.out.println(j + " is not a prime number");
            } else if(prime) {
                System.out.println(j + " is a prime number");
            }
        }
    }
}
