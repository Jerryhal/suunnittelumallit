/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht04;

import java.util.Observable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ClockTimer extends Observable implements Runnable{
    int hour = 0;
    int minute = 0;
    int second = 0;
    
    public void tick() {
        second++;
        
        if (second > 59) {
            minute++;
            second = 0;
            
            if (minute > 59) {
                hour++;
                minute = 0;
                
                if (hour > 23) {
                    hour = 0;
                } 
            } 
        }
    }
    
    @Override
    public void run() { 
        while (true) {
            tick();
            setChanged();
            notifyObservers();
            try {
                Thread.sleep(1000);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(ClockTimer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    
}
