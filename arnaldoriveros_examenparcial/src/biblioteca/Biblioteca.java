package biblioteca;

public class Biblioteca {
    String nombre, horario;
    int numero_prestamos = 0;
    Material[] material = null;
    Persona[] persona = null;
    Prestamo[] prestamo = null;

    public Biblioteca() {
        nombre = "SuperBiblio";
        horario = "LUNES A VIERNES DE 8 a 15";
        material = new Material[1];
        persona = new Persona[1];
        prestamo = new Prestamo[10];  // Ajusta el tamaño según sea necesario

        material[0] = new Libro(123, "Julio Verne", "Viaje Al Interior de la Tierra", 1970, "disponible", "96325");
        persona[0] = new Alumno(462, "Rafael", "0973407779", "rafaelriver666@gail.com", 1000);

        prestarMaterial(material[0], persona[0]);
        verMaterialesPrestados();
    }

    private void verMaterialesPrestados() {
        for (int i = 0; i < numero_prestamos; i++) {
            System.out.println(prestamo[i].toString());
        }
    }

    private void prestarMaterial(Material m, Persona p) {
        prestamo[numero_prestamos] = new Prestamo(m, p, "24/05/24", 7);
        numero_prestamos++;
        m.setEstado("Prestado");
    }

    public static void main(String[] args) {
        new Biblioteca();
    }
}
