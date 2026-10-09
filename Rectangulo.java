
package actividad2_ejercicio2point4;

public class Rectangulo {
    // Atributos del rectangulo
    int base;
    int altura;

    // Constructor de la clase Rectangulo
    Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Metodo que calcula y devuelve el area del rectangulo
    double calcularArea() {
        return base * altura;
    }

    // Metodo que calcula y devuelve el perimetro del rectangulo
    double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }
    
}
