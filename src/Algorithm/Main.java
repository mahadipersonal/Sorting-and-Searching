package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int[] finalSortedArray;

    public static void main(String[] args){
        System.out.print("How Many Elements: ");
        int numberOfElements = sc.nextInt();
        System.out.println();

        ArrayInsert array = new ArrayInsert(numberOfElements);

        int[] unSortedArray = array.insert();    // method returns unsorted Array.
        System.out.println("\nUnsorted Array: "+ Arrays.toString(unSortedArray));

        bubbleSorting(unSortedArray);
        selectionSort(unSortedArray);
        insertionSorting(unSortedArray);

        //Searching
        searching(unSortedArray);

    }

    private static void bubbleSorting(int[] unSortedArray) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedArray = bubbleSort.sort(unSortedArray);  // method returns a sorted array

        System.out.println("Sorted Using BubbleSort: "+ Arrays.toString(sortedArray));
    }

    private static void insertionSorting(int[] unSortedArray) {
        InsertionSort insertionSort = new InsertionSort();
        int[] sortedArray = insertionSort.sort(unSortedArray);

        System.out.println("Sorted Using InsertionSort: " + Arrays.toString(sortedArray));
        finalSortedArray = sortedArray;
    }

    private static void selectionSort(int[] unSortedArray) {
        SelectionSort selectionSort = new SelectionSort();
        int[] sortedArray = selectionSort.sort(unSortedArray);  // method returns a sorted array

        System.out.println("Sorted Using SelectionSort: " + Arrays.toString(sortedArray));
    }

    private static void searching(int[] unSortedArray){
        System.out.print("\nWhich number you want search: ");
        int numberToSearch = sc.nextInt();

        System.out.print("Result Using LinearSearch: ");
        LinearSearch linearSearch = new LinearSearch();
        linearSearch.search(unSortedArray,numberToSearch);

        System.out.print("Result Using BinarySearch: ");
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.search(finalSortedArray,numberToSearch);
    }
}
