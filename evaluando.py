from sys import stdin
import puntos
import integracion
import dkistra
import kruskal
import Mapa
global points[]

def autoGeneradorDeIdentificador():
    global points
    return 1+len(points)
def newPoint(x,y):
    global points
    pun = puntos(autoGeneradorDeIdentificador(),x,y)
    points.append(pun)
def rutaPunto(puntoCorte):
    global points
    if(points.contains(puntoCorte)):
        for i in range(len(points):
            if(points[i]==puntoCorte):
                points[i].off()
def activarPunto(punto):
    global points
    if(points.contains(puntoCorte)):
        for i in range(len(points):
            if(points[i]==puntoCorte):
                points[i].on()
def calcularRuta(punto):
    global points
    for i in range(len(points)):
        if(points[i]==punto):
            return points[i].alcance()
def main():
    global points
main()
