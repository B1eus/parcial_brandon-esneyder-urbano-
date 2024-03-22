import java.util.Scanner;
public class Empleado extends Persona{
	String cargo;
	double salario;
	//constructor
	public Empleado(String nombre, int edad,String cargo,double salario) {
		super(nombre, edad);
		this.cargo = cargo;
		this.salario = salario;
	}
	//get y set
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	//metodo
	public void mostrarDatos() {
		System.out.println("Nombre: " + this.getNombre());
		System.out.println("edad: " + this.getEdad());
		System.out.println("cargo: " + this.getCargo());
		System.out.println("salario: " + this.getSalario());
	}
	public void responderPreguntas() {
		System.out.println("preguntas y respuestas");
		Scanner lectura =new Scanner (System.in);
		System.out.println("1. ¿Cuál es la diferencia entre una clase `Persona` y una clase `Empleado` en términos de atributos y métodos?"); 
		System.out.println("la respuesta es:");
		System.out.println("que la clase persona es la superclase o la clase padre y la clase empleado hereda los atributos y/o metodos con los cuales puede operar ");
		lectura.nextLine();
		System.out.println(" 2. ¿Cómo se establece la relación de herencia entre `Empleado` y `Persona` en Java?");
		System.out.println("la respuesta es:");
		System.out.println("la relacion que se unen las dos clases son los atributos de la clase persona y se establce con la siguiente linea de programacionpublic class hija extends clase padre ");
		lectura.nextLine();	
		System.out.println("3. ¿Qué es un constructor en Java y cuál es su propósito?"); 
		System.out.println("la respuesta es:");
		System.out.println("un constructor sirve para inicializar objetos ,propiedades y valores predeterminados");
		lectura.nextLine();
		System.out.println("4. ¿Por qué es útil utilizar la herencia en la programación orientada a objetos?"); 
		System.out.println("la respuesta es:");
		System.out.println("a herencia en la programación orientada a objetos es útil porque te permite compartir y reutilizar código entre clases, facilita la organización del código y hace que el desarrollo sea más eficiente");
		lectura.nextLine();
		System.out.println("5. ¿Cómo se llama el proceso de crear un objeto a partir de una clase en Java?"); 
		System.out.println("la respuesta es:");
		System.out.println("El proceso de crear un objeto a partir de una clase en Java se llama \"instanciación\" o \"creación de instancias\"");
	}

}