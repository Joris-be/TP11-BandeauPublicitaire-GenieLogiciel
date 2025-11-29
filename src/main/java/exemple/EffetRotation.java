package exemple;

import bandeau.Bandeau;

public class EffetRotation implements Effet{
 private String message;

public EffetRotation(String m){
    this.message = m;
}
 
    @Override
 public void appliquer(Bandeau bandeau){
     bandeau.setMessage(message);
    for (int i = 0; i < 360; i += 10) {
            bandeau.setRotation(Math.toRadians(i));
            bandeau.sleep(50);
        }
        bandeau.setRotation(0);
    }
}
