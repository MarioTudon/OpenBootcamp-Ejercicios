public class Main {
    public static void main(String[] args) {
        System.out.println("");
        CicloIf(10);
        System.out.println("");
        CicloWhile(0);
        System.out.println("");
        CicloDoWhile();
        System.out.println("");
        CicloFor();
        System.out.println("");
        CicloSwitch("invierno");
    }

    public static void CicloIf(int numeroIf){
        if(numeroIf > 0){
            System.out.println("numeroIf es positivo");
        }else if(numeroIf < 0){
            System.out.println("numeroIf es negativo");
        }else{
            System.out.println("numeroIf es cero");
        }
    }

    public static void CicloWhile(int numeroWhile){
        while(numeroWhile < 3){
            numeroWhile ++;
            System.out.println("numeroWhile = " + numeroWhile);
        }
    }

    public static void CicloDoWhile(){
        int numeroDoWhile = 3;

        do{
            System.out.println("numeroDoWhile = " + numeroDoWhile);
            numeroDoWhile ++;
        }while (numeroDoWhile < 3);
    }

    public static void CicloFor(){
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("numeroFor = " + numeroFor);
        }
    }

    public static void CicloSwitch(String estacion){

        switch (estacion){
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No existe esa estación");
        }
    }
}