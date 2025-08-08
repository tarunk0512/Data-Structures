package takeUForward.Sorting_1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String [] args){
     int [] ar = {4,7,2,13,54,23};
     BubbleSort bSort = new BubbleSort();
     bSort.bubbleSort(ar);
     System.out.println(Arrays.toString(bSort.bubbleSort(ar)));
    }
    //Bubble Sort is one of the simplest sorting algorithms.
    // It's called "bubble" sort because smaller elements "bubble up" to the top (start of the array)
    // in each pass, just like bubbles rising in water.
    //Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.
    //
    //It performs multiple passes through the list:
    //In each pass, the largest unsorted element is moved to its correct position at the end.
    //
    //This continues until the entire array is sorted.
    public int[] bubbleSort(int [] ar){
        int n = ar.length;
        for(int i = 0; i< n; i++){
            for(int j = 0; j < n-i-1; j++){
                if(ar[j] > ar[j+1]){
                int temp = ar[j];
                ar[j] = ar[j+1];
                ar[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(ar) + " ");
        }

        return ar;
    }
}

// Inner Loop Explanation:
//This loop does the actual comparison and swapping of adjacent elements.
//But why n - i - 1?
//Let’s break it down:
//n: total elements
//i: number of elements that are already in place at the end (sorted)
//-1: because you're accessing ar[j + 1], so j must stop at n - 2
//We don’t need to compare the last i elements, because they’re already sorted after i passes.
