public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();;
        persona.setNombre("Mario");
        System.out.println("Mi nombre es " + persona.getterNombre());
        persona.setEdad(26);
        System.out.println("Tengo " + persona.getEdad() + " años");
        persona.setTelefono(123456890);
        System.out.println("Mi telefono es " + persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getterNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}