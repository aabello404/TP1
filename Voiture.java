public class Voiture {
    private int annee;
    private String modele;
    private String marque;

    public Voiture(String mar, String mod, int an)
    {
        this.modele=mod;
        this.marque=mar;
        this.annee=an;

    }
    public  void afficherDetails()
    {
        System.out.println("Voiture: "+ this.marque +" "+this.modele + " Annee: " + this.annee);
    }
    public String getMarque(){
        return this.marque;
    }
    public String  getModele(){
        return this.modele;
    }
    public int getAnnee(){
        return this.annee;
    }
    public void setAnnee(final int newwannee)
    {
        this.annee=newwannee;
    }

    public void setMarque(final String mrq) {
        this.marque = mrq;
    }

    public void setModele(final String mdl) {
        this.modele = mdl;
    }
}
