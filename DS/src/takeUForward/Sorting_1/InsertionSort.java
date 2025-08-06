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
            ar[j+1] = min;
        }

        return ar;
    }
}
