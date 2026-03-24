import interfaces.Article;
import interfaces.Panier;
import interfaces.Utilisateur;

public class Main {
    public static void main(String[] args) {

        Utilisateur utilisateur1=new Utilisateur("Umar");
        Utilisateur utilisateur2=new Utilisateur("Salim");
        Utilisateur utilisateur3=new Utilisateur("mar");
        Utilisateur utilisateur4=new Utilisateur("marY");
        int x =Utilisateur.getCompteurUtilisateur();
        System.out.println("nombre total de utilisateurs "+x);


    }
}