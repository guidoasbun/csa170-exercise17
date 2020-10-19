/*
 * Guido Asbun
 * CS A170
 * 18-October-2020
 *
 * Exercise 17
 */

public class MyArray_ABC {
    public static void main(String[] args) {
//        int[] a = {10, 20, 30, 40, 50};
//        int[] a = {45, 38, 27, 46, 81, 72, 56, 61, 20, 48, 76, 91, 57, 35, 78};
        int[] a = {300, 38, 27, 46, 81, 72, 56, 61, 20, 48, 76, 91, 57, 35, 78};
//        int[] a = {45, 38, 27, 46, 81, 72, 56, 61, 20, 48, 76, 91, 57, 35, 800};
//        int[] a = {100};

        int maxValue = a[0];
        int maxIndex = 0;
        int sum = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i] > maxValue){
                maxValue = a[i];
                maxIndex = i;
            }
            sum += a[i];
        }

        System.out.println("The largest element is " + maxValue + ".");
        System.out.println("The largest element is at index " + maxIndex + ".");
        System.out.println("The sum of all elements is " + sum + ".");
    }
}
