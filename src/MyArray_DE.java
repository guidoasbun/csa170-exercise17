public class MyArray_DE {
    public static void main(String[] args) {

//        int[] a = {10, 20, 30, 40, 50};
//        int[] a = {45, 38, 27, 46, 81, 72, 56, 61, 20, 48, 76, 91, 57, 35, 78};
//        int[] a = {300, 38, 27, 46, 81, 72, 56, 61, 20, 48, 76, 91, 57, 35, 78};
        int[] a = {45, 38, 27, 46, 81, 72, 56, 61, 20, 48, 76, 91, 57, 35, 800};
//        int[] a = {100};

        int maxValue = a[0];
        int maxIndex = 0;
        int sumEven = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i] > maxValue){
                maxValue = a[i];
                maxIndex = i;
            }
            if (a[i] % 2 == 0){
                sumEven += a[i];
            }
        }

        System.out.println("The largest element is " + maxValue);
        System.out.println("The largest element is at index " + maxIndex);
        System.out.println("The sum of all even elements is " + sumEven);
        System.out.print("The array a in reverse order: ");
        for(int i = a.length-1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
    }
}
