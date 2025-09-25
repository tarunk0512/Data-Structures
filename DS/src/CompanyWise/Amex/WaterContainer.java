package CompanyWise.Amex;

public class WaterContainer {
    public static void main(String[] args) {
        int[] height = {1,6,6,2,5,4,8,3,7};
        System.out.println(maxWater(height));
    }
    //Input: [1,8,6,2,5,4,8,3,7]

    public static int maxWater(int [] ar){
        int left = 0;
        int right = ar.length-1;
        int max = 0, min = 0;
        while(left < right){
            min = Math.min(ar[left], ar[right]);
            max = Math.max(((right-left)*min), max);
            if(ar[left] < ar[right]){
                left ++;
            }else{
                right--;
            }
        }
        return max;
    }
}
