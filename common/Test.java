/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.*;


/**
 *
 * @author Besty
 */
/*

/*
 *  *  *  *  * 
   *  *  *  * 
    *  *  * 
     *  * 
      * Start Triangle
*/
public class Test {
    public void starTriangle1(){
        for(int i=0;i<5;i++){
            for(int k=0;k<=i;k++)  
                System.out.print(" ");
                
            for(int j=i;j<5;j++)
                System.out.print(" * ");
            
             System.out.println(); 
        }  
    }
    
    /* 
       * 
      *  * 
     *  *  * 
    *  *  *  * 
   *  *  *  *  * 
    Start Triangle 2 */
    public void starTriangle2(){
        for(int i=5;i>0;i--){
            for(int k=0;k<=i;k++)  
                System.out.print(" ");
            
            for(int j=i;j<=5;j++)
                System.out.print(" * ");
            
             System.out.println(); 
        }    
        
    }    
    
    //VVI
   /* when number=4 and seq=1
    0	
    2	4	
    6	8	10	
    12	14	16	18	
*/
    public void getPyramidNumberSeq(int number,int seq){
        int y=0;
        for(int i=0;i<number;i++){
           for(int j=0;j<=i;j++){              
               System.out.print(y+"\t");
                y=y+seq;
               
           }
          System.out.println("");

       }     
    }
    
    public void getInvertTriangle(int number){
        for(int i=number;i>0;i--){
           for(int j=0;j<i;j++){              
               System.out.print(i+" ");
              
           }
          System.out.println("");

       }     
    }
    
    /* output when number=4
    0 
    1 0 
    0 1 0 
    1 0 1 0 
    0 1 0 1 0 
    */
    public void getBinaryTriangle(int number){
        for(int i=1;i<=number;i++){
            
           for(int j=1;j<=i;j++){              
               System.out.print((i+j)%2+" ");
              
           }
          System.out.println("");

       }     
    }
    
    //Second Max in an Array,  A[]={10,2,4,5,70};smax=10
    public int getSecondMax(int A[]){
        int max=A[0],smax=0;
        for(int i=1;i<A.length;i++){
            if(max<A[i]){
                smax=max;
                max=A[i];
            }
           if(A[i]<max && A[i]>smax) smax=A[i]; 
        }
        return smax;
    }
    //Second Min in an Array,  A[]={10,2,4,5,70};smin=4
    public int getSecondMin(int A[]){
        int min=A[0],smin=0;
        for(int i=1;i<A.length;i++){
            if(min>A[i]){
                smin=min;
                min=A[i];
            }
            if(A[i]>min && A[i]<smin) smin=A[i];        
        }
        return smin;
    }
    //single number Prime check
    public String getSinglePrime(int N){
        if(N==1) return "Not Prime";
        for(int i=2;i<N;i++){
            if(N%i==0) return "Not Prime";
        }        
        return "prime";
    }
    //prime number in a array();
    public void getPrimeNumberArray(int A[]){
        for(int i=0;i<A.length;i++){
            int count=0;
            for(int j=2;j<A[i];j++){
                if(A[i]%j==0){
                    count++;
                    break;
                }
            }
            if(count<1 && A[i]>1)System.out.print(" "+A[i]+" ");
        }
    
    }
    // Prime Number Recursive 100% working
    public boolean getSinglePrimeRecursive2(int N,int i){
       if(i>2){
           i=i-1;
           if(N%i==0){                          
               return false;
           }           
           
           return getSinglePrimeRecursive2(N, i);
       }else if(N!=1)return true;       
       else return false;
          
    }
    // Prime Number Recursive this code 1 also return as prime number 99% working
    public boolean getSinglePrimeRecursive1(int N,int i){
       if(i>2){
           i=i-1;
           if(N%i==0){                          
               return false;
           }           
           
           return getSinglePrimeRecursive1(N, i);
       }else return true;      
          
    }
    // prime number in an Array with Recursive function    
    public void getPrimeArrayRecursive(int A[]){
        for(int i=0;i<A.length;i++){
            boolean a=isPrimeRec(A[i],A[i]);
            if(a)System.out.print(" "+A[i]);
        }
    
    }
    public boolean isPrimeRec(int N,int i){
       if(i>2){
           i=i-1;
           if(N%i==0){                          
               return false;
           }           
           
           return getSinglePrimeRecursive2(N, i);
       }else if(N!=1)return true;       
       else return false;
          
    }/* end prime number in an array with recursive */
    
    //get factoral number by recursive function
    public int getFactorialRecursive(int N){
        if(N==1) return 1;
        else return N*getFactorialRecursive(N-1);    
    }
    
    //factorial number in array by recursive
    public void getFactorialArrayRecursion(int A[]){
        for(int i=0;i<A.length;i++){
            System.out.print(" "+getFactorialRecursive(A[i])+" ");            
        }
        
    }
    public void getFebonacciSeries(){
        int t1=0,t2=1,temp=0;
        System.out.print(t1+" "+t2+" ");
        for(int i=0;i<20;i++){
            temp=t2+t1;
            t1=t2;
            t2=temp;
            System.out.print(temp+" ");
        }
            
    }
    
    // Array in Acending order 
    public void getAccendingOrderArray(int A[]){ 
        int temp=0;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]>A[j]){
                    temp=A[j];
                    A[j]=A[i];
                    A[i]=temp;
                }
            }
        }
        for(int i=0;i<A.length;i++)
            System.out.print(" "+A[i]);
    }
    //Descending order
    public void getDecendingOrderArray(int A[]){
        int temp=0;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]<A[j]){
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }            
        }
        for(int i=0;i<A.length;i++)
            System.out.print(" "+A[i]);
    }
    // Union Operation (AUB)
    public void getUnionArray(int A[],int B[]){
       ArrayList<Integer> C=new ArrayList<>();   
       for(int i=0;i<A.length;i++){
           C.add(A[i]);
       }
       for(int i=0;i<B.length;i++){ 
           boolean found=false;
           for(int j=0;j<A.length;j++){               
               if(B[i]==A[j]) found=true;
           } 
           if(!found) C.add(B[i]);
       }       
       for(Integer i:C)
        System.out.print(" "+i+" ");       
       
    }
    //InterSection (A^B)
     public void getIntersectionArray(int A[],int B[]){
       ArrayList<Integer> C=new ArrayList<>();  
       for(int i=0;i<A.length;i++){ 
           for(int j=0;j<B.length;j++){               
               if(A[i]==B[j]) C.add(A[i]);
           }
       }       
       for(Integer i:C)
        System.out.print(" "+i+" ");       
       
    }
    // (A-B)
     public void getA_B(int A[],int B[]){
       ArrayList<Integer> C=new ArrayList<>();  
       for(int i=0;i<A.length;i++){ 
         boolean found=false;
           for(int j=0;j<B.length;j++){               
               if(A[i]==B[j]) found=true;
           } 
           if(!found) C.add(A[i]);
       } 
       for(Integer i:C)
        System.out.print(" "+i+" ");        
    }
     //Binary Search
     public int getBinarySearchValue(int A[],int N){
         int len=A.length,l=0;
         for(int i=0;i<A.length;i++){
             int m=l+(len-1)/2;
             if(N==A[m]) return m;
             if(N>A[m])l=m+1;
             else len=m-1;
         }
     return -1;
     }
    // Binary Search Recursion
     public int getBinarySearchValueRecursion(int A[],int N){
         int len=A.length,l=0;
         for(int i=0;i<A.length;i++){
             int m=l+(len-1)/2;
             if(N==A[m]) return m;
             if(N>A[m])l=m+1;
             else len=m-1;
         }
     return -1;
     }
     public int getBRecursion(int A[],int len,int l,int N){
         int mid=l+(len-1)/2;
         if(N==A[mid])return mid;
         if(N>A[mid])return getBRecursion(A,len, mid+1, N);
         else return getBRecursion(A,mid-1,l, N);         
     }
     // end Binary Recursion
     
     //Palindrome String
     public String getPlandrom(String s){         
         char ch[]=s.toCharArray();
         int temp=ch.length-1;
         for(int i=0;i<ch.length;i++){
             if(ch[i]!=ch[temp]) return " not palindrom";
             temp--;
         }
         return "palindrome";
         
     }
     //palindrome string with recursion fuction
     public String getPlandromRecursion(String s){         
         char ch[]=s.toCharArray();
         return sRecursion(ch, 0, ch.length-1);         
     }
     public String sRecursion(char A[],int i,int temp){ 
         
         if(i<A.length){
            if(A[i]!=A[temp]) return " not palindrom";
            else return sRecursion(A, i+1, temp-1);
         }
         return "palindrome";         
     }
     // Substring B is substring of A
     public String getSubtring(String s, String sub){
         char ch[]=s.toCharArray();
         char sch[]=sub.toCharArray();
         for(int i=0;i<=ch.length-sch.length;i++){
             int k=i;
             int count=0;
             for(int j=0;j<sch.length;j++){
                 if(ch[k]==sch[j])count++;
                 k++;
             }
             if(count==sub.length()) return "substring ";
         }
         return "not a substring";
     }
     // Replace String by another String
     public String getReplaceString(String s1, String s2){
         char ch[]=s1.toCharArray();
         char ch2[]=s2.toCharArray();
         for(int i=0;i<=ch.length-ch2.length;i++){
             if(ch[i]=='d' && ch[i+1]=='o' && ch[i+2]=='g'){
                 ch[i]=ch2[0];
                 ch[i+1]=ch2[1];
                 ch[i+2]=ch2[2];
             }
         }
     
         return String.copyValueOf(ch);
     }
     //Second Most Character in the sequecne 
     public char getSecondMostSequence(String s){
        char ch[]=s.toCharArray();
        int ca[]=new int[ch.length];        
        int precount=0;
        
        // count character
        for(int i=0;i<ch.length;i++){
            int count=0;
            for(int j=0;j<ch.length;j++){
                if(ch[i]==ch[j]) count++;  
            } 
            ca[i]=count;
        }
        // find second max
        int min=0,max=ca[0],step=0;
        for(int j=1;j<ca.length-1;j++){
            if(ca[j]<max && ca[j]>min){
                min=ca[j];                
                step=j;
                System.out.print(min+" "+max+" ");                        
            }else max=ca[j];
        }              
    
        return ch[step];

     }
     // Longest Palindrome
    //Copy from online 
     public  HashMap<String, Integer> findLongestPalindrome(String str) {
        int i = 0;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while (i < str.length()) {
            String alpha = String.valueOf(str.charAt(i));
            if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
                String palindrome = str.substring(i, str.lastIndexOf(str.charAt(i)) + 1);
                if (isPalindrome(palindrome)) {
                    map.put(palindrome, palindrome.length());
                    i = str.lastIndexOf(str.charAt(i));
                }
            }
            i++;
        }
        return map;
    }

    public  boolean isPalindrome(String substring) {
        for (int i = 0; i <= substring.length() / 2; i++) {
            if (substring.charAt(i) != substring.charAt(substring.length() - 1 - i)) {
                return false;
            }
        }
        return true;

    }

   // int x[] = { 1, 2, 3, -1, 4 }; 
   // int y[] = { 1, 2, 3, -1, 4 }; 
    //inner=1, outer=3 
    

    public int getTotalPoint(int inner,int outer,int []points_x,int []points_y){  
        double p[] = new double[points_x.length]; 
        for (int i = 0; i <points_x.length; i++) 
            p[i] =Math.sqrt(points_x[i] * points_x[i] + points_y[i] * points_y[i]);  
            // distance r^2=x^2=y^2 when center(0.0)
            // r^2=(h-x)^2+(k-y)^2; here (h,k)=center points and (x,y)=points in a circle
  
        Arrays.sort(p); 
        int r1_poitns=0, r2_points=0;
        for(int i=0;i<points_x.length;i++){
            if(p[i]<=(inner*1.0)) r1_poitns++; 
            if(p[i]>inner && p[i]<=outer) r2_points++;            
        }
        System.out.println(" inner points "+r1_poitns+" outer poitns "+r2_points);
        
        return r1_poitns+r2_points;
              
    }
    //calculate the binary period of an integer
     static int getBinaryPeriodForInt(int n) {
        int[] d = new int[30];
        int l = 0, res = -1;
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
                    res = p;
                }
            }
        }

        
        return res;
    }
     
     
     //
    /* static int getBinaryPeriodForInt(int n) {
        int[] d = new int[30];
        int l = 0, res = -1;
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
                    res = p;
                }
            }
        }

        
        return res;
    }
	
	*/
    
}
