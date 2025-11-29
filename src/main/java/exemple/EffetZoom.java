package exemple;

import java.awt.Font;

import bandeau.Bandeau;

public class EffetZoom implements Effet {
private String message;

public EffetZoom(String m){
    this.message = m;
}

    @Override
public void appliquer(Bandeau bandeau){
     bandeau.setMessage(message);
     for (int i = 5; i < 60; i += 5) {
            bandeau.setFont(new Font("Futura", Font.BOLD + Font.ITALIC, i));
            bandeau.sleep(225);
        }
}
}
