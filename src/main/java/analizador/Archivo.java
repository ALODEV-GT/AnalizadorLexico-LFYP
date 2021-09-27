package analizador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

public class Archivo {

    private ArrayList<String> listaLineasArchivo = new ArrayList();
    
    public Archivo(File archivo){
        this.listarLineasArchivo(archivo);
    }
    
    public Archivo(){
        
    }

    private void listarLineasArchivo(File archivo) {

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea = lector.readLine();
            while (linea != null) {
                listaLineasArchivo.add(linea);
                linea = lector.readLine();
            }
            lector.close();
        } catch (FileNotFoundException ex) {
            //
        } catch (IOException ex) {
            //
        }
    }

    public void mostrarLineas(JTextArea taCodigoFuente) {
        taCodigoFuente.setText("");
        for (String linea : listaLineasArchivo) {
            taCodigoFuente.append(linea+"\n");
        }
    }
    
    public boolean guardarArchivo(File archivo, String documento){
        FileOutputStream salida;
        boolean guardado = false;
        try{
            salida = new FileOutputStream(archivo);
            byte[] bytxt = documento.getBytes();
            salida.write(bytxt);
            guardado = true;
        }catch(FileNotFoundException ex){
            //Error
        } catch (IOException ex) {
            //Error
        }
        return guardado;
    }

}
