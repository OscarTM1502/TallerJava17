public class Test {
    public static void main(String[] args){
       Creator c = new ConcreteCreator();

       PadreProduct p = c.factoryMethod("192.168.0.5","localHost",new Dictionary);
     
    }
}
