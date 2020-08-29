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
public class PyramidClass {
    
    public void getPyramidStar(){
        for(int i=0;i<5;i++){
           for(int j=0;j<=i;j++){
               System.out.print("* ");
           }
          System.out.println("");

       }     
    }
    public void getReversePyramidNumber(){
        for(int i=5;i>0;i--){
           for(int j=1;j<=i;j++){
               System.out.print(j+" ");
           }
          System.out.println("");

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
    
    
    
    
  public int getTrinagle(int no){
       if(no==1)
           return 1;
       else return no*getTrinagle(no-1);
 }  
    
    
    
    
}
