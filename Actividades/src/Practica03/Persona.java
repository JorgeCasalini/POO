package practica03;

public class Persona {
    private String nombre;
    private int dni;
    private int edad;
    
    public Persona(String unNombre, int unDni, int unaEdad) {
        nombre = unNombre;
        dni = unDni;
        edad = unaEdad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return " Nombre=" + nombre+ " DNI=" + dni+ " Edad=" + edad;
    }
}