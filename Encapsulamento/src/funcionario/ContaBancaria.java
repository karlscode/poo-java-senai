package funcionario;

public class ContaBancaria {

    private String banco;
    private int conta;
    private int agencia;

    public ContaBancaria(String banco, int conta, int agencia) {
        this.banco = banco;
        this.conta = conta;
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    
}
