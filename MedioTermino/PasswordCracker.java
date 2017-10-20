public class PasswordCracker extends PadreCracker
 {
     protected String host;
     protected String ip;
     protected Dictionary dictionary;
    
     

    public void setHost(String host)
    {
        this.host = host;
        System.out.println("EL host es " + host);
    }
    
    public void setIp(String ip)
    {
        this.ip = ip;
        System.out.println("La IP es " + ip);
    }
    
    public void setDictionary(Dictionary dictionary)
    {
        this.dictionary = dictionary;
        System.out.println("Eldiccionario es" + dictionary);
    }

    public String crackPwd()

    {
      return "password";
    }
}
