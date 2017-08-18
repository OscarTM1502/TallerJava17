


import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Reloj{
    private static Reloj instance;

    private Reloj()
    {
        
    }
    
    public static Reloj getInstance ()
    {
      if(instance == null)
      {
          instance = new Reloj();
        
      }
      return instance;
    }
    void doOperations(){
        System.out.println("Esta es una de las operaciones");
    }
    
     }
    void getHora(){
        System.out.println( new SimpleDateFormat(" HH:mm:ss").format(Calendar.getInstance().getTime()) );
    }
    
    void getFecha(){
        System.out.println( new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime()) );
        
    }

}
