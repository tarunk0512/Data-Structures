package takeUForward.SearchingAlgoS;

public class BinarySearchWithRecusrion {
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 5;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println(result); // Output: 4 (index of target 5)
    }

    public static int binarySearch(int [] ar, int target, int left, int right){
        if(left>right) return -1; // Base case: target not found
        int mid = (left+right)/2;
        if(ar[mid]==target){
            return mid; // target found
        }
        else if(ar[mid] < target){
            return binarySearch(ar, target, mid+1, right);
        }else{
            return binarySearch(ar, target, left, mid-1);
        }
    }
}
