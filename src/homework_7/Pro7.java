/*Write a java program to input any number and find out if it’s odd or even.*/
package homework_7;

import java.util.Scanner;

public class Pro7 {
    public static void main(String[] args) {
        //To take input from the user
        //Create an object of scanner class
        Scanner sc = new Scanner(System.in);
        int a; //Declare a variable
        System.out.println("Enter a number and will divide by 2 : ");
        a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("The answer is in even");
        } else {
            System.out.println(" The answer is in odd");
        }
    }
}





