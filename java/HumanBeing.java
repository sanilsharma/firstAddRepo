abstract class HumanBeing 
{
    abstract void eyes();
    abstract void ears();
    abstract void nose();
    abstract void legs();
    abstract void kismat();
}
abstract class Roshan extends HumanBeing
{
     void eyes(){System.out.println("eyes");}
     void ears(){System.out.println("ears");}
     void nose(){System.out.println("nose");}
     void legs(){System.out.println("legs");}
}
class Roshan1 extends Roshan 
{ 
public static void main(String args[])
{
    void kismat(){System.out.println("kismat");}
}
}