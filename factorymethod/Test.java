public class Test {
    public static void main(String[] args){
       Creator c = new ConcreteCreator();

       PadreProduct p = c.factoryMethod("Producto1");
       PadreProduct pro2 = c.factoryMethod("Producto2");
    }
}
