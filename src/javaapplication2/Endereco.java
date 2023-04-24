/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

/**
 *
 * @author alunoti
 */
public class Endereco {
    private String cep;
    private String endereco;
    private String estado;
    private String cidade;
    private String bairro;
    private String numero;
    private String complemento;
    private Pessoa enderecoPessoa;

    public Endereco(String cep, String endereco, String estado, String cidade, String bairro, String numero, String complemento, Pessoa enderecoPessoa) {
        this.cep = cep;
        this.endereco = endereco;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
        this.enderecoPessoa = enderecoPessoa;
    }
    
    
    public Endereco (){}

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Pessoa getEnderecoPessoa() {
        return enderecoPessoa;
    }

    public void setEnderecoPessoa(Pessoa enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }




}
