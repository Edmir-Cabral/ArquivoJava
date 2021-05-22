/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoarquivo;


/**
 *
 * @author EDI_JANE
 */
public class Aplicacao {

    public static void main(String[] args) {
        String caminho = "arquivo.txt";
        Endereco end = new Endereco();
        Pessoa p1 = new Pessoa("Edmir", 34, "5555555", end);
        
        
        
        boolean gravou = ManipulaArquivo.gravarObjeto(p1, caminho);
        Object obj = ManipulaArquivo.recuperarObjeto(caminho);
        
        System.out.println(obj);
        
        
    }

    

}

