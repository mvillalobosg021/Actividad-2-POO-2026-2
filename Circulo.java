
package actividad2_ejercicio2point4;

public class Circulo {
    
    // Atributo que define el radio del circulo
    int radio;

    // Constructor de la clase Circulo
    Circulo(int radio) {
        this.radio = radio;
    }

    // Metodo que calcula y devuelve el area del circulo
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Metodo que calcula y devuelve el perimetro del circulo
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    
}
