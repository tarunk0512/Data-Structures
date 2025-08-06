package takeUForward.Sorting_1;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String [] args){
        int [] ar = {12, 11, 13, 5, 6};
        InsertionSort iSort = new InsertionSort();
        System.out.println(Arrays.toString(iSort.insertion(ar)));

    }
    public int [] insertion(int [] ar) {
        int n = ar.length;
        for(int i = 1; i< n ; i++){
            int min = ar[i];
            int j = i-1;
            while(j>=0 && ar[j] > min){
                ar[j+1] = ar[j];
                j--;
            }
            ar[j+1] = min; // In insertion sort we have condition : - while(j>=0 && ar[j] > min) which means we are shifting the elements to
            // the right and then placing the min element at the correct position and traversing to the left of array
            //so it has two cases which are being checked : j >=0 and ar[j] > min
            // if j goes below zero then it means anyway we will have to insert the element at j+1
            // and if ar[j] < min then it means we have found the correct position to insert the min element
            // so we insert it at j+1 that is one step ahead of ar[j]

        }

        return ar;
    }
}
