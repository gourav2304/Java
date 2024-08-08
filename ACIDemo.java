interface Car
{
    void drive(int avg, int ts);
}
public class ACIDemo 
{
    public static void main(String[] args) 
    {
        Car obj = (avg,ts) -> System.out.println("avg speed " + avg + " ts " + ts);
        
        obj.drive(16,140);
    }
}
