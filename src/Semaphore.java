public class Semaphore {
    private int wert;
    public Semaphore(int anfangsWert) {
        if (anfangsWert<0) wert = 0;
        else wert = anfangsWert;
    }
    public void p() {
        p(1);
    }
    public synchronized void p(int x) {
        if (x<=0) return;
        while (wert-x<0) {
            try {
                wait();
            }
            catch(InterruptedException e) {}
        }
        wert -= x;
    }
    public void v() {
        v(1);
    }
    public synchronized void v(int x) {
        if (x<=0) return;
        wert += x;
        notifyAll();
    }
}
