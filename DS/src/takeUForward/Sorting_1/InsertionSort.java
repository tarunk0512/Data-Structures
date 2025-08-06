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
        for(int i = 1; i< n ; i++){ // we start from 1 because we assume that the first element is already sorted
            // and we will insert the next element at the correct position in the sorted part of the array
            // so we will traverse the array from left to right and for each element we will
            // find the correct position in the sorted part of the array and insert it there
            // so we will start from the second element and go till the last element
            int min = ar[i];
            int j = i-1;
            while(j>=0 && ar[j] > min){ // this is the condition to find the correct position of the min element
                // we will traverse the sorted part of the array from right to left and shift the elements
                // to the right until we find the correct position for the min element
                // so we will keep shifting the elements to the right until we find the correct position for the min element
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
