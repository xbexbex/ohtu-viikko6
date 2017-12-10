package main.java.ohtu;

import javax.swing.JTextField;

public class Nollaus extends Komento {
    private int vanha;
    
     public Nollaus(Sovelluslogiikka sovellus, JTextField syotekentta, JTextField tuloskentta) {
        super(sovellus, syotekentta, tuloskentta);
    }
     
    @Override
    public void suorita() {
        vanha = sovellus.tulos();
        sovellus.nollaa();
        paivitaKentat();
    }
    
    @Override
    public void peru() {
        sovellus.plus(vanha);
        paivitaKentat();
    }
    
}