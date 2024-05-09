package parcial;

public class Medico {
    private final int cedula;
    private final String nombre;
    private final String especialidad;
    private final int ingreso;

    public Medico(int cedula, String nombre, String especialidad, int ingreso) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.ingreso = ingreso;

    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    public int getIngreso() {
        return ingreso;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    public String imprimir() {
        return (Integer.toString(this.cedula) + "," + this.nombre);
    }

    public String imprimirDatos() {
        return (Integer.toString(this.cedula) + "," + this.nombre + "," + this.especialidad + "," + this.getIngreso());
    }

}
