/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.panaderia;

/**
 *
 * @author Candelaria
 */
public class ComposicionCaja implements Comparable {
    private int cantidad;
    private Dinero dinero;

    /**
    * Constructor por Defecto.
    */
    public ComposicionCaja() {
    }

    /**
    * Constructor con parámetros, con todos los atributos de la clase ComposicionCaja.     
     * @param cantidad     
     * @param dinero     
    */
    public ComposicionCaja(int cantidad, Dinero dinero) {
        this.cantidad = cantidad;
        this.dinero = dinero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Dinero getDinero() {
        return dinero;
    }

    public void setDinero(Dinero dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return this.cantidad + " de " + this.dinero.getDenominacion() + "\n"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Object o) {
        ComposicionCaja c;
        c = (ComposicionCaja)o;
        if (c.dinero.equals(this.dinero))
            return 0;
        else{
            return -1;
        }
    }
         
    
    
}
