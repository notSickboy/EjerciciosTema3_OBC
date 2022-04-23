public class Main {
    public static void main(String[] args) {

        suma_tres_numeros(10,20,30);

        int miCoche = 2;
        miCoche = Coche.incrementar_puerta(miCoche);
        System.out.println("Las puertas que tiene mi coche son " + miCoche);
    }
    public static void suma_tres_numeros (int a, int b, int c){
        int resultado = a + b + c;
        System.out.println("La suma de los tres numeros es " + resultado);
    }
}