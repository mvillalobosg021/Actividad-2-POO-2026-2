
package actividad2_ejercicio2point4;

public class Rombo {
    // Atributos del rombo
    double lado;
    double diagonalMayor;
    double diagonalMenor;

    // Constructor de la clase Rombo
    Rombo(double lado, double diagonalMayor, double diagonalMenor) {
        this.lado = lado;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    // Metodo que calcula y devuelve el area del rombo
    double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    // Metodo que calcula y devuelve el perimetro del rombo
    double calcularPerimetro() {
        return 4 * lado;
    }


}
