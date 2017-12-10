package main.java.ohtu;

import javax.swing.JTextField;

public abstract class Komento {
    protected Sovelluslogiikka sovellus;
    protected JTextField syotekentta;
    protected JTextField tuloskentta;
    protected int arvo;
    
    public Komento(Sovelluslogiikka sovellus, JTextField syotekentta, JTextField tuloskentta) {
        this.sovellus = sovellus;
        this.syotekentta = syotekentta;
        this.tuloskentta = tuloskentta;
    }
    
    public abstract void suorita();
    public abstract void peru();
    protected void paivitaKentat() {
        syotekentta.setText("");
        tuloskentta.setText("" + sovellus.tulos());
    }
    
}