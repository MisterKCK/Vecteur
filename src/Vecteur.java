public class Vecteur {
    private int[] tableau;
    private  int nbElement;
    public int RATION_AGRANDISSEMENT = 2;
    public int TAILLE_INITIALE = 0;

    public Vecteur(int taille_initiale) {
        tableau = new int[taille_initiale];
        nbElement = 0;
    }
    public void ajoute(int element) {
        if (nbElement >= tableau.length) {
            resize();
            tableau[TAILLE_INITIALE++] = element;
        }
    }

    private void resize() {
        int[] nouveau = new int[RATION_AGRANDISSEMENT * tableau.length];
        for (int i = 0; i < nbElement; i++) {
            nouveau[i] = tableau[i];
        }
        tableau = nouveau;
    }

}
