
package actividad2_ejercicio2point2;

public class Planeta {
    // Atributos del planeta
    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaSol = 0;

    // Tipo de planeta como valor enumerado
    enum tipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }

    tipoPlaneta tipo;

    boolean esObservable = false;

    // Nuevos atributos del planeta
    double periodoOrbital;
    double periodoRotacion;

    // Constructor de la clase Planeta
    Planeta(String nombre, int cantidadSatelites, double masa,
            double volumen, int diametro, int distanciaSol,
            tipoPlaneta tipo, boolean esObservable,
            double periodoOrbital, double periodoRotacion) {

        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;

        // Inicializar los nuevos atributos
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    // Metodo para imprimir los datos del planeta
    void imprimir() {
        System.out.println("Nombre del planeta = " + nombre);
        System.out.println("Cantidad de satelites = "
                + cantidadSatelites);
        System.out.println("Masa del planeta = " + masa);
        System.out.println("Volumen del planeta = " + volumen);
        System.out.println("Diametro del planeta = " + diametro);
        System.out.println("Distancia al Sol = " + distanciaSol);
        System.out.println("Tipo de planeta = " + tipo);
        System.out.println("Es observable = " + esObservable);

        // Imprimir los nuevos atributos
        System.out.println("Periodo orbital (anos) = "
                + periodoOrbital);
        System.out.println("Periodo de rotacion (dias) = "
                + periodoRotacion);
    }

    // Metodo que calcula la densidad del planeta
    double calcularDensidad() {
        return masa / volumen;
    }

    // Metodo que determina si el planeta es exterior
    boolean esPlanetaExterior() {

        double limite = 149597870.0 * 3.4;

        if (distanciaSol > limite) {
            return true;
        } else {
            return false;
        }
    }

    // Metodo principal para probar la clase
    public static void main(String[] args) {

        // Crear el objeto Tierra
        Planeta p1 = new Planeta(
                "Tierra",
                1,
                5.9736E24,
                1.08321E12,
                12742,
                150000000,
                tipoPlaneta.TERRESTRE,
                true,
                1.0,
                1.0
        );

        // Imprimir los datos de la Tierra
        p1.imprimir();

        System.out.println("Densidad del planeta = "
                + p1.calcularDensidad());

        System.out.println("Es planeta exterior = "
                + p1.esPlanetaExterior());

        System.out.println();

        // Crear el objeto Jupiter
        Planeta p2 = new Planeta(
                "Jupiter",
                95,
                1.898E27,
                1.4313E15,
                139820,
                750000000,
                tipoPlaneta.GASEOSO,
                true,
                11.86,
                0.414
        );

        // Imprimir los datos de Jupiter
        p2.imprimir();

        System.out.println("Densidad del planeta = "
                + p2.calcularDensidad());

        System.out.println("Es planeta exterior = "
                + p2.esPlanetaExterior())
    }

}
