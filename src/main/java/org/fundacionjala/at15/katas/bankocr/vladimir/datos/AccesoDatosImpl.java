package org.fundacionjala.at15.katas.bankocr.vladimir.datos;

import java.io.*;

import org.fundacionjala.at15.katas.bankocr.vladimir.excepciones.LecturaDatosEx;

public class AccesoDatosImpl {
    public static final int TAM = 3;
    public String[] listar(String nombreRecurso) throws LecturaDatosEx {
        File archivo = new File(nombreRecurso);
        String[] subLine = new String[TAM];
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            int cont = 0;
            cont = 0;
            linea = entrada.readLine();
            while (linea != null) {
                subLine[cont] = linea;
                linea = entrada.readLine();
                cont++;
            }
            entrada.close();
        } catch (IOException ex) {
            throw new LecturaDatosEx("Excepcion al listar numeros: " + ex.getMessage());
        }
        return subLine;
    }
}
