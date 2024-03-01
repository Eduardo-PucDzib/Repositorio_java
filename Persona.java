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
	Persona persona2 = new Persona("Edgar uriel uc tun", "8560");

        System.out.println("Alumno Itescam 1:");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Matrícula: " + persona1.getMatricula());
        System.out.println();
	
	System.out.println("Alumno itescam 2");
	System.out.println("Nombre: " + persona2.getNombre());
	System.out.println("Matrícula: " + persona2.getMatricula());
	System.out.println();

    }

}


