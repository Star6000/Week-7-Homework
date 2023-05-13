/*Write java program using for loop and print surname 9 times.*/

package homework_7;

import java.util.Scanner;

public class Pro24 {
    public static void main(String[] args) {
        surname();
    }

        public static void surname(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your surname");
            String Surname = sc.next();

            for(int b =1; b<9; b++){

                System.out.println(Surname);}
    }
}





