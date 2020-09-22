/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_base;
import java.util.regex.*;

/**
 *
 * @author Farzana
 */
public class RegularExpresion {
    public static void firstExp(String pattern, String String){    
        System.out.println("1>> "+pattern.matches(String));        
    }
    public static void createPatern(){
        // Create a pattern to be searched 
        Pattern pattern=Pattern.compile("far");
        // Search above pattern in "farzana" 
        Matcher matcher=pattern.matcher("farzana");
        while(matcher.find()){
                    System.out.println("patern found form  "+matcher.start()+" to "+(matcher.end()-1));        
                      System.out.println("........  "+matcher);        
        }
    }
    public static void createDomainPatern(){
      // Create a pattern to be searched 
        Pattern pattern=Pattern.compile("www.\\w.com");
        // Search above pattern in "farzana" 
        Matcher matcher=pattern.matcher("www.f.com");
         System.out.println("........  "+matcher);        
        while(matcher.find()){
                    System.out.println("patern found form  "+matcher.start()+" to "+(matcher.end()-1));        
                      System.out.println("........  "+matcher);        


        }
        
        
    }
    public  static void validationIP(){
        /*
        IP divided by 3 parts for java regex
        250-255
        200-249
        0-199
        ().().().()=each part (25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])
        */
            String pattern="(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])";
             Pattern p=Pattern.compile(pattern);
             Matcher m=p.matcher("000.12.12.034");
             while(m.find()){
                          System.out.println("IP :"+m);

             }
         
    
         /*
         000.12.12.034
        121.234.12.12
        23.45.12.56
        00.12.123.123123.123
        122.23
        Hello.IP
         */
    }
    
    public static void main(String args[]){
    
       // String pattern=pattern = "\\d";        
        firstExp("farzana","farzana");//return true
       // createPatern();
        createDomainPatern();
        validationIP();
        
        
    }
}
