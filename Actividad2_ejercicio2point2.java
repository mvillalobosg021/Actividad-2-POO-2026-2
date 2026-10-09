package actividad2_ejercicio2point2;
public class Actividad2_ejercicio2point2 {

    public static void main(String[] args) {
            Planeta p1 = new Planeta(
            "Tierra", 1, 5.9736E24, 1.08321E12,
            12742, 150000000,
            Planeta.tipoPlaneta.TERRESTRE, true,
            1.0, 1.0
        );

        p1.imprimir();
        System.out.println("Densidad del planeta = " + p1.calcularDensidad());
        System.out.println("Es planeta exterior = " + p1.esPlanetaExterior());

        System.out.println();

        Planeta p2 = new Planeta(
            "Jupiter", 95, 1.898E27, 1.4313E15,
            139820, 750000000,
            Planeta.tipoPlaneta.GASEOSO, true,
            11.86, 0.414
        );

        p2.imprimir();
        System.out.println("Densidad del planeta = " + p2.calcularDensidad());
        System.out.println("Es planeta exterior = " + p2.esPlanetaExterior());
    }
}
    
