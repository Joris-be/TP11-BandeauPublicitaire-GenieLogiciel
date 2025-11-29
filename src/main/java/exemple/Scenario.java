package exemple;

import java.util.ArrayList;

import bandeau.Bandeau;

public class Scenario {
private ArrayList<Action> actions = new ArrayList<>();

public void ajouterEffet(Effet effet , int repetitions ){
    actions.add(new Action (effet,repetitions));
}

public void jouer(Bandeau bandeau) {
        for (Action action : actions) {
            for (int i = 0; i < action.getNbRepetitions(); i++) {
                action.getEffet().appliquer(bandeau);
            }
}
}
}
