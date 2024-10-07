public class Persona {
    String nombre;
    int edad;
    String genero;

    public void presentarse() {
        System.out.println("---INFORMACION PERSONA---");
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.edad = 25;
        persona1.genero = "Masculino";

        Persona persona2 = new Persona();
        persona2.nombre = "María";
        persona2.edad = 30;
        persona2.genero = "Femenino";

        persona1.presentarse();
        persona2.presentarse();
    }
}
