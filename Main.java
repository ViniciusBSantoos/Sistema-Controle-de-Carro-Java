import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();

        int opcao;

        do {
            System.out.println("\n=== MENU CARRO ===");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Frear");
            System.out.println("5 - Trocar marcha");
            System.out.println("6 - Virar esquerda");
            System.out.println("7 - Virar direita");
            System.out.println("8 - Ver velocidade");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1: carro.ligar(); break;
                case 2: carro.desligar(); break;
                case 3: carro.acelerar(); break;
                case 4: carro.frear(); break;

                case 5:
                    System.out.print("Digite a marcha (0 a 6): ");
                    int marcha = scanner.nextInt();
                    carro.trocarMarcha(marcha);
                    break;

                case 6: carro.virar("esquerda"); break;
                case 7: carro.virar("direita"); break;
                case 8: carro.consultarVelocidade(); break;

                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}