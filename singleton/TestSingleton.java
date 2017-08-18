

public class TestSingleton{
    public static void main(String[]args) {

        Singleton instancia1 = Singleton.getInstance();
        Singleton instancia2 = Singleton.getInstance();
        Singleton instancia3 = Singleton.getInstance();

        System.out.println("dir inst1 " + instancia1);
        System.out.println("dir inst1 " + instancia2);
        System.out.println("dir inst1 " + instancia3);

        
    }
}