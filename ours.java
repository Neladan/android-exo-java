

public class ours extends predateur implements omnivore
{
    public ours (String nom)
    {
        this.nom = nom;
        this.espece = "Ours";
        this.cri = "Grognement";
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
        return "Je vais pecher du poisson ce matin";
    }

    public String BeOmni()
    {
        return this.name.concat(": ").concat("Je suis Omnivore");
    }
}