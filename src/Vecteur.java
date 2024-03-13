public class Vecteur {
    private int[] Tableau;
    private  int NbElement;
    public int RATION_AGRANDISSEMENT = 2;
    public int TAILLE_INITIALE = 5;

    public Vecteur() {
        Tableau = new int[TAILLE_INITIALE];
        NbElement = 0;
    }

}
