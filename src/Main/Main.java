public class Main {
    public static void main(String[] args) {

        Finca finca = new Finca();

        EmpleadoTiempoParcial empleadoTiempoParcial;

        String nombre = "Brahian Steven";
        String cargo = "TIEMPO PARCIAL";
        int numeroHoras = 20;
        int salarioHora = 10;
        int salario = numeroHoras * salarioHora;

        empleadoTiempoParcial = new EmpleadoTiempoParcial(nombre, cargo, numeroHoras, salarioHora, salario);
        finca.adicionarEmpleado(empleadoTiempoParcial);

        EmpleadoTiempoParcial empleadoTiempoParcial2;

        String nombre2 = "David Suarez";
        String cargo2 = "TIEMPO PARCIAL";
        int numeroHoras2 = 500;
        int salarioHora2 = 100;
        int salario2 = numeroHoras * salarioHora;

        empleadoTiempoParcial2 = new EmpleadoTiempoParcial(nombre2, cargo2, numeroHoras2, salarioHora2, salario2);
        finca.adicionarEmpleado(empleadoTiempoParcial2);

        EmpleadoTiempoParcial empleadoTiempoParcial3;

        String nombre3 = "Adrian Sanchez";
        String cargo3 = "TIEMPO PARCIAL";
        int numeroHoras3 = 50;
        int salarioHora3 = 50;
        int salario3 = numeroHoras * salarioHora;

        empleadoTiempoParcial3 = new EmpleadoTiempoParcial(nombre3, cargo3, numeroHoras3, salarioHora3, salario3);
        finca.adicionarEmpleado(empleadoTiempoParcial3);

        finca.agregarEmpleadosTiempoParcial();
        finca.listarEmpleadosTiempoParcial();
        finca.imprimirlistaEmpleadosTiempoParcial();

        System.out.println("---------------------------------------------------------------------");

        EmpleadoRecoleccion empleadoRecoleccion;

        String nombre6 = "Diego Ramirez";
        String cargo6 = "RECOLECCION";
        int numeroHoras6 = 20;
        int salarioHora6 = 10;
        int salario6 = numeroHoras6 * salarioHora6;

        empleadoRecoleccion = new EmpleadoRecoleccion(nombre6, cargo6, numeroHoras6, salarioHora6, salario6);
        finca.adicionarEmpleado(empleadoRecoleccion);

        EmpleadoRecoleccion empleadoRecoleccion2;

        String nombre4 = "Juan Jo Castro";
        String cargo4 = "RECOLECCION";
        int numeroHoras4 = 1;
        int salarioHora4 = 10;
        int salario4 = numeroHoras * salarioHora;

        empleadoRecoleccion2 = new EmpleadoRecoleccion(nombre4, cargo4, numeroHoras4, salarioHora4, salario4);
        finca.adicionarEmpleado(empleadoRecoleccion2);

        EmpleadoRecoleccion empleadoRecoleccion3;

        String nombre5 = "Maria garcia";
        String cargo5 = "RECOLECCION";
        int numeroHoras5 = 2;
        int salarioHora5 = 10;
        int salario5 = numeroHoras * salarioHora;

        empleadoRecoleccion3 = new EmpleadoRecoleccion(nombre5, cargo5, numeroHoras5, salarioHora5, salario5);
        finca.adicionarEmpleado(empleadoRecoleccion3);

        finca.agregarEmpleadosRecoleccion();
        finca.promedioTiempoParcial();
        finca.promedioRecoleccion();
        finca.listarEmpleadosMenorRendimiento();
        finca.imprimirlistaEmpleadosMenorRendimiento();
    }
}
