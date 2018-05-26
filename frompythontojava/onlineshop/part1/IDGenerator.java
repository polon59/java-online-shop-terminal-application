package frompythontojava.onlineshop.part1;

public class IDGenerator{
    
    private static int ID = 0;

    public static int getID(){
        ID++;
        return ID;
    }

}