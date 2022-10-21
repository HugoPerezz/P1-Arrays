import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int[] numeros = new int[10];



        for(int i = 0; i < numeros.length; i++){
            Scanner declararNumeros = new Scanner(System.in);
            System.out.println("Escriu un número: ");
            numeros[i] = declararNumeros.nextInt();

    }
        for(int i = 0; i< numeros.length; i++){
            if(numeros[i]< 0){
                System.out.println("El número " + numeros[i] + " és més petit que 0.");
            } else if (numeros[i] == 0) {
                System.out.println("El número " + numeros[i] + " és igual que 0.");
            } else if (numeros[i] > 0) {
                System.out.println("El número " + numeros[i] + " és major que 0.");

            }
        }

    }
}
