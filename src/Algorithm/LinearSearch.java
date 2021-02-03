package Algorithm;

public class LinearSearch {

    public void search(int[] array,int number){
        for(int i=0; i<array.length; i++){
            if(number == array[i]){
                System.out.println("Number Found at index " + i);
                return;
            }
        }
        System.out.println("Number Not Found!!");
    }
}
