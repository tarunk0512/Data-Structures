package LeetCodeDS.Arrays;

import java.util.Arrays;

//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
public class RotateArray {
    public static void main(String [] args){
        int [] ar = {1,2,3,4,5,6,7};
        int [] arr = {1,2,3,4,5,6,7};

        System.out.println("Rotated Array : "+ Arrays.toString(rotateArray(ar,3)));
        System.out.println("Rotated Array in alternate way : "+ Arrays.toString(rotateArr(arr, 3)));
    }

    private static int[] rotateArr(int[] ar, int k) {
        int n = ar.length;
        k = k%n;
        int[] rotated = new int[n];
        for(int i =0; i<n; i++){
            rotated[(k+i)%n] = ar[i];
        }
        System.arraycopy(rotated, 0, ar, 0, n);
        return ar;
    }

    public static int[] rotateArray(int[] ar, int k){
        int n = ar.length;
        k = k % n;
        reverseAr(ar, 0, n-1);
        reverseAr(ar, 0, k-1);
        reverseAr(ar,k, n-1);
        return ar;
    }
    public static void reverseAr(int[] ar, int start, int end){
        while(start<end){
            int temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end--;
        }
    }
}
