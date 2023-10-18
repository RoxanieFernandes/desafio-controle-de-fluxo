import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            if (parametroUm >= parametroDois) {
                contar(parametroUm, parametroDois);
            } else {
                int contagem = parametroDois - parametroUm;
                for (int indice = 0; indice <= contagem; indice++) {
                    System.out.println("Imprimindo o número: " + indice);
                }
            }

        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parametro deve ser maior que o primeiro.");
        } finally {
            terminal.close();
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();

        }

    }
}