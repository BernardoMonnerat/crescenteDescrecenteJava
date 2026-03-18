import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        crescenteDecrescente();
    }

    public static void crescenteDecrescente() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu nome de usuario: ");
        String name = sc.nextLine();

        System.out.println("Insira um numero positivo:");
        int n = sc.nextInt();

        // 1. Exibir de 0 a n (Crescente)
        System.out.println("--- Crescente ---");
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        // 2. Exibir de n a 0 (Decrescente)
        System.out.println("--- Decrescente ---");
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }

        // 3. Regra do Nome
        System.out.println("--- Nome ---");
        if (name.length() > 6) {
            // Exibe n vezes
            for (int i = 0; i < n; i++) {
                System.out.println(name);
            }
        } else {
            // Exibe somente 1 vez
            System.out.println(name);
        }

        sc.close(); // Boa prática fechar o scanner
    }

}
