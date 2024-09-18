package IUDIGITAL;

public class ReporteDesempenio {
    //crear atributos
    private String nombre;
    private String apellido;
    private String departamento;
    private String puesto;
    private int anioIngreso;

    //crear constructor
    public ReporteDesempenio(String nombre, String apellido, String departamento, String puesto, int anioIngreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.departamento = departamento;
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
        System.out.println("Departamento: " + departamento);
        System.out.println("Puesto: " + puesto);
        System.out.println("Año de Ingreso: " + anioIngreso);





    }


}
