public class Main {
    public static void main(String[] args) {
        System.out.println("test 1: Création d'un vecteur vide");
        Vecteur data = new Vecteur();
        System.out.println(data);
        System.out.println("nbElement: " + data.getNbElement());
        System.out.println("estVide:" + data.estVide());

        System.out.println("test 2: Ajoute d'éléments à la fin du vecteur");
        data.ajoute(0);
        data.ajoute(10);
        data.ajoute(20);
        System.out.println(data);
        System.out.println("nbElement: " + data.getNbElement());
        System.out.println("estVide:" + data.estVide());

        System.out.println("test 3: Ajouts d'élément jusqu'a ce que la capacité du vecteur augmente");
        data.ajoute(30);
        data.ajoute(60);
        data.ajoute(90);
        System.out.println(data);

        System.out.println("test 4: vérifier l'état du vecteur");
        System.out.println("idx0 : " + data.getElementAt(0));
        System.out.println("idx3 : " + data.getElementAt(3));
        System.out.println("idx5 : " + data.getElementAt(5));
        System.out.println(data);
        System.out.println("nbElement: " + data.getNbElement());
        System.out.println("estVide:" + data.estVide());

        System.out.println("test 5: Ajouts d'éléments à des positions spécifiques");
        //data.ajoute(-10,0);
        data.ajoute(25, 3);
        //data.ajoute(60, 7);
        System.out.println(data);
        System.out.println("nbElement: " + data.getNbElement());
        System.out.println("estVide:" + data.estVide());

    }
}
