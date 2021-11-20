
public class Main 
{
    public static void main (String[] args)
    {
        System.out.println("Biemvenu chez les predateurs\n");
        loup lo = new loup("Terry");
        lion li = new lion("Simba");
        ours ou = new ours("Balou");

        System.out.println(lo.communiquer());
        System.out.println(li.communiquer());
        System.out.println(ou.communiquer());
    }
    
}
