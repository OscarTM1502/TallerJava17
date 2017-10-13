import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DeamonThread extends JFrame implements Runnable {

public DeamonThread(){
     setUndecorated(true);
     setSize(new Dimension(150,150));
     getContentPane().add(new JLabel("Tazmania label"),BorderLayout.CENTER);
     pack();
     setLocation(50,50);
     setVisible(true);

     t = new Thread(this, "demonio");
     t.start();
     
}

public static void main(String[] args) {
    DeamonThread d = new DeamonThread();
}

public void run() {
    while(true)
    {
        setVisible(true);
        try {
            Thread.sleep(2000);
            setVisible(false);
        } catch (InterruptedException ex) {
            
        }
    }
}


}