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
public class Pessoa implements Serializable{
    private String nome;
    private int idade;
    private String CPF;
    private Endereco end;

    public Pessoa() {
    }
    
    public Pessoa(String nome, int idade, String CPF, Endereco end) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.end = end;
    }

    
    
    @Override
    public String toString(){
        return  "\nNome = "+getNome()+
                "\nIdade = "+getIdade()+
                "\nCPF = "+getCPF()+
                "\n"+getEndereco().toString();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public Endereco getEndereco(){
        return end;
    }
    public void setEndereco(Endereco end){
        this.end = end;
    }
}
