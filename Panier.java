public class Panier {
    private Article [] article;
    private int nombreArticles;

    public Panier(){
        this.article=new Article[5];
        this.nombreArticles=0;
    }
    public void ajouterArticle(Article art)
    {
        if(this.nombreArticles<5)
        {
            this.article[nombreArticles++]=art;
            return;
        }
        System.out.println("Le panier est plien");
    }
    public double calculerTotal()
    {
        double somme= 0.0;
        for (int i=0 ; i<this.nombreArticles; i++)
        {
            somme+=this.article[i].getPrix();

        }
        return somme;

    }
    public  void afficherPanier()
    {
        for (int i=0 ; i<this.nombreArticles; i++)
        {
            this.article[i].tostring();

        }
    }
}
