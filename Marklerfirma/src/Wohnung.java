public class Wohnung {
    
    int _preis;
    int _quadratmeter;
    String _beschreibung;
    String _titel;

    public Wohnung(String titel, String beschreibung, int preis, int quadratmeter){
        setTitel(titel);
        setBeschreibung(beschreibung);
        setPreis(preis);
        setquadratmeter(quadratmeter);

    }

    public void setBeschreibung(String beschreibung) {
        this._beschreibung = beschreibung;
    }
    public void setTitel(String titel) {
        this._titel = titel;
    }
    public void setPreis(int preis) {
        this._preis = preis;
    }
    public void setquadratmeter(int quadratmeter) {
        this._quadratmeter = quadratmeter;
    }
    public String getbeschreibung() {
        return _beschreibung;
    }
    public int getpreis() {
        return _preis;
    }
    public int getQuadratmeter() {
        return _quadratmeter;
    }
    public String getTitel() {
        return _titel;
    }
}
