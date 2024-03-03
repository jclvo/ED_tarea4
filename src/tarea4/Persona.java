package tarea4;


//Clase persona
public class Persona {
    private int edadActual;

    public Persona(int edadActual) {
        this.edadActual = edadActual;
    }

    /**
     * Calcula los años que faltan para jubilarse (67 años)
     *
     * @return Años restantes para la jubilación
     */
    public int calcularAnosHastaJubilacion() {
        int edadJubilacion = 67;
        return edadJubilacion - edadActual;
    }
}
