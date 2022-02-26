/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristian Luna
 */
public class Arbol {
    private Nodo raiz;

    public Arbol() {

    }

    public void insertar(int dato) {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato);
        } else {
            this.insertar(this.raiz, dato);
        }

    }

    public void insertar(Nodo padre, int dato) {
        if (dato > padre.valorNodo()) {
            if (padre.getSubArbolDer() == null) {
                padre.setRamaDer(new Nodo(dato));

            } else {
                if (padre.getSubArbolIzq() == null) {
                    padre.setRamaIzq(new Nodo(dato));
                } else {
                    this.insertar(padre.getSubArbolIzq(), dato);
                }
            }
        }
    }

}
