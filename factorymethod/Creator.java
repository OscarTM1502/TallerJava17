public abstract class Creator {
    public abstract void create(String typeProduct);
    public PadreProduct factoryMethod(String typeProduct)
    {
    
        create(typeProduct);
        return product;
    
    }
    
    protected PadreProduct product;
}
