package exemple;

import java.awt.Font;

import bandeau.Bandeau;

public class EffetChangementPolice implements Effet{
    private String message;
    private String[] polices;

    public EffetChangementPolice(String m, String[] p){
        this.message = m;
        this.polices = p;
    }

    @Override
    public void appliquer(Bandeau bandeau){
        bandeau.setMessage(message);
        for (String police : polices){
            bandeau.setFont(new Font(police, Font.BOLD + Font.ITALIC, 60));
            bandeau.sleep(50);
        }
    }

}
