public class Comparaciones<T> {
    
public boolean iguales(T  a,T  b)
{
    return a.equals(b);
}

public <E, R> boolean igualesB (E a,R b)
{
    return a.equals(b);
}


public <N extends Number & Comparable> N mayor (N a,N b)
{
if(a.compareTo(b) > 0)
{
    return a;
}
return b;
}


public static void main(String[] args)
{
Comparaciones c = new Comparaciones();
String a = "Hola";
String b = "Hola";

Integer i = new Integer(5);
Integer j = new Integer(5);

Agua b1 = new Agua();
b1.mililitros=500;
Agua b2 = new Agua();
b2.mililitros=400;

Refresco rf1 = new Refresco();
rf1.mililitros=400;

System.out.println(b1.compareTo(b2));
System.out.println("enteros " + c.iguales(i, j));
System.out.println("cadenas " + c.iguales(a, b));
System.out.println("Aguas " + c.iguales(b1, b2));
System.out.println("Aguas y Refresco " + c.iguales(b1, rf1));
System.out.println("numeros " + c.mayor(5 ,3));
}
}
