public class Makler {
    String _vorname;
    String _nachname;

    public Makler(String vorname, String nachname){
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
