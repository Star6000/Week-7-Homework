/*Write a Java program to sum values of an array.*/

package homework_7;

import java.util.Arrays;

public class Pro21 {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0]=15;
        a[1]=25;
        a[2]=35;
        a[3]=45;
        a[4]=55;
        System.out.println(Arrays.stream(a).sum());

    }

}
