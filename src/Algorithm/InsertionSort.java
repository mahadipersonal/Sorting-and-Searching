package Algorithm;

public class InsertionSort {

    public int[] sort(int[] array){
        for(int i=1; i<array.length; i++){
            int key = array[i];
            int j = i-1;

            while(j>=0 && key<array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        /*at this pointer array is sorted*/
        return array;
    }
}
