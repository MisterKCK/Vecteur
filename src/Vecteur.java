public class Vecteur {
    private int[] tableau;
    private int nbElement;
    public int RATION_AGRANDISSEMENT = 2;
    public int TAILLE_INITIALE = 5;

    public Vecteur() {
        tableau = new int[TAILLE_INITIALE];
        nbElement = 0;
    }
    public int getNbElement() {
        return nbElement;
    }
    public void ajoute(int element) {
        if (nbElement <= tableau.length) {
            resize();
            tableau[nbElement++] = element;
        }
    }
    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < nbElement; i++) {
            str += tableau[i] + " , ";
        }
        return str + "]";
    }

    private void resize() {
        int[] nouveau = new int[RATION_AGRANDISSEMENT * tableau.length];
        for (int i = 0; i < nbElement; i++) {
            nouveau[i] = tableau[i];
        }
        tableau = nouveau;
    }

}
