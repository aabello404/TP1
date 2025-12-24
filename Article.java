public class Article {
    private String nom;
    private double prix;
    public Article(String name, double price)
    {
        this.nom=name;
        this.prix=price;
    }
    public void tostring(){
        System.out.println("Article: " +this.nom +" Prix: "+ this.prix);
    }

    public double getPrix() {
        return this.prix;
    }

}
