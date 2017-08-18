

public class Singleton{
    private static Singleton instance;

    private Singleton()
    {
        
    }
    
    public static Singleton getInstance ()
    {
      if(instance == null)
      {
          instance = new Singleton();
        
      }
      return instance;
    }
    void doOperations(){
        System.out.println("Esta es una de las operaciones");
    }
    
}






















































