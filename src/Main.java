import java.text.ParseException;

public class Main {

    public static void main(String[] args) {
        /*Semaphore semaphore = new Semaphore(1);
        Praxis praxis = new Praxis();

        Patient patient1 = new Patient();
        Patient patient2 = new Patient();

        patient1.setName("Mario");
        Semaphore semaphore2 = new Semaphore(1);

        PatientenThread patientenThread1 = new PatientenThread("tHREADaMK1" , praxis,patient1);
        PatientenThread patientenThread2 = new PatientenThread("tHREADaMK2" , praxis,patient2);

        patientenThread1.start();
        patientenThread2.start();*/
        Main m = new Main();
        m.test();

    }

    public void test() {
        Praxis p = new Praxis();
        Patient p1 = new Patient(1,5);
        p1.setName("Mario");
        Patient p2 = new Patient(2,2);
        p2.setName("Bart");
        Patient p3 = new Patient(1,5);
        p3.setName("Brigitte");
        Patient p4 = new Patient(2,2);
        p4.setName("Gundula");
        Patient p5 = new Patient(1,2);
        p5.setName("Lann Hornscheid");

        PatientenThread t1 = new PatientenThread("T1", p, p1);
        PatientenThread t2 = new PatientenThread("T2", p, p2);
        PatientenThread t3 = new PatientenThread("T3", p, p3);
        PatientenThread t4 = new PatientenThread("T4", p, p4);
        PatientenThread t5 = new PatientenThread("T5", p, p5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
