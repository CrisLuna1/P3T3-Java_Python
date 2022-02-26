from pickle import NONE


class Nodo:
    def __init__(self, dato, derecho=None, izquierdo=None):
        self.izquierdo = izquierdo
        self.derecho = derecho
        self.dato = dato


    def ValorNodo(self):
        return self.dato

    def GetSubIzdo (self):
        return self.izquierdo
    
    def GetSubDcho (self):
        return self.derecho

    def NuevoValor(self,d):
        self.d

    def SetRamaIzdo(self, n):
        self.izquierdo = n
    
    def SetRamaDcho(self, n):
        self.derecho = n

        
    
