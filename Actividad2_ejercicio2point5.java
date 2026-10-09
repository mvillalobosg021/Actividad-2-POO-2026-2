
package actividad2_ejercicio2point5;

public class Actividad2_ejercicio2point5 {

    
    public static void main(String[] args) {
        // Crear una cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria(
                "Pedro",
                "Perez",
                123456789,
                "AHORROS",
                1.5f
        );

        // Imprimir los datos de la cuenta
        cuenta.imprimir();

        // Consignar dinero
        cuenta.consignar(200000);
        cuenta.consignar(300000);

        // Consultar el saldo
        cuenta.consultarSaldo();

        // Retirar dinero
        cuenta.retirar(400000);

        // Intentar retirar un valor mayor al saldo disponible
        cuenta.retirar(200000);

        // Aplicar el interes mensual
        cuenta.aplicarInteres();

        // Consultar el saldo final
        cuenta.consultarSaldo();
    }
}
