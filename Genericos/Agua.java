public class Agua extends Bebida implements Comparable {
    public int mililitros;
    public void tomar()
    {
        System.out.println("Tomando Agua");
    }

    public boolean equals(Object obj){

    if(obj.getClass().getName().equals("Refresco"))
    {
      
      return (mililitros == ((Refresco)obj).mililitros);
    }

    return (mililitros == ((Agua)obj).mililitros);
    }

    public int compareTo(Object o)
    {
        Agua temp = (Agua)o;
          if (mililitros < temp.mililitros)
          {
              return -1;
          }
          if (mililitros > temp.mililitros)
          {
              return 1;
          }
          return 0;
    }
}
