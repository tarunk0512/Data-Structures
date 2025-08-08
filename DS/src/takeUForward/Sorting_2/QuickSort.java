package takeUForward.Sorting_2;

public class QuickSort {
    public static void main(String [] args){
        int [] ar = {10, 7, 8, 9, 1, 5};
        quickSort(ar,0, ar.length-1);
    }
    public static void quickSort(int [] ar, int low, int high){
        if(low<high){
            int partitionIndex = partition(ar, low, high);
            quickSort(ar, low, partitionIndex - 1); // Recursively sort elements before partition
            quickSort(ar, partitionIndex + 1, high); // Recursively sort elements after partition
        }
    }
    // Partition method: places pivot in correct position, and arranges smaller and greater around it
    public static int partition(int [] ar, int low, int high){
        int pivot = ar[high]; // Choosing the last element as pivot
        int i = low - 1; // Index of smaller element
        for(int j = low; j < high; j++){
            if(ar[j] < pivot){
                i++; // Increment index of smaller element
                // Swap ar[i] and ar[j]
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }
        // Swap ar[i + 1] and ar[high] (or pivot) :-  // Swap pivot with the element at i+1
        int temp = ar[high];
        ar[high] = ar[i+1];
        ar[i+1] = temp;
        return i + 1; // Return the partitioning index
    }
}
