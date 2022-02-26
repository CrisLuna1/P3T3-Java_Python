/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristian Luna
 */
public class Nodo {
 

    protected int dato;
    protected Nodo izquierdo;
    protected Nodo derecho;
    /**
     * Constructor para inicializar un arbol binario
     * 
     * @param valor Dato o información contenida en el nodo
     */
    public Nodo(int valor) {
        dato = valor;
        izquierdo = derecho = null;
    }
    /**
     * Constructor para inicializar un arbol binario con ramas
     * 
     * @param ramaIzq nodo subarbol izquierdo
     * @param valor   dato contenido en el nodo
     * @param ramaDer nodo subarbol derecho
     */
    public Nodo(Nodo ramaIzq, int valor, Nodo ramaDer) {
        dato = valor;
        izquierdo = ramaIzq;
        derecho = ramaDer;
    }

    /**
     * @return Devuelve el valor del nodo
     */
    public int valorNodo() {
        return dato;
    }
    /**
     * @return devuelve el sub arbol izquierdo
     */
    public Nodo getSubArbolIzq() {
        return izquierdo;
    }
    /**
     * @return Devuelve el sub arbol derecho
     */
    public Nodo getSubArbolDer() {
        return derecho;
    }
    /**
     * 
     * @param d
     */
    public void nuevoValor(int d) {
        dato = d;
    }
    /**
     * Asigna un nodo a la rama izquierda
     * 
     * @param n Nodo
     */
    public void setRamaIzq(Nodo n) {
        izquierdo = n;
    }
    /**
     * Asigna un nodo a la rama derecha
     * 
     * @param n Nodo
     */
    public void setRamaDer(Nodo n) {
        derecho = n;
    }
}



