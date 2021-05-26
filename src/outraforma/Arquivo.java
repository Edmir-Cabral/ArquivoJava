/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outraforma;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EDI_JANE
 */
public class Arquivo {

    
    public static void gravaObj(ArrayList user) {
        File file = new File("novo.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            
            ObjectOutputStream outPut = new ObjectOutputStream(new FileOutputStream(file, true));
            outPut.writeObject(user);
            outPut.writeObject("\n");
            outPut.flush();
            outPut.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void lerObj() {
        try {
            File file = new File("novo.txt");
            ObjectInputStream inPut = new ObjectInputStream(new FileInputStream(file));
            List<Object> user = (List<Object>) inPut.readObject();
            user.forEach(object -> {
                System.out.println(object);
            });
        
                       
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
