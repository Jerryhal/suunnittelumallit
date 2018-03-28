/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht04;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author User
 */
public class DigitalClock implements Observer {
    
    @Override
    public void update(Observable o, Object o1) {
        ClockTimer ct = (ClockTimer)o;
        System.out.println("Kello on: " + String.format("%02d",ct.getHour()) + ":" + String.format("%02d", ct.getMinute()) + ":" + String.format("%02d", ct.getSecond()));
    }
}
