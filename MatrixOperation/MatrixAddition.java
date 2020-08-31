/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrix;

import java.util.Arrays;

/**
 *
 * @author Farzana
 */
public class MatrixAddition {
    public static int[][] add(int[][] a, int[][] b){
       int c[][]=new int[3][3];
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               c[i][j]=a[i][j]+b[i][j];
           }
       }
     return c;   
    }
    
    public static void main(String args[]){
    
        int a[][]={{1,2,3},{1,3,3},{2,2,4}};
        int b[][]={{3,2,5},{1,8,2},{9,1,4}};
        //Find a+b
        int[][] c=add(a,b);
        for(int i=0;i<3;i++){
          System.out.print(Arrays.toString(c[i]));
       }
    
    }
}
