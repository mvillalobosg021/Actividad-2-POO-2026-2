
package actividad2_ejercicio2point4;

public class Cuadrado {
    // Atributo que define la longitud del lado
    int lado;

    // Constructor de la clase Cuadrado
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    // Metodo que calcula y devuelve el area del cuadrado
    double calcularArea() {
        return lado * lado;
    }

    // Metodo que calcula y devuelve el perimetro del cuadrado
    double calcularPerimetro() {
        return 4 * lado;
    }

}
