package exemple;

import java.awt.Font;

import bandeau.Bandeau;

public class MainScenario {
public static void main(String[] args) {
    Bandeau bandeau = new Bandeau();
    Scenario scenario = new Scenario();
    String[] polices = {
    "SansSerif", 
    "Monospaced", 
    "Serif", 
    "Dialog", 
    "Arial",
    "Arial Black",
    "Verdana",
    "Tahoma",
    "Trebuchet MS",
    "Courier New",
    "Georgia",
    "Impact",
    "Comic Sans MS",
    "Lucida Console",
    "Lucida Sans",
    "Palatino Linotype",
    "Book Antiqua",
    "Times New Roman",
    "Century Gothic",
    "Franklin Gothic Medium",
    "Garamond",
    "Calibri",
    "Futura"};

    scenario.ajouterEffet(new EffetZoom("They tryna find 2Pac"), 1);
    scenario.ajouterEffet(new EffetClignotant("Don't let 'em find 2Pac"), 2);
    scenario.ajouterEffet(new EffetClignotant("He evade the press"), 2);
    scenario.ajouterEffet(new EffetRotation("He escape the stress"), 2);
    scenario.ajouterEffet(new EffetChangementPolice("La, da da da da", polices),2);

    bandeau.setFont(new Font("Futura", Font.BOLD + Font.ITALIC, 60));
    bandeau.setMessage("futura free");
    bandeau.sleep(3000);
    scenario.jouer(bandeau);
    bandeau.setMessage("blond");
    bandeau.sleep(3000);
    bandeau.close();
}
}
