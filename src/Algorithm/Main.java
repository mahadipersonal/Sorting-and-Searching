package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How Many Elements: ");
        int numberOfElements = sc.nextInt();
        System.out.println();

        ArrayInsert array = new ArrayInsert(numberOfElements);

        int[] unSortedArray = array.insert();    // method returns unsorted Array.
        System.out.println("\nUnsorted Array: "+ Arrays.toString(unSortedArray));

        bubbleSorting(unSortedArray);
        insertionSorting(unSortedArray);
        selectionSort(unSortedArray);

    }

    private static void bubbleSorting(int[] unSortedArray) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedArray = bubbleSort.sort(unSortedArray);  // method returns a sorted array

        System.out.println("Sorted Using BubbleSort: "+ Arrays.toString(sortedArray));
    }

    private static void insertionSorting(int[] unSortedArray) {
        InsertionSort insertionSort = new InsertionSort();

    }

    private static void selectionSort(int[] unSortedArray) {
        SelectionSort selectionSort = new SelectionSort();
        int[] sortedArray = selectionSort.sort(unSortedArray);  // method returns a sorted array

        System.out.println("Sorted Using SelectionSort: " + Arrays.toString(sortedArray));
    }
}
