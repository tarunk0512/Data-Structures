package LeetCodeDS.WaterStorage;

public class WaterHardLeet {
    public static void main(String[] args){
        int ar[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Water that can be stored : "+trap(ar));
    }
    public static int trap(int[] ar){
        int left =0;
        int right = ar.length - 1;
        int leftMax = ar[left];
        int rightMax = ar[right];
        int water = 0;
        while(left<right){
            if(leftMax<rightMax){
                left++;
                leftMax = Math.max(leftMax, ar[left]);
                water += leftMax - ar[left];
            }else{
                right--;
                rightMax = Math.max(rightMax, ar[right]);
                water += rightMax - ar[right];
            }
        }
    return water;
    }
}
