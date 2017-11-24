
import java.net.*;
import java.io.*;
public class Client {

  public static void main(String[] args) {
      String host = "localhost";
      int port = 2221;
      try (Socket socket = new Socket (host, port);
      PrintWriter print = new PrintWriter(socket.getOutputStream(),true);
      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));)
     {
         String line = "Soy  el Cliente como estas";
         print.println(line);
         System.out.println(in.readLine());
      } 
      catch (Exception ex) {
        System.out.println(ex.toString());
      }
     
      
  }
}