import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = entrada.nextInt();

            System.out.println("Digite o segundo parâmetro");
            int parametroDois = entrada.nextInt();

            contar(parametroUm, parametroDois);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Os parâmetros devem ser números.");
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws IllegalArgumentException {
        if (parametroDois <= parametroUm) {
            throw new IllegalArgumentException("O segundo parâmetro deve ser maior que o primeiro.");
        }
        
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }
}
