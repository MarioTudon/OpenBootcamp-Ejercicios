public class Main {
    public static void main(String[] args) {
        int resultado = suma(1,2,3);
        System.out.println("El resultado de la suma es " + resultado);
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println("El coche tiene " + miCoche.numeroDePuertas + " puertas");
    }

    public static int suma(int a, int b, int c) {
        return (a + b + c);
    }
}

class Coche{
    int numeroDePuertas = 3;

    public void AgregarPuerta(){
        numeroDePuertas ++;
    }
}