/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101.coding.problems;

/**
 *
 * @author Farzana
 */
public class Longest_subString_inString {
         public static void main(String args[]){
		System.out.println("Longest Substring is " + getLongestSubstring("abbcccdf"));
	}
 
	public static String getLongestSubstring(String s) {
			int length = 1;
 
        String longestString = "";
 
        for (int i = 0; i < s.length(); i++) {
            StringBuilder str = new StringBuilder();
            str.append(s.charAt(i));
 
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    str.append(s.charAt(j));
                } else {
                    break;
                }
            }
            if (length < str.length()) {
                length = str.length();
                longestString = str.toString();
            }
 
        }
        return longestString;
	}
}