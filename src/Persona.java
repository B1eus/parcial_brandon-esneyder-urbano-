
public class Persona {
String nombre;
int edad;
//constructor
public Persona(String nombre,int edad) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	
}
//get y set
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
//metodo
public void mostrarDatos() {
	System.out.println("Nombre: " + this.getNombre());
    System.out.println("edad: " + this.getEdad());
}

}
