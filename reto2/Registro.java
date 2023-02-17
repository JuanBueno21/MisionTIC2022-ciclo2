import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Henry
 */
public class Registro {
    public static List<Estudiante> Estudiantes = new ArrayList<>();
    
    public static void agregarEstudiante(String comando){
        String[] comandoListado = comando.split("&");
        String tipo = comandoListado[1];
        String nombre = comandoListado[2];
        int edad = Integer.parseInt(comandoListado[3]);
        String programa = comandoListado[4];
        String tipo_etnia = comandoListado[5];
        
        if (tipo.equals("Posgrado")){
            String modalidad = comandoListado[6];
            Posgrado nuevoPosgrado = new Posgrado(modalidad, nombre, edad, programa, tipo_etnia);
            
            Estudiantes.add(nuevoPosgrado); 
        } else {
            int cantidad_creditos = Integer.parseInt(comandoListado[6]);
            Pregrado nuevoPregrado = new Pregrado(cantidad_creditos, nombre, edad, programa, tipo_etnia);
            
            Estudiantes.add(nuevoPregrado); 
        }
 
    }
    
    public static void listarEstudiantes(){
        System.out.println("***Listado de estudiantes***");
        
        Estudiantes.forEach((item) -> {
            
            System.out.print(item.toString());            
        }
                
        );        
        
    }
    
    public static void procesarComandos(){
        Scanner entrada = new Scanner(System.in);
        String comando = entrada.nextLine();
        char opcion = comando.charAt(0);
        
        do {
            
            switch (opcion){
                case '1':
                    agregarEstudiante(comando);
                    comando = entrada.nextLine();
                    opcion = comando.charAt(0);                    
                    break;
                case '2':
                    listarEstudiantes();
                    comando = entrada.nextLine();
                    opcion = comando.charAt(0);   
                    break;
            }
            
        } while (opcion == '1' || opcion == '2');
        
    }
    
    public static void main(String[] args) {
        procesarComandos();
    }
    
}
