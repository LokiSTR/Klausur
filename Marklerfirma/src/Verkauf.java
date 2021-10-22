public class Verkauf {
    Makler _makler;
    Kunde _kunde;
    Haus _haus;
    Wohnung _wohnung;


    public Makler getMakler() {
        return _makler;
    }
    public Kunde getKunde() {
        return _kunde;
    }
    public Haus getHaus() {
        return _haus;
    }
    public Wohnung getWohnung() {
        return _wohnung;
    }
    public void setMakler(Makler makler) {
        this._makler = makler;
    }
    public void setKunde(Kunde kunde) {
        this._kunde = kunde;
    }
    public void setHaus(Haus _haus) {
        this._haus = _haus;
    }
    public void setWohnung(Wohnung _wohnung) {
        this._wohnung = _wohnung;
    }

    public Verkauf(Makler makler, Kunde kunde, Haus haus, Wohnung wohnung){
        setMakler(makler);
        setKunde(kunde);
        setHaus(haus);
        setWohnung(wohnung);
    }
}
