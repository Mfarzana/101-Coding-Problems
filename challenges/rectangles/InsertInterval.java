/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.challenges.rectangles;

import java.util.ArrayList;

/**
 *
 * @author Farzana
 */
public class InsertInterval {
    
public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> margeList=new ArrayList<>();
        
        for(int[] interval:intervals){
            if(interval[1]<newInterval[0]){
                margeList.add(interval);
            }
            else if(interval[0]>newInterval[1]){
                  // ## this code output: [[1,5],[6,9]]
                margeList.add(newInterval);
                newInterval=interval;             
                                
                /*
                ## for this code output like:[[6,9],[1,5]]
                margeList.add(interval);
                newInterval=interval;
                */
            }else{
                newInterval[0]=Math.min(interval[0],newInterval[0]);
                newInterval[1]=Math.max(interval[1],newInterval[1]);
                
                System.out.print(" "+Arrays.toString(newInterval));
            }
        }
        margeList.add(newInterval);
        return margeList.toArray(new int[margeList.size()][2]);
        
    }
}
