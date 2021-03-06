import puntos
import convex
class Mapa(puntos):
    def __init__(self,conexiones):
        self.conexiones = conexiones
    def agregarConexion(self,punto):
        if(self.contains(punto)==True):
            self.conexiones.append(punto)
    def contains(self,punto):
        res = True
        cordenadaX = punto.getX()
        cordenadaY = punto.getY()
        for i in range(len(self.conexiones)):
            if(cordenadaX==self.conexiones[i].getX() and cordenadaY==self.conexiones[i].getY()):
                res = False
                break
        return res
    def EliminarPunto(self,punto):
        cordenadaX = punto.getX()
        cordenadaY = punto.getY()
        for i in range(len(self.conexiones)):
            if(cordenadaX==self.conexiones[i].getX() and cordenadaY==self.conexiones[i].getY()):
                self.conexiones.pop(punto)
                break
    def setPuntos(self):
        return self.conexiones
    def longitud(self):
        return len(self.conexiones)
    def alcance(self):
        movilidad = Alcance()
        return movilidad.convex_hull(self.conexiones)
