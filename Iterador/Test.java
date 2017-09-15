public class Test
{
  
  public static void main(String[]args) {

       Collection<String> str = new Collection<String>(10);


        str.add("HOLA");
        str.add("Como Estas");
        str.add("tal vez me hayas olvidado");

        System.out.println(""+str.at(2));
        
          Iterator itr = str.getIterator();

          while(itr.hasNext())
          {
              System.out.println("" + itr.next());
          }

    }
}
