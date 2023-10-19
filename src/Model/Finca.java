import java.util.ArrayList;

public class Finca {

    private String nombre;
    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    private ArrayList<EmpleadoTiempoParcial> listaEmpleadosTiempoParcial = new ArrayList<>();
    private ArrayList<Empleado> listaEmpleadosMenorRendimiento = new ArrayList<>();
    private ArrayList<EmpleadoRecoleccion> listaEmpleadosRecoleccion = new ArrayList<>();

    public Finca(){}

    public void adicionarEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }

    public void agregarEmpleadosTiempoParcial() {
        for (Empleado empleados : listaEmpleados) {
            if (empleados.getCargo().equals("TIEMPO PARCIAL")) {
                listaEmpleadosTiempoParcial.add((EmpleadoTiempoParcial) empleados);
            }
        }
    }

    public void agregarEmpleadosRecoleccion() {
        for (Empleado empleados : listaEmpleados) {
            if (empleados.getCargo().equals("RECOLECCION")) {
                listaEmpleadosRecoleccion.add((EmpleadoRecoleccion) empleados);
            }
        }
    }

    public ArrayList<EmpleadoTiempoParcial> listarEmpleadosTiempoParcial(){

        ArrayList<EmpleadoTiempoParcial> lista = listaEmpleadosTiempoParcial;

        int n = lista.size();
        boolean intercambio;
        do {
            intercambio = false;
            for (int i = 1; i < n; i++) {
                if (lista.get(i - 1).calcularSalario() > lista.get(i).calcularSalario()) {
                    // Intercambiar elementos en el ArrayList
                    EmpleadoTiempoParcial temp = lista.get(i - 1);
                    lista.set(i - 1, lista.get(i));
                    lista.set(i, temp);
                    intercambio = true;
                }
            }
        } while (intercambio);
        return lista;
    }

    public void imprimirlistaEmpleadosTiempoParcial(){
        for (Empleado empleados : listaEmpleadosTiempoParcial) {
            System.out.println(empleados.getNombre());
        }
    }

    public double promedioTiempoParcial(){
        int cantidadEmpleadosTiempoParcial = listaEmpleadosTiempoParcial.size();
        double acumCantHoras = 0;
        for (EmpleadoTiempoParcial empleado : listaEmpleadosTiempoParcial) {
            acumCantHoras += empleado.getNumeroHoras();
        }
        return acumCantHoras/cantidadEmpleadosTiempoParcial;
    }

    public double promedioRecoleccion(){
        int cantidadEmpleadosRecoleccion = listaEmpleadosRecoleccion.size();
        double acumCantRecogidos = 0;
        for (EmpleadoRecoleccion empleado : listaEmpleadosRecoleccion) {
            acumCantRecogidos += empleado.getNumeroKilos();
        }
        return acumCantRecogidos/cantidadEmpleadosRecoleccion;
    }

    public ArrayList<Empleado> listarEmpleadosMenorRendimiento() {

        ArrayList<Empleado> lista = listaEmpleadosMenorRendimiento;

        for (EmpleadoTiempoParcial empleado : listarEmpleadosTiempoParcial()) {
            if(empleado.getNumeroHoras() < promedioTiempoParcial()){
                listaEmpleadosMenorRendimiento.add(empleado);
            }
        }

        for (EmpleadoRecoleccion empleado2 : listaEmpleadosRecoleccion) {
            if(empleado2.getNumeroKilos() < promedioRecoleccion()){
                listaEmpleadosMenorRendimiento.add(empleado2);
            }
        }
        return lista;
    }

    public void imprimirlistaEmpleadosMenorRendimiento(){
        for (Empleado empleados : listaEmpleadosMenorRendimiento) {
            System.out.println(empleados.getNombre());
        }
    }
}
