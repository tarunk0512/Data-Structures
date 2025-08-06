package takeUForward.SearchingAlgoS;

public class BinarySearch {
    public static void main(String [] args){
        int [] ar = {1,2,3,4,5,6,7,8,9,10};
        int target = 7;
        int result = binarySearch(ar, target);
        System.out.println(result);
    }

    public static int binarySearch(int [] ar, int target){
        int left = 0;
        int right = ar.length - 1;
        while(left <=right){
            int mid  = (left + right) / 2;
            if(ar[mid] == target){
                return mid;
            }else if(ar[mid]<target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }
}
