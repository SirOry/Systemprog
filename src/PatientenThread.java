public class PatientenThread extends Thread {
    private Praxis praxis;
    private Patient patient;

    public PatientenThread(String name, Praxis praxis, Patient patient) {
        super(name);
        this.praxis = praxis;
        this.patient = patient;
    }

    public void run() {
        praxis.patientAufnehmen(patient, (int) patient.getBehandlungsraum());
        praxis.behandlungStarten(patient, (int) patient.getBehandlungsraum());
    }
}
