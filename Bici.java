public class Bici{
   int angulo = 0;
    int vel = 0;

    public int girarDer(){
        if(angulo <89 && angulo > -89)
        return angulo + 3;
        else{
            System.out.println("El maximo de angulo es 89");
        }
        return 0;
    }

    public int girIzq(){
        if(angulo<89 && angulo > -89)
        return angulo -3;
        else{
            System.out.println("El maximo de angulo es 89");
        }
        return 0;
    }

    public int acel(){
        
        if (vel<60)
        return vel + 3;
        else{
            System.out.println("El maximo de velocidad es 60");
        }
        return 0;
    }

    public int frenar(){
        if (vel<=60 && vel > 0)
        return vel -5;
        else{
            System.out.println("El maximo de velocidad es 60");
        }
        return 0;
    }

    public static void main(String[] args) {
        Bici c = new Bici();
        int s = c.girarDer();
        int a = c.girIzq();
        int b = c.acel();
        int d = c.frenar();
        System.out.println("el angulo al girar a la derecha es: "+ s);
        System.out.println("el angulo al girar a la izquierda es: "+ a);
        System.out.println("la velocidad al frenar es: "+ d);
        System.out.println("la velocidad al acelerar es: "+ b);

    }
}