package takeUForward.Sorting_1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String [] args){
     int [] ar = {4,7,2,13,54,23};
     BubbleSort bSort = new BubbleSort();
     bSort.bubbleSort(ar);
     System.out.println(Arrays.toString(bSort.bubbleSort(ar)));
    }
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
