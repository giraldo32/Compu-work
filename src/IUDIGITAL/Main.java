package IUDIGITAL;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//import scanner
        Scanner scanner = new Scanner(System.in);
//crear un objeto de la clase empleado por teclado
        System.out.println("Ingrese la identidad del empleado: ");
        String identidad = scanner.nextLine();
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del empleado: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese el tipo de empleado: ");
        String tipoEmpleado = scanner.nextLine();
        System.out.println("Ingrese el telefono del empleado: ");
        String telefono = scanner.nextLine();
        System.out.println("Ingrese el correo del empleado: ");
        String correo = scanner.nextLine();
        System.out.println("Ingrese la direccion del empleado: ");
        String direccion = scanner.nextLine();
        System.out.println("Ingrese la fecha de contratacion del empleado: ");
        String fechaContratacion = scanner.nextLine();
        System.out.println("Ingrese el cargo del empleado: ");
        String cargo = scanner.nextLine();
        System.out.println("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        Empleado empleado = new Empleado(identidad, nombre, apellido, tipoEmpleado, telefono, correo, direccion, fechaContratacion, cargo, salario);


        //crear un objeto de la clase departamento por teclado
        System.out.println("Ingrese el id del departamento: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el nombre del departamento: ");
        String nombreDepartamento = scanner.nextLine();
        System.out.println("Ingrese el jefe del departamento: ");
        String jefe = scanner.nextLine();
        System.out.println("Ingrese la lista de empleados del departamento: ");
        String listaEmpleados = scanner.nextLine();
        System.out.println("Ingrese la descripcion del departamento: ");
        String descripcion = scanner.nextLine();
        System.out.println("Ingrese el gerente del departamento: ");
        String gerente = scanner.nextLine();
        Departamento departamento = new Departamento(id, nombreDepartamento, jefe, listaEmpleados, descripcion, gerente);


        //crear un objeto de la clase reporte de desempenio por teclado
        System.out.println("Ingrese el id del reporte de desempenio: ");
        int idReporte = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese los empleados del reporte de desempenio: ");
        String empleados = scanner.nextLine();
        System.out.println("Ingrese la fecha del reporte de desempenio: ");
        String fechaReporte = scanner.nextLine();
        System.out.println("Ingrese el puntaje de desempenio: ");
        int puntajeDesempenio = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el comentario del reporte de desempenio: ");
        String comentario = scanner.nextLine();
        System.out.println("Ingrese el departamento del reporte de desempenio: ");
        String departamentoReporte = scanner.nextLine();
        ReporteDesempenio reporteDesempenio = new ReporteDesempenio(idReporte, empleados, fechaReporte, puntajeDesempenio, comentario, departamentoReporte);

        //imprimir los objetos
        empleado.imprimir();
        departamento.imprimir();
        reporteDesempenio.imprimir();


    }

}

