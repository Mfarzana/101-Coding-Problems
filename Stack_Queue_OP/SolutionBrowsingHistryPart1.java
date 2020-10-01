/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_Queue_OP;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Farzana
 */
public class SolutionBrowsingHistryPart1 {
  private static Stack<String> history=new Stack<>();

public static Boolean isBrowsingHistoryEmpty(){
    return history.isEmpty();
}

public static String mostRecentlyVisitedSite(){
    return history.peek();  
}

public static void addSiteToHistory(String url){
    history.add(url);
}
public static void goBackInTime(int n){
    
    if(!isBrowsingHistoryEmpty()) {//Method to traverse back in browsing history by n times such that 1<=n<=m where m is the number of urls stored in history
            while(n>0) {
                history.pop();
                n--;
            }
        }
    history.pop();
}
public static void printBrowsingHistory(){
    if(history.isEmpty()){
        System.out.println("No Browsing history");
    }else System.out.println(history);
}
// user inputs 


public static void main(String ars[]){
    choiceMenu();

}
public static void choiceMenu(){
    Scanner input=new Scanner(System.in);
    while(true){
            System.out.println( " Like to visit a website 1");
            System.out.println( " Check if browsing history is empty 2 ");
            System.out.println( " Print recently visited website 3");
            System.out.println( " Select choice to traverse back the browsing history by 'n' times 4 ");
            System.out.println( " Print Browsing History 5");
            System.out.println( " Exit 6");
            System.out.println("\n Enter your choice");
            
            try{
               Integer i=input.nextInt();
               choiceMenuVisit(i);
            }catch (Exception e){
                System.out.println(" e "+e);
            }
            
    }
}      
    public static Boolean choiceMenuVisit(Integer choice){
        Scanner input=new Scanner(System.in);
        switch(choice){
            case 1: 
                System.out.println("Enter the url of the website you wish to visit");
                String url=input.next();
                addSiteToHistory(url);
                return true;
            case 2:
                    System.out.println(isBrowsingHistoryEmpty());
                return true;
            case 3:
                                   System.out.println(mostRecentlyVisitedSite());

                return true;
            case 4:
                int m=history.size();//Informs user to enter n such that n is a valid choice
                    System.out.println("\n Enter the value for 'n' such that 1<= n <= "+m);
                    int n=input.nextInt();
                    goBackInTime(n);
                    return true;     
            case 5: 
                printBrowsingHistory();
                return true;
            case 6 : return false;
            default: 
                    System.out.println("Wrong choice. Try again");
        }
        System.out.println("\n Enter your choice");
            choice = Integer.parseInt(input.next());
         
            
            return false;
    }
    
    
    }       