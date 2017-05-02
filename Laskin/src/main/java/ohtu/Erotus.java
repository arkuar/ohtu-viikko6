package ohtu;

import javax.swing.JTextField;

public class Erotus extends Tulostaja {

    public Erotus(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
    }

    @Override
    public void suorita() {
        int luku = haeSyote();
        edellinen(luku);
        sovellus.miinus(luku);
        tulosta(sovellus.tulos());
    }

    @Override
    public void peru() {
        sovellus.plus(edellinen);
        tulosta(sovellus.tulos());
    }

}
