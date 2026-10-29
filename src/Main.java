import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // jogador 1
        jogador jogador1 = new jogador();

        System.out.println("Cadastro do joagdor 1");

        System.out.println("Digite o nome: ");
        jogador1.nome = scanner.nextLine();

        System.out.println("Digite a nick: ");
        jogador1.nick = scanner.nextLine();

        System.out.println("Digite a idade: ");
        jogador1.idade = scanner.nextInt();
        scanner.nextLine(); //limpa o Enter que sobrou

        System.out.println("Digite o jogo favorito: ");
        jogador1.jogoFavorito = scanner.nextLine();

        System.out.println("Digite o nivel (1 a 100): ");
        jogador1.nivel = scanner.nextInt();
        scanner.nextLine();

        System.out.println();


        // jogador 2
        jogador jogador2 = new jogador();

        System.out.println("cadastro do jogador 2");

        System.out.println("digite o nome: ");
        jogador2.nome = scanner.nextLine();

        System.out.println("Digite o nick: ");
        jogador2.nick = scanner.nextLine();

        System.out.println("digite a idade: ");
        jogador2.idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o jogo favorito: ");
        jogador2.jogoFavorito = scanner.nextLine();

        System.out.println("Digite o nivel (1 a 100): ");
        jogador2.nivel = scanner.nextInt();
        scanner.nextLine();

        System.out.println();


        // Ficha dos Jogadores
        System.out.println("FICHA DO JOGADOR");
        System.out.println("nome: " + jogador1.nome);
        System.out.println("nick: " + jogador1.nick);
        System.out.println("idade: " + jogador1.idade);
        System.out.println("jogo favorito: " + jogador1.jogoFavorito);
        System.out.println("nivel: " + jogador1.nivel);
        System.out.println();

        System.out.println("FICHA DO JOGADOR");
        System.out.println("nome: " + jogador2.nome);
        System.out.println("nick: " + jogador2.nick);
        System.out.println("idade: " + jogador2.idade);
        System.out.println("jogo favorito: " + jogador2.jogoFavorito);
        System.out.println("nivel: " + jogador2.nivel);

        scanner.close();


    }
}
