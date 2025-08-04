package takeUForward.Sorting_1;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
    int [] ar = {64,11,34,23,43,24};
    SelectionSort sort = new SelectionSort();
    int [] sortedAr = sort.selectionSort(ar);
    System.out.println(Arrays.toString(sortedAr));
    }
    public int [] selectionSort(int [] ar){
        int n = ar.length;
        for(int i = 0; i<n; i++){
            int min = i; // Assume the first element is the minimum
            for(int j = i+1; j<n; j++){
                if(ar[j]<ar[min]){
                    min = j; // Update the index of the minimum element
                }
            }
            int temp = ar[i]; // Store the current element
            ar[i] = ar[min]; // Swap the found minimum element with the first element
            ar[min] = temp; // Swap the found minimum element with the first element
        }

        return ar;
    }


}
