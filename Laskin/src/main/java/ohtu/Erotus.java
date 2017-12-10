package ohtu;
import javax.swing.JTextField;

public class Erotus extends Komento {
    
     public Erotus(Sovelluslogiikka sovellus, JTextField syotekentta, JTextField tuloskentta) {
        super(sovellus, syotekentta, tuloskentta);
    }
     
    @Override
    public void suorita() {
        try {
            arvo = Integer.parseInt(syotekentta.getText());
        } catch (Exception e) {
        }
        sovellus.miinus(arvo);
        paivitaKentat();
    }
    
    @Override
    public void peru() {
        sovellus.plus(arvo);
        paivitaKentat();
    }
   
}