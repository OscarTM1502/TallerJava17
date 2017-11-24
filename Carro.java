Public class Carro{

    int angulo = -30;
    int vel = 1090;

    public int girarDer(){
        if(angulo <30 && angulo > -30)
        return angulo + 6;
        else{
            System.out.println("El maximo de angulo es 30");
        }
        return 0;
    }

    public int girIzq(){
        if(angulo<30 && angulo > -30)
        return angulo -6;
        else{
            System.out.println("El maximo de angulo es 30");
        }
        return 0;
    }

    public int acel(){
        
        if (vel<100)
        return vel + 5;
        else{
            System.out.println("El maximo de velocidad es 100");
        }
        return 0;
    }

    public int frenar(){
        if (vel<=100 && vel > 0)
        return vel -10;
        else{
            System.out.println("El maximo de velocidad es 100");
        }
        return 0;
    }

    public static void main(String[] args) {
        Carro c = new Carro();
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