/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("Santander", 2552, 585);
        Funcionario funcionario = new Funcionario("Marta", "Rua A", contaBancaria);
        
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Banco: " + funcionario.getContaBanco().getBanco());
        System.out.println("Conta banco: " + funcionario.getContaBanco().getConta());
        
        
    }
}
