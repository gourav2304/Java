class Animal
{
    final int num = 6;
    final public void sleep(){
       // num =6;
        System.out.println("zzz");
    }
}
class Tiger extends Animal
{

}

public class fina {
    public static void main (String[]args)
    {
        Tiger t = new Tiger();
        t.sleep();

    }
}
