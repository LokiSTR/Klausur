public class Haus {
    
    int _preis;
    int _stockwerke;
    int _quadratmeter;
    String _beschreibung;
    String _titel;

    public Haus(String titel, String beschreibung, int preis, int quadratmeter, int stockwerke){
        setTitel(titel);
        setBeschreibung(beschreibung);
        setPreis(preis);
        setQuadratmeter(quadratmeter);
        setStockwerke(stockwerke);

    }
    public void setTitel(String titel) {
        this._titel = titel;
    }
    public void setBeschreibung(String beschreibung) {
        this._beschreibung = beschreibung;
    }
    public void setQuadratmeter(int quadratmeter) {
        this._quadratmeter = quadratmeter;
    }
    public void setStockwerke(int stockwerke) {
        this._stockwerke = stockwerke;
    }
    public void setPreis(int preis) {
        this._preis = preis;
    }
    public String getTitel() {
        return _titel;
    }
    public String getBeschreibung() {
        return _beschreibung;
    }
    public int getQuadratmeter() {
        return _quadratmeter;
    }
    public int getStockwerke() {
        return _stockwerke;
    }
    public int getPreis() {
        return _preis;
    }
}
