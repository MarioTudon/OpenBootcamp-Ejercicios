public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Diana";
        cliente.edad = 24;
        cliente.telefono = 123456789;
        cliente.credito = 12000;
        System.out.println("Me llamo " + cliente.nombre + ", tengo " + cliente.edad + " años, mi telefono es " + cliente.telefono + ", tengo un credito de $" + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Mario";
        trabajador.edad = 26;
        trabajador.telefono = 987654321;
        trabajador.salario = 25000;
        System.out.println("Me llamo " + trabajador.nombre + ", tengo " + trabajador.edad + " años, mi telefono es " + trabajador.telefono + ", mi salario es de $" + trabajador.salario);

    }
}

class Persona{
    String nombre;
    int edad;
    int telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}