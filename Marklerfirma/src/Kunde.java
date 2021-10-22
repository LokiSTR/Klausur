public class Kunde {
    String _vorname;
    String _nachname;
    boolean reserviert = false;

    public Kunde(String vorname, String nachname, boolean reserviert){
        setVorname(vorname);
        setNachname(nachname);
        
    }

    public void setVorname(String vorname) {
        this._vorname = vorname;
    }
    public void setNachname(String nachname) {
        this._nachname = nachname;
    }
    public String getVorname() {
        return _vorname;
    }
    public String getNachname() {
        return _nachname;
    }
}
