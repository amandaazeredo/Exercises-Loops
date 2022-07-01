import java.util.Scanner;

public class WhileDoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int max = 10;

        System.out.println("Contando até: " + max);

        while (i <= max) { // primeiro avalia a condição para depois executa-la, se for falsa não executa
                           // nenhuma vez

            System.out.println("O valor de i é: " + i);
            i++;

            System.out.println("Valor final de i: " + i);
        }

        do { // realiza a operação pelo menos uma vez, pois avalia a condição depois de já
             // ter realizado a operação

            i++;
            System.out.println("O valor de i é: " + i);
        } while (i < 15);
        System.out.println("Valor final de i: " + i);

        sc.close();

    }
}