public class App {

    /* 
    Aufgabe 1:
    Bei der Objekt orientierten Programmierung erstellt man Klassen als Baupläne für Objekte. Diesen Objekten kann man verschiedene Werte zuweisen. 
    Sie können untereinander interagieren. In einer Klasse können verschiedene Variablen deklariert und initialisiert werden. Das heißt, dass man
    diese erstellt und ihnen verschiedene Werte zuweisen kann.
    In vershciedenen Methoden kann man verschiedene Szenarien erstellen und diese beim aufrufen über ein Objekt durchlaufen lassen. Im Konstruktor jeder Klasse kann
    man den Variablen konkrete Werte, welche ihrem Datentypen entsprechen, zuweisen. Man kann ihm ebenfalls Werte übergeben lassen, welche beim Erstellen eines Objektes 
    der jeweiligen Klasse eingetragen werden müssen.
    
    Die Klasse Haus und die Klasse Wohnung haben beide einen Preis als int, eine Quadratmeteranzahl als int, eine Beschreibung als String und einen Titel als String.
    Sie unterscheiden sich nur darin, dass es bei dem Haus auch noch eine Stockwerkanzahl als int gibt. Der Kunde und der Makler stimmen vollkommen überein, beide haben
    einen Vornamen als String und einen Nachnamen als String.
    int, auch Integer, ist ein elementarer Datentyp und beschreibt ganze Zahlen, auch kann man mit ihnen rechnen.
    String ist kein elementarer Datentyp, sondern selber eine Klasse und beschreibt eine Zeichenkette.
    boolean kann nur true oder false sein.

    Es müssen die Klassen Haus, Wohnung, Makler, Kunde und Verkauf erstellt werden. Im Verkauf sind alle anderen Klassen implementiert und in App wird mit allen Klassen agiert.

    Aufgabe 4.2:
    Es wird eine Variable vom Datentyp boolean benötigt, welche true ist sobald reserviert wurde und falls falls keine reservierung vorliegt. Dann muss in einer if-Abfrage geschaut
    werden, ob diese Variable true ist, falls dem so ist  kann das Haus nichtmehr verkauft werden. Im Kunden muss auch ein boolean hinzugefügt werden. AUßerdem braucht man einen Zählinteger,
    welcher hochgeht und bestimmt, wieviele Reservierungen vorliegen.
    */
    static Haus[] _haus;
    static Wohnung[] _wohnung;
    static Makler[] _makler;
    static Kunde[] _kunde;
    static Verkauf[] _verkauf;
    static boolean reserviert = false;


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        _makler = new Makler[5];
        _makler[0] = new Makler("Hans", "Schmidt");

        _kunde = new Kunde[10];
        _kunde[0] = new Kunde("Rainer", "Dietrichsen", false);
        _kunde[1] = new Kunde("Herbert", "Müller", true);
        
        _haus = new Haus[10];
        _haus[0] = new Haus("Haus 1", "Geile Butze", 120000, 2000, 3);

        _wohnung = new Wohnung[10];
        _wohnung[0] = new Wohnung("Wohnung 1 ", "Fast geile Butze", 900000, 1200);

        _verkauf = new Verkauf[5];
        _verkauf[0] = new Verkauf(_makler[0], _kunde[1], _haus[0], _wohnung[0]);

        System.out.println(_verkauf[0].getMakler().getVorname() + " " + _verkauf[0].getMakler().getNachname() + " " + _verkauf[0].getKunde().getVorname() + " " + _verkauf[0].getKunde().getNachname() + " " + _verkauf[0].getHaus().getTitel() + " " + _verkauf[0].getHaus().getBeschreibung() + " " + _verkauf[0].getHaus().getPreis() + " " + _verkauf[0].getHaus().getQuadratmeter() + " " + _verkauf[0].getHaus().getStockwerke() + " " + _verkauf[0].getWohnung().getbeschreibung()+ " " + _verkauf[0].getWohnung().getTitel()+ " " + _verkauf[0].getWohnung().getpreis()+ " " + _verkauf[0].getWohnung().getQuadratmeter());
        
    }
    // Lösungsansatz für 4.2, es fählt noch ein Zählinteger
    //    for (Kunde reserviert : getAllKunden()){
    //         if (reserviert == true){
    //             System.out.println("Dieses Haus ist reserviert!");
    //         }
    //         else if (reserviert == false){
    //             System.out.println("Dieses Haus ist nicht reserviert");
    //         }
    //     }
    // }

    public static Kunde[] getAllKunden() {
        return _kunde;
    }

}
