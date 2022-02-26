from Nodo import *

class Arbol:

    def __init__(self, raiz = None):
        self.raiz = raiz
    
    def insertar (self, dato, padre = None):
        if padre == None:
            if self.raiz == None:
                self.raiz == Nodo(dato)
            else: 
                self.insertar(dato, self.raiz)
        else: 
            if dato > padre.ValorNodo():
                if padre.GetSubDcho() == None:
                    padre.SetRamaDcho(Nodo(dato))
                else:
                    if padre.GetSubIzdo() == None:
                        padre.SetRamaIzdo(Nodo(dato))
                    else: self.insertar(dato,padre.GetSubIzdo)




        

