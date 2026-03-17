public class App {

    private static CPIFP cpifp;
    private static Profesor profesor1;
    private static Profesor profesor2;
    private static Profesor profesor3;
    private static Profesor profesor4;
    private static Estudiante estudiante1;
    private static Estudiante estudiante2;
    private static Estudiante estudiante3;
    private static Departamento departamento1;
    private static Departamento departamento2;
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        CargarDatos();
        imprimirDatos();
    }

    private static void CargarDatos() {
        cpifp = new CPIFP("Alan Turing", "C. Frederick Terman, 3, Campanillas, 29590 Málaga", "951 04 04 49");
        
        estudiante1 = new Estudiante("Paco Paqueras", "12345678A");
        estudiante2 = new Estudiante("Fran Lucena", "12345678B");
        estudiante3 = new Estudiante("Luca Peluca", "12345678C");

        cpifp.añadirEstudiante(estudiante1);
        cpifp.añadirEstudiante(estudiante2);
        cpifp.añadirEstudiante(estudiante3);

        
        profesor1 = new Profesor("Juan Carlos", 1);
        profesor2 = new Profesor("Javier Bernal", 2);
        profesor3 = new Profesor("Sergio Rodíguez", 3);
        profesor4 = new Profesor("Jorge Vazquez", 4);

        departamento1 = new Departamento("Ciber", profesor1);
        departamento2 = new Departamento("Redes", profesor3);

        departamento1.añadirProfesor(profesor1);
        departamento1.añadirProfesor(profesor2);
        departamento2.añadirProfesor(profesor3);
        departamento2.añadirProfesor(profesor4);

        cpifp.añadirDepartamento(departamento1);
        cpifp.añadirDepartamento(departamento2);

        cpifp.listarDepartamentos();
    }

    private static void imprimirDatos(){
        System.out.println("Departamento: " + departamento1.getNombre());
        System.out.println("Jefe: "+ departamento1.getJefeDepartamento());

        System.out.println("Departamento: " + departamento2.getNombre());
        System.out.println("Jefe: "+ departamento2.getJefeDepartamento());
    }
}