public class Test {
    public static void main(String[] args){
      
      Director d = new Director();
      Hamburger h = d.orderHam("Hawai");
      Hamburger dob = d.orderHam("Double");
     h.getHambType();
     dob.getHambType();
    }
}
