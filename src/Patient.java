public class Patient {

    private String name;
    private long behandlungsraum;
    private long behandlungsdauer;
    private long aufnahmezeitpunkt;
    private long behandlungsstart;


    public Patient() {

    }

    public Patient(long behandlungsraum, long behandlungsdauer) {
        this.behandlungsraum = behandlungsraum;
        this.behandlungsdauer = behandlungsdauer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBehandlungsraum() {
        return behandlungsraum;
    }

    public void setBehandlungsraum(long behandlungsraum) {
        this.behandlungsraum = behandlungsraum;
    }

    public long getBehandlungsdauer() {
        return behandlungsdauer;
    }

    public void setBehandlungsdauer(long behandlungsdauer) {
        this.behandlungsdauer = behandlungsdauer;
    }

    public long getAufnahmezeitpunkt() {
        return aufnahmezeitpunkt;
    }

    public void setAufnahmezeitpunkt(long aufnahmezeitpunkt) {
        this.aufnahmezeitpunkt = aufnahmezeitpunkt;
    }

    public long getBehandlungsstart() {
        return behandlungsstart;
    }

    public void setBehandlungsstart(long behandlungsstart) {
        this.behandlungsstart = behandlungsstart;
    }

    public long getWartezeit(){
        return (behandlungsstart - aufnahmezeitpunkt) / 1000;
    }
}
