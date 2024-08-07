public class launchmulti {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }
    
}
