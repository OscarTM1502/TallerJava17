public abstract class Creator {
    public abstract void create(String typeCracker,String ip,String host,Dictionary dictionary);
    public PadreCracker factoryMethod(String typeCracker,String ip,String host,Dictionary dictionary)
    {
    
        create(typeCracker,ip,host,dictionary);
        return passwordcracker;
    
    }
    
    protected PadreCracker passwordcracker;
}
