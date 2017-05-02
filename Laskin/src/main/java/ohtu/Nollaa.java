package ohtu;

import javax.swing.JTextField;

public class Nollaa extends Tulostaja {

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
    }

    @Override
    public void suorita() {
        edellinen(sovellus.tulos());
        sovellus.nollaa();
        tulosta(sovellus.tulos());
    }

    @Override
    public void peru() {
        sovellus.plus(edellinen);
        tulosta(sovellus.tulos());
    }

}
