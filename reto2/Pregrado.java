public class Pregrado extends Estudiante {
    private int cantidad_creditos;

    public Pregrado(int cantidad_creditos, String nombre, int edad, String programa, String tipo_etnia) {
        super(nombre, edad, programa, tipo_etnia);
        this.cantidad_creditos = cantidad_creditos;
    }
    
    public String toString(){
        return "\tEstudiante Pregrado" + "\n" +
        super.toString() + "\n" +
        "\tCreditos aprobados: " + cantidad_creditos + "\n";
    }
}
