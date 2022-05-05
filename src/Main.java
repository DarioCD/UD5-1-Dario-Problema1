import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = "";
        float suma = 0;
        System.out.println("Introduce números o Q para salir");
        while (!menu.equals("Q")){
            menu = sc.nextLine();
            if (!Objects.equals(menu, "Q")){
                float numero = Float.parseFloat(menu);
                GenericQueue Numeros = new GenericQueue();
                Numeros.enqueue(numero);
                suma = suma + numero;
                System.out.println("Numero introducido: " + menu);
            }else{
                System.out.println("La suma es: " + suma);
            }
        }
    }
}