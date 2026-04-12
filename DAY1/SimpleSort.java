//Getting started with array searching sorting anddisplaying content of array
//step 1- Create a class named ArraySearch and add the main method to it.
//Step 2- declare an array of integers and initializes it with some values.
//Step 3- Display the contents of the array usling a loop
// public class LinearSearchDemo {
//     public static void main(String[] args) {
//         int[] arr = {10, 25, 5, 30, 15};
//         int key = 30;

//         int index = -1;

//         for(int i = 0; i < arr.length; i++) {
//             if(arr[i] == key) {
//                 index = i;
//                 break;
//             }
//         }

//         if(index != -1) {
//             System.out.println("Element found at index: " + index);
//         } else {
//             System.out.println("Element not found");
//         }
//     }
// }

import java.util.Arrays;

public class SimpleSort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 2, 9};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}

// public class FindIndex {
//     public static void main(String[] args) {
//         int[] arr = {5, 10, 15, 20, 25};
//         int key = 20;

//         int index = -1;

//         for(int i = 0; i < arr.length; i++) {
//             if(arr[i] == key) {
//                 index = i;
//                 break;
//             }
//         }

//         if(index != -1) {
//             System.out.println("Element found at index: " + index);
//         } else {
//             System.out.println("Element not found");
//         }
//     }
// }

