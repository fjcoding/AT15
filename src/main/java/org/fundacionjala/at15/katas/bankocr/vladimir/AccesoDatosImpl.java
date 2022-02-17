package org.fundacionjala.at15.katas.bankocr.vladimir;

import java.io.*;

public class AccesoDatosImpl {
    public static final int TAM = 3;
    public String[] listar(String nombreRecurso) throws AccesoDatosEx {
        File archivo = new File(nombreRecurso);
        String[] subLine = new String[TAM];
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            int cont = 0;
            linea = entrada.readLine();
            while (linea != null) {
                subLine[cont] = linea;
                linea = entrada.readLine();
                cont++;
            }
            entrada.close();
        } catch (IOException ex) {
            throw new AccesoDatosEx("Excepcion al listar numeros: " + ex.getMessage());
        }
        return subLine;
    }
}
