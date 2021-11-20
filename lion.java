

public class lion extends predateur
{
     public lion (String nom)
    {
        this.nom = nom;
        this.espece = "Lion";
        this.cri = "Rugissement";
    }




    public String chasser()    {
        return "J'aime chasser tout ce qui bouge tant que c'est de la viande fraiche";
    }

    public String manger()
    {
        return "*bruits de machouillement*";
    }

    public String communiquer()
    {
        return "Qui ose me defier ?";
    }
}