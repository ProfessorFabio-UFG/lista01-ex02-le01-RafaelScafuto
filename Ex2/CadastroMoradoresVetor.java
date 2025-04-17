package Ex2;

import java.util.Scanner;

public class CadastroMoradoresVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Moradores[] moradores = new Moradores[100];    //variavel moradores do tipo Moradores[] e é reservado 100 espaços na memoria
        int quantidade = 0;

        while (true) {

            System.out.println("===Cadastro do morador: ====");

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("CPF: ");
            String cpf = sc.nextLine();

            System.out.println("Celular: ");
            String celular = sc.nextLine();

            System.out.println("Data de Nascimento: ");
            String dataNascimento = sc.nextLine();

            System.out.println("Sexo: ");
            String sexo = sc.nextLine();

            System.out.println("Bloco: ");
            String bloco = sc.nextLine();

            System.out.println("Apartamento: ");
            int apartamento = sc.nextInt();
            sc.nextLine();

            System.out.println("Código de Acesso: ");
            int codigo = sc.nextInt();
            sc.nextLine();

            moradores[quantidade] = new Moradores(nome, cpf, celular, dataNascimento, sexo, bloco, apartamento, codigo);
            quantidade++;

            System.out.println("Deseja cadastrar mais um morador?  (S/N):");
            String resposta = sc.nextLine();

            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }

        }

        System.out.println("\n==== Moradores Cadastrados: ===");
        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nMorador " + (i + 1) + ":");
            System.out.println(moradores[i]);
        }


    }

}
