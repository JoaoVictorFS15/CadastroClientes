/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

import java.util.Calendar;

/**
 *
 * @author alunoti
 */
public class PessoaFisica extends Pessoa {
    private String rg;
    private String cpf;
    private String emailPessoal;

    public PessoaFisica(String rg, String cpf, String emailPessoal) {
        this.rg = rg;
        this.cpf = cpf;
        this.emailPessoal = emailPessoal;
    }

    public PessoaFisica(String nome, String TelefoneRes, String celular, String DataDeNasc, String sexo, String Observasao, double limiteDeCredito, String rg, String cpf, String emailPessoal, String Tipo) {
        super(nome, TelefoneRes, celular, DataDeNasc, sexo, Observasao, limiteDeCredito, Tipo);
        this.rg = rg;
        this.cpf = cpf;
        this.emailPessoal = emailPessoal;
    }
   public PessoaFisica(){}

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmailPessoal() {
        return emailPessoal;
    }

    public void setEmailPessoal(String emailPessoal) {
        this.emailPessoal = emailPessoal;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }







    

}
