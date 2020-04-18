/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Besty
 */
public class BinaryPeriod {
    //calculate the binary period of an integer
     public int getBinaryPeriodForInt(int n) {
        int[] d = new int[30];
        int l = 0;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            l++;
        }

        for (int p = 1; p < l; p++) {
            if (p <= l / 2) {
                boolean ok = true;
                for (int i = 0; i < l - p; i++) {
                    if (d[i] != d[i + p]) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                     return p;
                }
            }
        }

        
        return -1;
    }
}
