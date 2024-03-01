public class Persona {

    private String nombre;
    private String matricula;

    public Persona(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public static void main(String[] args) {

        Persona persona1 = new Persona("JOse Eduardo Puc Dzib", "8346");

        System.out.println("Alumno Itescam 1:");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Matrícula: " + persona1.getMatricula());
        System.out.println();
        
    }

}


