/*Write a Java program to calculate the average value of array elements.*/

package homework_7;

import java.util.Arrays;

public class Pro22 {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 60;
        System.out.println("Average value of arrays is =" + Arrays.stream(a).sum() / 5);

    }
}
