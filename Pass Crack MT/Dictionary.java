public class Dictionary<T>
 {
    private static Dictionary dictionary;
     String[]  dic;
     protected int contador;
    
    private Dictionary()
    {
        dic = new String[10];
        
    }
    public T at(int idx)
      {
           return (T)dic[idx];
      }


    public static Dictionary getDictionary ()
    {
      if(dictionary == null)
      {
          dictionary = new Dictionary();
        
      }
      return dictionary;
    }

    public void addWord(String a){
       
        dic[contador] = a;
        contador = contador + 1;

    }

    Iterator getIterator()
     {
         return new Iterator<T>(this);
     }

      public int length(){

         return contador;
     }
    
  public static void main(String[]args) {

       Dictionary dic = Dictionary.getDictionary();


        dic.addWord("abcd");
        dic.addWord("abcdefg");
        dic.addWord("abcdefghijqlm");
         dic.addWord("abcdefghijklmnopqrst");

        System.out.println(""+dic.at(2));
        
          Iterator itr = dic.getIterator();

          while(itr.hasNext())
          {
              System.out.println("" + itr.next());
          }

    }
}
