package ohtu;

import javax.swing.JTextField;

public class Summa extends Tulostaja{

    public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
    }

    @Override
    public void suorita() {
        int luku = haeSyote();
        edellinen(luku);
        sovellus.plus(luku);
        tulosta(sovellus.tulos());
    }

    @Override
    public void peru() {
        sovellus.miinus(edellinen);
        tulosta(sovellus.tulos());
    }

}
