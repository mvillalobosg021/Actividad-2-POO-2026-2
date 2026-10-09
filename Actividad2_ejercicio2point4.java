
package actividad2_ejercicio2point4;

public class Actividad2_ejercicio2point4 {

   
    public static void main(String[] args) {
                
        // Crear las figuras geometricas
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1, 2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 =
                new TrianguloRectangulo(3, 5);
        Rombo figura5 = new Rombo(5, 8, 6);
        Trapecio figura6 =
                new Trapecio(10, 6, 4, 5, 5);

        // Probar el circulo
        System.out.println("Area del circulo = "
                + figura1.calcularArea());
        System.out.println("Perimetro del circulo = "
                + figura1.calcularPerimetro());
        System.out.println();

        // Probar el rectangulo
        System.out.println("Area del rectangulo = "
                + figura2.calcularArea());
        System.out.println("Perimetro del rectangulo = "
                + figura2.calcularPerimetro());
        System.out.println();

        // Probar el cuadrado
        System.out.println("Area del cuadrado = "
                + figura3.calcularArea());
        System.out.println("Perimetro del cuadrado = "
                + figura3.calcularPerimetro());
        System.out.println();

        // Probar el triangulo rectangulo
        System.out.println("Area del triangulo = "
                + figura4.calcularArea());
        System.out.println("Hipotenusa del triangulo = "
                + figura4.calcularHipotenusa());
        System.out.println("Perimetro del triangulo = "
                + figura4.calcularPerimetro());

        figura4.determinarTipoTriangulo();
        System.out.println();

        // Probar el rombo
        System.out.println("Area del rombo = "
                + figura5.calcularArea());
        System.out.println("Perimetro del rombo = "
                + figura5.calcularPerimetro());
        System.out.println();

        // Probar el trapecio
        System.out.println("Area del trapecio = "
                + figura6.calcularArea());
        System.out.println("Perimetro del trapecio = "
                + figura6.calcularPerimetro());
    }


}
    

