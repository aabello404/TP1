
public class Main {
    public static void main(String[] args) {

        Article A1 = new Article("Iphone xr",450.0);
        Article A2 = new Article("Iphone 12",500);
        Article A3 = new Article("HP x360",1000);
        Panier cart =new Panier();
        cart.ajouterArticle(A1);
        cart.ajouterArticle(A2);
        cart.ajouterArticle(A3);

        System.out.println("====== info du Panier ======");

        cart.afficherPanier();

       double v= cart.calculerTotal();
        System.out.println("prix total de tout article de ce panier= "+ v);


    }
}
/**
Voiture voiture1= new Voiture("Peugeot","208",2021);
        Voiture voiture2= new Voiture("Volswagen","Golf",2019);
        voiture1.afficherDetails();
        voiture2.setAnnee(2020);
        System.out.println(voiture2.getMarque());
        voiture2.afficherDetails();
 **/