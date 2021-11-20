
public class loup extends predateur
{
    public loup (String nom)
    {
        this.nom = nom;
        this.espece = "Loup";
        this.cri = "Hurlement";
    }



    public String chasser() 
    {
        return ("J'aime chasser tout ce qui bouge tant que c'est de la viande fraiche");
    }

    public String manger() 
    {
        return ("*bruits de machouillement*");
    }

    public String communiquer() 
    {
        return "Qui ose troubler l'ordre dans ma meute ?";
    }
}