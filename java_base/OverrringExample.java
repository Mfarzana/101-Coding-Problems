/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_base;

/**
 *
 * @author Farzana
 */
class Ex1 {
      static int a=10;
    public  void show(){
               System.out.println("parent.......................... calling "+a);

    }

    public  void show_parrent(){
              System.out.println("Perent class show() calling "+a);

    }

    public Ex1() {
          System.out.println("Constructor parent class s");
    }
    
}
class Ex2 extends Ex1{
    @Override
    public  void show(){
        a=30;
                System.out.println("child **************.......................... calling "+a);

    }
     public  void show_child(){
              System.out.println("child.......................... calling "+a);

    }

   public Ex2() {
          System.out.println("Constructor child class class s");
    }

}

public class OverrringExample {
   
    public static void main(String[] args) {
       //Ex1 eXample=new Ex1(); //parent class
      // eXample.show();
       
       Ex1 ee=new Ex2();// call child
       ee.show();
      
         Ex1 ee2=new Ex1(); //call child
         ee2.show();
         
       
     
      //eXample.show();
      
      final int b;
      b=10;
      
      int a=20;
    }
}