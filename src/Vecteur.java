import javax.swing.plaf.PanelUI;

public class Vecteur {
    private int[] tableau;
    private int nbElement;
    private static final int RATION_AGRANDISSEMENT = 2;
    private static final int TAILLE_INITIALE = 5;

    public Vecteur() {
        this(TAILLE_INITIALE);
    }

    public Vecteur(int taille_initiale) {
        tableau = new int[taille_initiale];
        nbElement = 0;
    }

    public void ajoute(int element) {
        if (nbElement <= tableau.length) {
            resize();
            tableau[nbElement++] = element;
        }
    }

    public boolean ajoute(int element, int index) {
        if (nbElement <= tableau.length) {
            resize();
        }
        for (int i = nbElement; i > index; i--) {
            tableau[i] = tableau[i - 1];
        }
        tableau[index] = element;
        nbElement++;
        return false;
    }


    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < nbElement; i++) {
            str += tableau[i] + " , ";
        }
        return str + "]";
    }
    public int getNbElement() {
        return nbElement;
    }

    public int getElementAt(int index) {
        return tableau[index];
    }

    public boolean estVide() {
        return nbElement == 0;
    }

    private void resize() {
        int[] nouveau = new int[RATION_AGRANDISSEMENT * tableau.length];
        for (int i = 0; i < nbElement; i++) {
            nouveau[i] = tableau[i];
        }
        tableau = nouveau;
    }

}
