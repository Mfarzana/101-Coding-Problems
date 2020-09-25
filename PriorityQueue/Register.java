import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
   // Register register=new Register();

    String line;
    while ((line = in.readLine()) != null) {
      String arr=line.split(";");
      double PP=Double.parseDouble(arr[0]);
      double CH=Double.parseDouble(arr[1]);
      if(CH<PP){
              System.out.println("ERROR");
      }
      else if(CH==PP){
              System.out.println("0");
      }
      else{
          double cashback=CH-PP;    
            List<Register> cashbackList=Register.getcashbackList();
           String output=getCashBackCustomer(cashback,cashbackList);
           System.out.println(output);

      }
      
    }// while close
  }// main clos
  
  // Register class 
  
  static class  Register {
    private static  String bills;
    private static double coins;

    public  Register(String bills, double coins) {
        this.bills = bills;
        this.coins = coins;
    }

     public static String getBills() {
            return bills;
        }

        public static void setBills(String bills) {
            Register.bills = bills;
        }

        public static double getCoins() {
            return coins;
        }

        public static void setCoins(double coins) {
            Register.coins = coins;
        }

    public static String getCashBackCustomer(double cashback,List<Register> cashbackList){
       double k = cashback; 
        String finalString ="";           
        for (int i = 0; i < cashbackList.size(); i++) {               
            double sum = 0; 
            String s=cashbackList.get(i).getBills();
            for (int j = i; j <  cashbackList.size(); j++) {                   
                sum = sum+cashbackList.get(j).getCoins();               
                if (sum == k) 
                    s=s+","+cashbackList.get(j).getBills();
            }
            finalString=s;
        } 
    
      return finalString;
    }
    
   public static List<Register> getcashbackList(){
        List <Register> registerList=new ArrayList<Register>();
            registerList.add(new Register("PENNY",0.01));
            registerList.add(new Register("NICKEL",.05));
            registerList.add(new Register("DIME",.10));
            registerList.add(new Register("QUARTER",.25));
            registerList.add(new Register("HALF DOLLAR",.50));
            registerList.add(new Register("ONE",1.00));
            registerList.add(new Register("TWO",2.00));
            registerList.add(new Register("FIVE",5.00));
            registerList.add(new Register("TEN", 10.00));
            registerList.add(new Register("TWENTY",20.00));
            registerList.add(new Register("FIFTY",50.00));
            registerList.add(new Register("ONE HUNDRED",100.00));
           
            return registerList;
        }
}// register class close

}// main class close

