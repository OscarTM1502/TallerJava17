public class ConcreteCreator extends Creator
{
    @Override
    public void create(String typeDriver)
    {
        if (typeDriver.compareTo("MongoDB") == 0)
        {
            driver = new DriverDBmango();
            ((DriverDBmango)driver).abrirConexion();
            ((DriverDBmango)driver).establecerPropiedades();
            ((DriverDBmango)driver).creaLogFile();
            
        }
        
    }
}
