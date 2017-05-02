/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author Arttu
 */
public abstract class Tulostaja implements Komento {

    Sovelluslogiikka sovellus;
    JTextField tuloskentta;
    JTextField syotekentta;
    int edellinen;

    public Tulostaja(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    int haeSyote() {
        int syote = 0;
        try {
            syote = Integer.parseInt(syotekentta.getText());
        } catch (Exception e) {
        }
        
        return syote;
    }
    
    void tulosta(int tulos){
        syotekentta.setText("");
        tuloskentta.setText("" + tulos);
    }
    
    void edellinen(int luku){
        this.edellinen = luku;
    }
    
    @Override
    public void peru(){
        tulosta(edellinen);
    }
}
