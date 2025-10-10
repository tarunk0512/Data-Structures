package Practice.Arrays;

public class ProductExceptSelf {

    // Product Except Self
    public static void main(String [] args){
        int [] ar = {1,2,3,4};
        ProductExceptSelf pes = new ProductExceptSelf();
        int [] res = pes.getProduct(ar);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
    public int [] getProduct(int [] ar){
        int [] res = new int[ar.length];
        int finalProd = 1;
        int zeroCount = 0;
        for(int i : ar){
            if(ar[i] != 0){
                finalProd = finalProd*ar[i];
            }else{
                zeroCount++;
            }
        }

        for(int i = 0; i < ar.length; i++){
            if(zeroCount > 1){
                res[i] = 0;
            }else if(zeroCount == 1){
                res[i] = ar[i] == 0 ? finalProd : 0;
            }else{
                res[i] = finalProd/ar[i];
            }
        }
        return res;

    }


}
