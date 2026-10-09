
package actividad2_ejercicio2point1;


public class Persona {
    String nombre; // Atributo nombre de persona
    String apellido; // Atributo apellido de persona
    String numeroDocumentoIdentidad; //Atributo documento de ID de una perosna
    int añoNacimiento;//Atributo de nacimiento
    String paisNacimiento;
    char genero;
    
    //MEtodo constructor de una persona
    Persona(String nombre, String apellido, String numeroDocumentoIdentidad, int añoNacimiento, String paisNacimiento,char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.paisNacimiento = paisNacimiento; 
        this.genero = genero;
    }
    //metodo para imprimir los datos de una persona
    void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
        System.out.println("Número de documento de identidad = " +numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + añoNacimiento);
        System.out.println("Pais de nacimiento = " + paisNacimiento);
        System.out.println("Genero = " + genero);
        System.out.println();
        }
}
