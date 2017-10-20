public  abstract class PadreCracker {
    
    protected String host;
     protected String ip;
     protected Dictionary dictionary;

     public abstract void setHost(String host);
     public abstract void setIp(String ip);
     public abstract void setDictionary(Dictionary dictionary);
     public abstract String crackPwd();

    
}
