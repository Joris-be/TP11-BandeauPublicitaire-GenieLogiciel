package exemple;


public class Action {
private Effet effet;
private int nbRepetitions;

public Action(Effet effet, int repet){
    this.effet = effet;
    this.nbRepetitions = repet;
}

public Effet getEffet() {
    return effet;
}

public int getNbRepetitions() {
    return nbRepetitions;
}

}
