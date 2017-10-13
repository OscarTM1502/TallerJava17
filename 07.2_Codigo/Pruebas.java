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
public class Pruebas {
    public Pruebas()
    {}
    public boolean ProbarBisiesto()
    {
        boolean resultado = true;
        Fecha fecha;
        fecha = new Fecha();
        
        if (fecha.EsAnioBisiesto(2001) == true)
            resultado = false;
        else if (fecha.EsAnioBisiesto(2000) != true)
            resultado = false;
        return resultado;
    }
    public boolean ProbarOperaciones()
    {
        boolean resultado = true;
        
        return resultado;
    
}
}
