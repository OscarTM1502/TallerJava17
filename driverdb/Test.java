public class Test {
    public static void main(String[] args){
       Creator c = new ConcreteCreator();

       Driver d = c.factoryMethod("MongoDB");
       
    }
}
