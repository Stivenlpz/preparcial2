public class EmpleadoRecoleccion extends Empleado {
    
    private int numeroKilos;
    private int valorKilo;

    public EmpleadoRecoleccion(){}

    public EmpleadoRecoleccion(String nombre, String cargo, int numeroKilos, int valorKilo, int salario) {
        super(nombre, cargo);
        this.numeroKilos = numeroKilos;
        this.valorKilo = valorKilo;
        salario = calcularSalario();
    }

    public int getNumeroKilos() {
        return numeroKilos;
    }

    public int calcularSalario() {
        return numeroKilos * valorKilo;
    }

    public void setNumeroKilos(int numeroKilos) {
        this.numeroKilos = numeroKilos;
    }

    public int getValorKilo() {
        return valorKilo;
    }

    public void setValorKilo(int valorKilo) {
        this.valorKilo = valorKilo;
    }
}
