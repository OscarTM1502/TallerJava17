import java.util.*;
import java.net.*;
import java.io.*;
public class MultiThreadSocket {
 public static void main(String[] args) {
    Vector v=new Vector<StringBuffer>();
     try {
        int port = 1111;
        ServerSocket server = new ServerSocket(port);
        Socket clientes;
       
    
        for (int i=1 ; i<=10 ; i++ )
        {
          
            clientes = server.accept();
            ProcessRequest other = new ProcessRequest(clientes,v);
            Thread t = new Thread(other);
            t.start();
                
        }
        for(int i=0; i< v.size(); i++){
            
            System.out.println("El Vector Guardo el Siguiente Mensaje" + v.get(i));
          }
     } catch (IOException ex) {
         
     }
 }
    
}