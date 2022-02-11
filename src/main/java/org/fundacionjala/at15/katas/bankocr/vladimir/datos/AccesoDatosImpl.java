package org.fundacionjala.at15.katas.bankocr.vladimir.datos;

import java.io.*;

import org.fundacionjala.at15.katas.bankocr.vladimir.excepciones.LecturaDatosEx;
public class AccesoDatosImpl {
    public String [] listar(String nombreRecurso) throws LecturaDatosEx {
        var archivo = new File(nombreRecurso);
        String [] subLine=new String[3];
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea=null;
            int cont=0;
            /*int ini=0,fin=3;
            for (int i = 0; i < 9; i++) {
                cont=0;
                linea= entrada.readLine();
                while (linea!=null) {
                    subNumber[cont]=linea.substring(ini, fin);
                    linea= entrada.readLine();
                    cont++;
                }
                var numero=new NumberReaded(subNumber);
                numeros[i]=numero;
                ini=ini+3;
                fin=fin+3;
            }        */
            cont=0;
                linea= entrada.readLine();
                while (linea!=null) {
                    subLine[cont]=linea;
                    linea= entrada.readLine();
                    cont++;
                }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar numeros: "+ ex.getMessage());
        } catch (IOException ex) {
            throw new LecturaDatosEx("Excepcion al listar numeros: "+ ex.getMessage());
        }
        return subLine;
    }
}
