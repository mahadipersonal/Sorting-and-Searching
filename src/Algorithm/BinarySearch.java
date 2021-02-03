package Algorithm;

public class BinarySearch {

    public void search(int[] array, int number){
        int start = 0;
        int end = array.length-1;
        int mid;

        while(start<=end){
            mid = (start+end)/2;

            if (array[mid]== number) {
                System.out.println("Number Found at Index " + mid);
                return;
            }
            else if(array[mid]>number) end -=1;
            else if(array[mid]< number) start +=1;
        }
        System.out.println("Number Not Found!!");
    }
}
