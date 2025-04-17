package Ex2;

public class Moradores {

    private String nome;
    private String cpf;
    private String celular;
    private String dataNascimento;
    private String sexo;
    private String bloco;
    private int apartamento;
    private int codigo;

    Moradores(String nome, String cpf, String celular, String dataNascimento, String sexo, String bloco, int apartamento, int codigo) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.bloco = bloco;
        this.apartamento = apartamento;
        this.codigo = codigo;
    }

    public String toString(){
        return "\nDADOS DO MORADOR CADASTRADO:" + "\n" + "Nome: " + nome + ", CPF: " + cpf +
                ", N° Celular: " + celular + ", Data de Nascimento: " + dataNascimento +
                ", Sexo: " + sexo + "\nBloco: " + bloco + ", apartamento: " + apartamento +
                ", Código: " + codigo + "\n";
    }
}
