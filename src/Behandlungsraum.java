import java.util.Random;

public class Behandlungsraum {

    private String name;

    public Behandlungsraum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void vormerkenPatient(Patient patient) {
        System.out.println("Patient " + patient.getName() + " wartet auf Behandlung in " + this.getName());
        patient.setAufnahmezeitpunkt(System.currentTimeMillis());
    }

    public synchronized void starteBehandlung(Patient patient) throws InterruptedException {
        patient.setBehandlungsstart(System.currentTimeMillis());
        System.out.println("Patient " + patient.getName() + " Behandlung wird gestartet in Zimmer: "
                           + patient.getBehandlungsraum());
        System.out.println("Patient " + patient.getName() + " Wartezeit: " + patient.getWartezeit());
        Thread.sleep(patient.getBehandlungsdauer()*1000);
    }
}
