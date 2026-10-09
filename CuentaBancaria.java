
package actividad2_ejercicio2point5;

public class CuentaBancaria {

    // Atributos de la cuenta
    String nombresTitular;
    String apellidosTitular;
    int numeroCuenta;
    String tipoCuenta;
    float saldo = 0;
    float interesMensual;

    // Constructor de una cuenta bancaria
    CuentaBancaria(String nombresTitular, String apellidosTitular,
            int numeroCuenta, String tipoCuenta, float interesMensual) {

        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.interesMensual = interesMensual;
    }

    // Metodo para imprimir los datos de la cuenta
    void imprimir() {
        System.out.println("Nombres del titular = " + nombresTitular);
        System.out.println("Apellidos del titular = " + apellidosTitular);
        System.out.println("Numero de cuenta = " + numeroCuenta);
        System.out.println("Tipo de cuenta = " + tipoCuenta);
        System.out.println("Saldo = $" + saldo);
        System.out.println("Interes mensual = " + interesMensual + "%");
        
    }

    // Metodo para consultar el saldo
    void consultarSaldo() {
        System.out.println("El saldo actual es = $" + saldo);
    }

    // Metodo para consignar dinero en la cuenta
    boolean consignar(float valor) {

        if (valor > 0) {
            saldo = saldo + valor;

            System.out.println("Se ha consignado $" + valor
                    + " en la cuenta.El nuevo saldo es = $" + saldo);
            return true;
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");

            return false;
        }
    }

    // Metodo para retirar dinero de la cuenta
    boolean retirar(float valor) {

        if ((valor > 0) && (valor <= saldo)) {
            saldo = saldo - valor;

            System.out.println("Se ha retirado $" + valor
                    + " de la cuenta.");
            System.out.println("El nuevo saldo es = $" + saldo);

            return true;
        } else {
            System.out.println("No se puede realizar el retiro.");
            System.out.println("Verifique el valor y el saldo disponible.");

            return false;
        }
    }

    // Metodo para aplicar el interes mensual
    void aplicarInteres() {

        float interes = saldo * interesMensual / 100;
        saldo = saldo + interes;

        System.out.println("Interes aplicado = $" + interes);
        System.out.println("El nuevo saldo es = $" + saldo);
    }
}



