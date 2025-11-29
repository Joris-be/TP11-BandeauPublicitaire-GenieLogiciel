package exemple;

import bandeau.Bandeau;
import java.awt.Color;


public class EffetClignotant implements Effet {
private String message;

public EffetClignotant(String m){
    this.message = m;
}

    @Override
    public void appliquer(Bandeau bandeau){
         bandeau.setMessage(message);
    Color texte = bandeau.getForeground();
    Color background = bandeau.getBackground();
    for (int i = 0; i < 10; i++){
        bandeau.setForeground(background);
        bandeau.sleep(75);
        bandeau.setForeground(texte);
        bandeau.sleep(75);
    }
}
}
