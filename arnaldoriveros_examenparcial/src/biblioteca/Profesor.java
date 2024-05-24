package biblioteca;

public class Profesor extends Persona {
    private String especialidad;

    // Constructor
    public Profesor(int cedula, String nombreApellido, String correo, String telefono, String especialidad) {
        super(cedula, nombreApellido, correo, telefono);
        this.especialidad = especialidad;
    }

    // Getters and Setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor [especialidad=" + especialidad + ", " + super.toString() + "]";
    }
}
