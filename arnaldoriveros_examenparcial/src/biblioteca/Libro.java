package biblioteca;

public class Libro extends Material {
    private String editorial;

    // Constructor
    public Libro(int codigo, String autor, String titulo, int anio, String estado, String editorial) {
        super(codigo, autor, titulo, anio, estado);
        this.editorial = editorial;
    }

    // Getters and Setters
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro [editorial=" + editorial + ", " + super.toString() + "]";
    }
}

