interface Computer {
    public void compileCode();
}
class Laptop implements Computer{
    public void compileCode(){
        System.out.println("compileCode in it industry");
    }
}
class Desktop implements Computer{
    public void compileCode(){
        System.out.println("you got 5 error,faster");
    }
}
class Developer{
    
    public void buildApp(Computer obj){
        System.out.println("BuildApp");
        obj.compileCode();
    }
}
public class Main {
    public static void main(String[] args) {
      //  Laptop obj = new Laptop();
        Computer obj = new Desktop();
        Developer dev = new Developer();

        dev.buildApp(obj);
       
    }    
}
