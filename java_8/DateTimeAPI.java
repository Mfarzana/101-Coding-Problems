/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_problems.java_8;

import java.time.LocalDateTime;

/**
 *
 * @author Farzana
 */
public class DateTimeAPI {
    public static void main(String args[]){
        LocalDateTime currentTime=LocalDateTime.now();
        System.out.println("current time "+currentTime+" year "+currentTime.getDayOfYear()+" month "+currentTime.getMonth()+" date "+currentTime.getDayOfMonth());
    
        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
      System.out.println("date2: " + date2);
    }
}
