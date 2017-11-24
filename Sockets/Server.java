import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;


public class Server {
 
   public static void main(String[] args) {
       
       try {
            int port = 2221;
            ServerSocket server = new ServerSocket(port);
            Socket cliente = server.accept();

            PrintWriter print = new PrintWriter(cliente.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            String line = "no estes molestando";
            while ((line = in.readLine()) != null) {
                System.out.println(line);
             print.println("servidor repite" + line);
                
            }
            cliente.close();
            server.close();

       } catch (IOException ex) {
          
       }
      
   }
}
