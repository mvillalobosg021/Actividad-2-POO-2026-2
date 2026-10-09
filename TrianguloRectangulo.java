
package actividad2_ejercicio2point4;

public class TrianguloRectangulo {
    // Atributos del triangulo rectangulo
    int base;
    int altura;

    // Constructor de la clase TrianguloRectangulo
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Metodo que calcula y devuelve el area del triangulo
    double calcularArea() {
        return (base * altura) / 2.0;
    }

    // Metodo que calcula y devuelve el perimetro del triangulo
    double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    // Metodo que calcula y devuelve la hipotenusa
    double calcularHipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    // Metodo que determina el tipo de triangulo
    void determinarTipoTriangulo() {

        double hipotenusa = calcularHipotenusa();

        if ((base == altura) && (base == hipotenusa)) {
            System.out.println("Es un triangulo equilatero");
        } else if ((base != altura)
                && (base != hipotenusa)
                && (altura != hipotenusa)) {
            System.out.println("Es un triangulo escaleno");
        } else {
            System.out.println("Es un triangulo isosceles");
        }
    }

}
