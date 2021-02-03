package Algorithm;

import java.util.Scanner;

public class ArrayInsert {
    private final int[] array;
    private int count = 0;

    ArrayInsert(int arraySize){
        array = new int[arraySize];
    }

    public int[] insert(){
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<array.length; i++){
            System.out.printf("Enter Array element No.%d: ",++count);
            int number = scanner.nextInt();

            array[i] = number;
        }
        return array;
    }
}
