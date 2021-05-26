/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoarquivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author EDI_JANE
 */
public class ManipulaArquivo {

    public static boolean gravarObjeto(Object obj, String caminho) {
        File arquivo = new File(caminho);
        if(!arquivo.exists()){
            try {
                arquivo.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        try {
            FileOutputStream fileOutput = new FileOutputStream(arquivo, true);
            ObjectOutputStream objOutput = new ObjectOutputStream(fileOutput);
            
            objOutput.writeObject(obj);
            objOutput.flush();
            fileOutput.flush();
            
            objOutput.close();
            fileOutput.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
        return true;
    }

    public static Object recuperarObjeto(String caminho) {
        File arquivo = new File(caminho);
        try {
            FileInputStream fileInput = new FileInputStream(arquivo);
            ObjectInputStream objInput = new ObjectInputStream(fileInput);
            
            List<Object> retorno = (List<Object>)objInput.readObject();
            
            for (Object object : retorno) {
                System.out.println(object);
                
            }
            
            objInput.close();
            fileInput.close();
            
            return retorno;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
