package IUDIGITAL;

public class Departamento {
    //crear atributos puesto de trabajo
    private String nombre;
    private String jefe;
    private String ubicacion;

    //crear constructor
    public Departamento(String nombre, String jefe, String ubicacion) {
        this.nombre = nombre;
        this.jefe = jefe;
        this.ubicacion = ubicacion;
    }

    //crear getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    //crear metodo para imprimir
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Jefe: " + jefe);
        System.out.println("Ubicacion: " + ubicacion);
    }


}
