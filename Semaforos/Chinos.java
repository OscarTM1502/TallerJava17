import java.util.concurrent.Semaphore;
import static java.lang.Math.random;

public class Chinos implements Runnable{
       String s;
       Semaphore sillas;
       Semaphore tenedores;
       Semaphore cuchillos;
       public Chinos(String s, Semaphore sillas,Semaphore tenedores,Semaphore cuchillos)
    {
          this.sillas= sillas;
          this.tenedores= tenedores;
          this.cuchillos= cuchillos;
          this.s= s;
    }
     
       public void run()
{            
             long r = (long)(Math.random()* 10000);
              try {
                   sillas.acquire();
                   tenedores.acquire();
                   cuchillos.acquire();
                   System.out.println("Estoy Comienndo" + s);
                   Thread.sleep(r);
                   cuchillos.release();
                   tenedores.release();
                   sillas.release();
                  } catch (InterruptedException ex) {

                  }
 }

      public static void main(String[] args)
       {
           Semaphore cuc = new Semaphore(4);
           Semaphore ten = new Semaphore(5);
           Semaphore si = new Semaphore(6);
           Thread t1 = new Thread(new Chinos(" chino 1", cuc,ten,si));
           Thread t2 = new Thread(new Chinos(" chino 2", cuc,ten,si));
           Thread t3 = new Thread(new Chinos(" chino 3", cuc,ten,si));
           Thread t4 = new Thread(new Chinos(" chino 4", cuc,ten,si));
           Thread t5 = new Thread(new Chinos(" chino 5", cuc,ten,si));
           Thread t6 = new Thread(new Chinos(" chino 6", cuc,ten,si));
           Thread t7 = new Thread(new Chinos(" chino 7", cuc,ten,si));
           Thread t8 = new Thread(new Chinos(" chino 8", cuc,ten,si));
           Thread t9 = new Thread(new Chinos(" chino 9", cuc,ten,si));
           Thread t10 = new Thread(new Chinos(" chino 10", cuc,ten,si));
           Thread t11 = new Thread(new Chinos(" chino 11", cuc,ten,si));
           Thread t12 = new Thread(new Chinos(" chino 12", cuc,ten,si));
           Thread t13 = new Thread(new Chinos(" chino 13", cuc,ten,si));
           Thread t14 = new Thread(new Chinos(" chino 14", cuc,ten,si));
           Thread t15 = new Thread(new Chinos(" chino 15", cuc,ten,si));
           
           t1.start();
           t2.start();
           t3.start();
           t4.start();
           t5.start();
           t6.start();
           t7.start();
           t8.start();
           t9.start();
           t10.start();
           t11.start();
           t12.start();
           t13.start();
           t14.start();
           t15.start();
          
           
       }

}
