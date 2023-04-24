/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;



/**
 *
 * @author alunoti
 */
public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String razaoSocial;
    private String emailPessoal;

    public PessoaJuridica(String cnpj, String razaoSocial, String emailPessoal) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.emailPessoal = emailPessoal;
    }

    public PessoaJuridica(String nome, String TelefoneRes, String celular, String DataDeNasc, String sexo, String Observasao, double limiteDeCredito, String cnpj, String razaoSocial, String emailPessoal, String Tipo) {
        super(nome, TelefoneRes, celular, DataDeNasc, sexo, Observasao, limiteDeCredito, Tipo);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.emailPessoal = emailPessoal;
    }
    
    public PessoaJuridica(){}

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmailPessoal() {
        return emailPessoal;
    }

    public void setEmailPessoal(String emailPessoal) {
        this.emailPessoal = emailPessoal;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }





    



}
