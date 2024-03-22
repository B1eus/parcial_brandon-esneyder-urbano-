
import java.util.Scanner;

public class Aplicacion {

  public Aplicacion() {
    // TODO Auto-generated constructor stub
  }

  public static void main(String[] args) {

    Scanner lectura = new Scanner(System.in);
    //entrada
    System.out.println("ingrese nombre: ");
    String nombre = lectura.nextLine();
    System.out.println("ingrese edad: ");
    int edad = lectura.nextInt();
    System.out.println("Mostrando datos de la persona:");
    //objeto persona
    Persona persona1 = new Persona(nombre,edad);
    persona1.mostrarDatos();

    //objeto empleado
    Scanner lectura1 = new Scanner(System.in);
        Empleado empleado1 = new Empleado(nombre, edad, null, 0);
        //entrada
        System.out.println("ingrese nombre del empleado: ");
        empleado1.nombre=lectura1.nextLine();
        System.out.println("ingrese edad del empleado: ");
        empleado1.edad=lectura1.nextInt();
        System.out.println("ingrese salario: ");
        empleado1.salario=lectura1.nextDouble();
        System.out.println("ingrese cargo: ");
        empleado1.cargo=lectura1.next();
        System.out.println("Mostrando datos del empleado:");
        empleado1.mostrarDatos();
        empleado1.responderPreguntas();
System.out.println("Saliendo......");

  }

}
