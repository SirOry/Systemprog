public class Praxis {
    private Behandlungsraum behandlungsräume[];

    public Praxis() {
        behandlungsräume = new Behandlungsraum[100];
        for (int i = 0; i < behandlungsräume.length; i++) {
            behandlungsräume[i] = new Behandlungsraum("");
        }
    }

    public void patientAufnehmen(Patient patient, int behandlungsraum) {
        behandlungsräume[behandlungsraum].vormerkenPatient(patient);
    }

    public void behandlungStarten(Patient patient, int behandlungsraum) {
        try {
            //synchronized (behandlungsräume[behandlungsraum])
            // {
                behandlungsräume[behandlungsraum].starteBehandlung(patient);
            //}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
