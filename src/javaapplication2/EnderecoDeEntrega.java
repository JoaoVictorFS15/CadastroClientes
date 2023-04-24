/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author João
 */
public class EnderecoDeEntrega {
    
    private String cep;
    private String endereco;
    private String estado;
    private String cidade;
    private String bairro;
    private Pessoa enderecoPessoa;

 
    
    public EnderecoDeEntrega(String cep, String endereco, String estado, String cidade, String bairro, Pessoa enderecoPessoa) {
        this.cep = cep;
        this.endereco = endereco;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.enderecoPessoa = enderecoPessoa;
    }
    
    public EnderecoDeEntrega(){}
    
       public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Pessoa getEnderecoPessoa() {
        return enderecoPessoa;
    }

    public void setEnderecoPessoa(Pessoa enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }
    
}
