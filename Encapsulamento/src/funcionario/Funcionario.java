package funcionario;

public class Funcionario {
private String nome;
private String endereco;
private ContaBancaria contaBanco;

    public Funcionario(String nome, String endereco, ContaBancaria contaBanco) {
        this.nome = nome;
        this.endereco = endereco;
        this.contaBanco = contaBanco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ContaBancaria getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(ContaBancaria contaBanco) {
        this.contaBanco = contaBanco;
    }




}
