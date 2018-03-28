
package teht04;

public class Teht04 {

    public static void main(String[] args) {
        ClockTimer ct = new ClockTimer();
        DigitalClock dc = new DigitalClock();
        ct.addObserver(dc);
        new Thread(ct).start();
    }
}
