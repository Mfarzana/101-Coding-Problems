/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems;

/**
 *
 * @author Farzana
 */
public class TryCatchOutput {
    
  int count = 0;
 
    void A() throws Exception
    {
        try
        {
            count++;
               System.out.println("try 1");
            try
            {
                count++;
                System.out.println("try 2");
                try
                {
                    count++;
                    System.out.println("try 3");
                    throw new Exception();
 
                }
                 
                catch(Exception ex)
                {
                    count++;
                      System.out.println("try-catch 3");
                    throw new Exception();
                }
            }
             
            catch(Exception ex)
            {
                count++;
                                      System.out.println("try-catch 2");
                                        // no Exception Create
            }
        }
         
        catch(Exception ex)
        {
            count++;
                                  System.out.println("try-catch 1");

        }
 
    }
 
    void display()
    {
        System.out.println(count);
    }
 
    public static void main(String[] args) throws Exception
    {
        TryCatchOutput obj = new TryCatchOutput();
        obj.A();
        obj.display();
    }
}
