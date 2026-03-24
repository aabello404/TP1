package interfaces;

public class Utilisateur {
    private String nom;
    private static  int compteurUtilisateur=0;

    public Utilisateur(String nom) {
        compteurUtilisateur++;
        this.nom = nom;
    }

    public static int getCompteurUtilisateur() {
        return compteurUtilisateur;
    }

}
