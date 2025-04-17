package Ex2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class CadastroMoradores {

    private List<Moradores> moradores;

    public CadastroMoradores(){         //construtor de configuração, ao invés de inicializar os atributos ele apenas cria o arraylist
        moradores = new ArrayList<>();
    }

    public void cadastrarMoradores(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nQuantos Moradores deseja cadastar? ");
        int quantidade = Integer.parseInt(sc.nextLine());

        for (int i=0; i<quantidade; i++){
            System.out.println("Cadastro do morador " + (i+1) + ":");

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

            Moradores morador = new Moradores(nome,cpf,celular,dataNascimento,sexo,bloco,apartamento,codigo);
            moradores.add(morador);

            System.out.println(morador);

        }

        sc.close();


    }


}
