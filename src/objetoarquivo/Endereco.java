/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoarquivo;

import java.io.Serializable;

/**
 *
 * @author EDI_JANE
 */
public class Endereco implements Serializable{
    private String CEP;
    private String cidade;
    private String bairro;
    private int numero;
    private String UF;
    private String complemento;

    public Endereco() {
    }

    public Endereco(String CEP, String cidade, String bairro, int numero, String UF, String complemento) {
        this.CEP = CEP;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.UF = UF;
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return  "Endereço"+
                "\nCEP = " +getCEP()+ 
                "\nCidade = "+getCidade()+
                "\nUF = "+getUF()+
                "\nBairro = "+getBairro()+ 
                "\nNúmero = "+getNumero()+ 
                "\nComplemento = "+getComplemento();
    }
    

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    
    
    
}
