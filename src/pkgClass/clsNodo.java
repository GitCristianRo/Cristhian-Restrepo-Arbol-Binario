/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgClass;

/**
 *
 * @author Garces
 */
public class clsNodo {
    private int dato;
    private clsNodo izq;    
    private clsNodo der;

    public clsNodo() {
    }

    public clsNodo(int dato, clsNodo izq, clsNodo der) {
        this.dato = dato;
        this.izq = izq;
        this.der = der;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public clsNodo getIzq() {
        return izq;
    }

    public void setIzq(clsNodo izq) {
        this.izq = izq;
    }

    public clsNodo getDer() {
        return der;
    }

    public void setDer(clsNodo der) {
        this.der = der;
    }
    
}
