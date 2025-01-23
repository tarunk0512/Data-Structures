package LeetCodeDS.HashMap;

import java.util.HashMap;

public class EqualRowAndColumn {
    public static void main(String[] args){
        int [][] ar = {{3,1,2,2},
                       {1,4,4,5},
                       {2,4,2,2},
                       {2,4,2,2}};
        System.out.println(printEqualNumber(ar));
    }
    public static int printEqualNumber(int[][] ar){
        HashMap<Integer, String> row = new HashMap<>();
        HashMap<Integer, String> column = new HashMap<>();


        for(int i =0; i<ar.length; i++){
            StringBuilder sRow = new StringBuilder();
            StringBuilder sColumn = new StringBuilder();
            for(int j = 0; j< ar[0].length; j++){
                sRow.append(ar[i][j]);
                sRow.append(" ");
                sColumn.append(ar[j][i]);
                sColumn.append(" ");
            }
            row.put(i, sRow.toString());
            column.put(i, sColumn.toString());
        }
        int count = 0;
        for(int i = 0; i<ar.length; i++){
            for(int j = 0; j< ar.length; j++){
            if(row.get(i).equals(column.get(j))){
                count++;

            }
        }
        }
    return count;
    }
}
