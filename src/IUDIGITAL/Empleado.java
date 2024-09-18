package IUDIGITAL;

public class Empleado {
    //crear atributos
    private String nombre;
    private String apellido;
    private String puesto;
    private int anioIngreso;

    //crear constructor
    public Empleado(String nombre, String apellido, String puesto, int anioIngreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.anioIngreso = anioIngreso;
    }

    //crear getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    //crear metodo para imprimir
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Puesto: " + puesto);
        System.out.println("Año de Ingreso: " + anioIngreso);
    }
}
