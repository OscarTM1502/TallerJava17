public class Test {
    public static void main(String[] args){
       Creator c = new ConcreteCreator();

       PadreCracker p = c.factoryMethod("Cracker","192.168.0.5","localHost",new Dictionary());
     
    }
}

