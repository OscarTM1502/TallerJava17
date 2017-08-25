public class ConcreteCreator extends Creator
{
    @Override
    public void create(String typeProduct)
    {
        if (typeProduct.compareTo("Producto1") == 0)
        {
            product = new Product();
            ((Product)product).construirParteUno();
            ((Product)product).construirParteDos();
            
        }
        if (typeProduct.compareTo("Producto2")== 0)
        {
             product = new Product2();
            ((Product2)product).complex1();
            ((Product2)product).complex2();
        }
    
    }
}
