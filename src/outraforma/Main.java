/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outraforma;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EDI_JANE
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        List<Contato> cont  = new ArrayList<>();
       
        cont.add(new Contato("Edmir", 33));
        cont.add(new Contato("Carlos", 33));
        
        
       
       
        //Arquivo.gravaObj((ArrayList) cont);
        Arquivo.lerObj();
        
    }
}
  
