public class ConcreteCreator extends Creator
{
    @Override
    public void create(String typeCracker, String ip,String host,Dictionary dictionary)
    {
        
            passwordcracker = new PasswordCracker();
            ((PasswordCracker)passwordcracker).setHost(host);
            ((PasswordCracker)passwordcracker).setIp(ip);
            ((PasswordCracker)passwordcracker).setDictionary(dictionary);
            
        
        
    
    }
}
