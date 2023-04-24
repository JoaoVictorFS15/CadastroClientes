/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;



/**
 *
 * @author alunoti
 */
public class Pessoa {
     private String nome;
     private String TelefoneRes;
     private String celular;
     private String DataDeNasc;
     private String sexo;
     private String Observasao;
     private double limiteDeCredito;
     private String Tipo;

 

    public Pessoa(String nome, String TelefoneRes, String celular, String DataDeNasc, String sexo, String Observasao, double limiteDeCredito, String Tipo) {
        this.nome = nome;
        this.TelefoneRes = TelefoneRes;
        this.celular = celular;
        this.DataDeNasc = DataDeNasc;
        this.sexo = sexo;
        this.Observasao = Observasao;
        this.limiteDeCredito = limiteDeCredito;
        this.Tipo = Tipo;
        
    }

   public Pessoa (){}

    public String getDataDeNasc() {
        return DataDeNasc;
    }

    public void setDataDeNasc( String DataDeNasc) {
        this.DataDeNasc = DataDeNasc;
    }

    public String getObservasao() {
        return Observasao;
    }

    public void setObservasao(String Observasao) {
        this.Observasao = Observasao;
    }

    public String getTelefoneRes() {
        return TelefoneRes;
    }

    public void setTelefoneRes(String TelefoneRes) {
        this.TelefoneRes = TelefoneRes;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

  public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }



}
