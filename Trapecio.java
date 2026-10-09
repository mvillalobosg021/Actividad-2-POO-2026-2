
package actividad2_ejercicio2point4;

public class Trapecio {
// Atributos del trapecio
    double baseMayor;
    double baseMenor;
    double altura;
    double lado1;
    double lado2;

    // Constructor de la clase Trapecio
    Trapecio(double baseMayor, double baseMenor, double altura,
            double lado1, double lado2) {

        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Metodo que calcula y devuelve el area del trapecio
    double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    // Metodo que calcula y devuelve el perimetro del trapecio
    double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }

}
