public class Posgrado extends Estudiante  {
    private String modalidad;

    public Posgrado(String modalidad, String nombre, int edad, String programa, String tipo_etnia) {
        super(nombre, edad, programa, tipo_etnia);
        this.modalidad = modalidad;
    }
    
    @Override
    public String toString(){
        return "\tEstudiante Posgrado" + "\n" +
        super.toString() + "\n" +
        "\tModalidad: " + modalidad + "\n";        
    }
    
    
}
