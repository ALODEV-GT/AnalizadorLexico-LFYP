package analizador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTextArea;

public class CargarArchivo {

    private ArrayList<String> listaLineasArchivo = new ArrayList();
    
    public CargarArchivo(File archivo){
        this.listarLineasArchivo(archivo);
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

}
