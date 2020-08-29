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
public class StringProblems {
    public String getPalndromeString(String testString){
        char ch[]=testString.toCharArray();
        int temp=ch.length-1;                           
        for(int i=0;i<ch.length;i++){  
            if(ch[i]!=ch[temp]) return " not palindrome string";
            temp--;          
        }
        return " palindrome string";
    }
    
    public String getSubString(String s){
     return s.substring(0,5);
    }
    
    //How many subtrings are there
    public int getMultipleSubstring(String string1, String substring){
        int result=0;
        char ch1[]=string1.toCharArray();
        char ch2[]=substring.toCharArray();
        
        for(int i=0;i<=ch1.length-ch2.length;i++){
            int k=0;
            int count=0;
            for(int j=i;k<ch2.length;j++){
                if(ch1[j]==ch2[k]) count++;                
                if(count==ch2.length) result++;     
                k++;
            }
        }
        if(result>0) return result;
       return 0;
    }
    
    public String getSubstrings(String string1, String substring){
        boolean result=false;
        char ch1[]=string1.toCharArray();
        char ch2[]=substring.toCharArray();
        
        for(int i=0;i<=ch1.length-ch2.length;i++){
            int k=0;
            int count=0;
            for(int j=i;k<ch2.length;j++){
                if(ch1[j]==ch2[k]) count++;                
                if(count==ch2.length) return " substring ";     
                k++;
            }
        }
       return "not substring";
    }
    
    /* 
    Input  : str = "helloABworld"
    Output : str = "helloCworld"

    Input  : str = "fghABsdfABysu"
    Output : str = "fghCsdfCysu"
    */
    public String getReplaceString(String string1,String replaceString){
        
        String string2="";
        char ch[]=string1.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='B' && ch[i-1]=='A'){
                ch[i-1]='C';
                for(int j=i;j<ch.length-1;j++){
                    ch[j]=ch[j+1];
                }
                ch[ch.length-1]=' ';
            }
        }
        
        return String.copyValueOf(ch);
    
    }
    /* 
    Original string: The quick brown fox jumps over the lazy dog.                                                 
    New String: The quick brown cat jumps over the lazy dog.  
    */
    public String getReplaceString2(String string1,String replaceString){
        
        char ch[]=string1.toCharArray();
        char ch2[] = new char[string1.length()+replaceString.length()];
        int k=0;
        for(int i=0;i<ch.length;i++){            
            if(ch[i]=='f' && ch[i+1]=='o' && ch[i+2]=='x'){
                i+=2;
                for(int j=0;j<replaceString.length();j++){
                     ch2[k]=replaceString.charAt(j);
                     k++; 
                }                
                ch2[k]=' ';               
            }
            else {
                ch2[k]=ch[i];
                k++;
            }
        }
        
        return String.copyValueOf(ch2);
    
    }

    //another solution 
    public String longestPalindrome(String s) {
        if (s.isEmpty()) {
           return null;
        } 
        if (s.length() == 1) {
           return s;
        } 
        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
           // get longest palindrome with center of i
           String tmp = helper(s, i, i);
           if (tmp.length() > longest.length()) {
              longest = tmp;
           }
           // get longest palindrome with center of i, i+1
           tmp = helper(s, i, i + 1);
           if (tmp.length() > longest.length()) {
              longest = tmp;
           }
        } 
        return longest;
     }
     // Given a center, either one letter or two letter, 
     // Find longest palindrome
     public String helper(String s, int begin, int end) {
        while (begin >= 0 && end <= s.length() 
                       - 1 && s.charAt(begin) == 
                        s.charAt(end)) {
           begin--;
           end++;
        }
        return s.substring(begin + 1, end);
     }

   //Java String Exercises: Find the second most frequent character in a given string
    //successes // first most sequence is 's' and second most is 'c'
    public char getSecondMostFreqChar(String s){
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
        
        
       // System.out.print("xx "+ch[step]);
    
        return ch[step];
    }
    
}
