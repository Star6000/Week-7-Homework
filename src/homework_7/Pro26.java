/*Write a Java program to reverse a word.
        Sample Output:
        Input a word: dsaf
        Reverse word: fasd*/

package homework_7;

import java.util.Scanner;

public class Pro26 {
    public static void main(String[] args) {
m1();
    }
    public static void m1(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word :");
        String word = sc.next();
        String word2="";

        for(int i=0;i<word.length();i++) {

            word2= word.charAt(i)+word2;}

        System.out.println(word2);


    }
}

