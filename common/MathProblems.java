/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Farzana
 */
public class MathProblems {
    
    // Decemal to Binary
    public void Decimal2Binary(int num){
        int b[]=new int[30];
        int i=0;
        while(num!=1){  
            int d=num%2;
            num=num/2;
            b[i]=d;
            i++;            
            //System.out.print(" "+i+" "+d+" ");
        }
        b[i]=1;        
        for(i=i;i>=0;i--){
           System.out.print(" "+b[i]+"");
        }
        
    }
    
    public void listEvenNumber(int limit){
     for(int i=1;i<=limit;i++){
         if(i%2==0)
             System.out.print(i+" ");
     }
        
    }
    
    public void factorialNumber(int number){
        int sum=1;
     for(int i=number;i>0;i--){
         sum=sum*i;                   
     }       
      System.out.print(sum+" Factorial");
    }
    
    public void listFactorialNumber(int limit){
        for(int i=1;i<=limit;i++){        
            int sum=1;
            for(int j=i;j>0;j--){
                sum=sum*j;                   
            }       
             System.out.print(sum+"  ");
        }        
    }
    public void febonacciSeries(int limit){
        int i1=0,i2=1,i3=i1+i2; 
        System.out.print(i1+"  "+i2+"  "+i3);

        for(int i=1;i<=limit-2;i++){        
            i1=i2;
            i2=i3;
            i3=i1+i2;
            System.out.print("  "+i3);

        }        
    }
    //not done yet
    public void palindromeNumber(int number){
        
        int temp1=number/10;
        int temp2=number%10;
        int total=number*temp1+temp2;
        if(total==number)
            System.out.println("Palindrome  "+number);
         else
            System.out.println("Not Palindrome  "+number);
               
    }//not done
    
     public int factorialNumberByRecursive(int number){
        if(number<=1)
            return 1;
        else 
            return number*factorialNumberByRecursive(number-1);
    }
     
     public void primeNumber(int number){
     
         int flag=1;
         for(int i=2;i<number;i++)
         {
             if(number%i==0){
                 flag=0;
                 break;
             }                 
             
         }
         
         if(flag==0) System.out.println("Not Prime number   "+number);
         else System.out.println(" Prime number   "+number);
     }
     
     /* 1 to N */
      public void listPrimeNumber(int N){
     
         for(int j=2;j<20;j++){
            int flag=1;
            for(int i=2;i<j;i++)
            {
                if(j%i==0){
                    flag=0;
                    break;
                }                 

            }

            if(flag!=0) System.out.print(j+" ");

         } 
              
      }
    
}
