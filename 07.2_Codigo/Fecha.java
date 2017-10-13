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
public class Fecha {
    public void Fecha()
    {}
    
    public boolean EsAnioBisiesto(int anio)
    {
        boolean esBisiesto = false;
        if (anio%4 == 0)
        {
            if (anio%100 == 0)
            {
                if (anio%400 == 0)
                    esBisiesto = true;
            }
            else
                esBisiesto = true;
        }
        return esBisiesto;
    }
}
