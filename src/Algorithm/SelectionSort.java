package Algorithm;

public class SelectionSort {

    public int[] sort(int[] array){

        for(int i=0; i<array.length-1; i++){
            int min = array[i];

            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
