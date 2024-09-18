package IUDIGITAL;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //crear objeto de la clase Empleado
        Empleado empleado = new Empleado("Juan", "Perez", "Gerente", 2010);
        //crear objeto de la clase Departamento
        Departamento departamento = new Departamento("Recursos Humanos", "Maria", "Piso 3");
        //crear objeto de la clase ReporteDesempenio
        ReporteDesempenio reporte = new ReporteDesempenio("Juan", "Perez", "Recursos Humanos", "Gerente", 2010);

        //imprimir datos del empleado
        System.out.println("Datos del Empleado");
        empleado.imprimir();
        System.out.println();

        //imprimir datos del departamento
        System.out.println("Datos del Departamento");
        departamento.imprimir();
        System.out.println();

        //imprimir datos del reporte de desempeño
        System.out.println("Reporte de Desempeño");
        reporte.imprimir();
    }

    //crear metodo para imprimir
    public void imprimir() {
    }

    //crear metodos
    public void mostrarReporte() {
    }

//import scanner in order to read input from the user





}