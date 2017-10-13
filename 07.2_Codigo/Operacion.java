/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udla;

/**
 *
 * @author luise
 */
public class Operacion {
    public Operacion()
    {}
    
    public float Sumar(float operando1, float operando2)
    {
        float resultado = operando1 + operando2;
        return resultado;
    }
    public float Restar(float operando1, float operando2)
    {
        float resultado = operando1 - operando2;
        return resultado;
    }
    public float Multiplicar(float operando1, float operando2)
    {
        float resultado = operando1 * operando2;
        return resultado;
    }
    public float Dividir(float operando1, float operando2)
    {
        float Resultado;
             if (operando2! = 0)
                  {
                   float resultado = operando1 / operando2;
                }
         else   {
                return 0;
                } 
    }
    public float Porciento(float operando1, float operando2)
    {
        float resultado = ( operando1 / 100) * operando2;
        return resultado;
    }
    public float Residuo(float operando1, float operando2)
    {
         float Resultado;
             if (operando2! = 0)
                  {
                   float resultado = operando1 % operando2;
                   }
         else  {
                return 0;
               } 
    }
}
