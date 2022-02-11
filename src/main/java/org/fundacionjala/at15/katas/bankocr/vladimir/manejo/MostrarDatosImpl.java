package org.fundacionjala.at15.katas.bankocr.vladimir.manejo;
import org.fundacionjala.at15.katas.bankocr.vladimir.objeto.*;
import org.fundacionjala.at15.katas.bankocr.vladimir.excepciones.*;
import org.fundacionjala.at15.katas.bankocr.vladimir.datos.*;
import java.util.Arrays;
public class MostrarDatosImpl {
    private final AccesoDatosImpl datos;
    String NOMBRE_RECURSO="src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCR.txt";
    public MostrarDatosImpl() {
        this.datos=new AccesoDatosImpl();
    }
    public void listarNumeros() {
        try {
            var numeros = this.datos.listar(NOMBRE_RECURSO);
            for (int j = 0; j < 3; j++) {
                System.out.println(numeros[j]);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso datos");
            ex.printStackTrace(System.out);
        }
    }
    public String[] convertirOcr(int ent){
        String [] subNum=new String[3];
        try {
            var numeros = this.datos.listar(NOMBRE_RECURSO);
            switch (ent) {
                case 9:
                    for (int i = 0; i < 3; i++) {
                        subNum[i]=numeros[i].substring(0, 3);
                    }
                    break;
                case 8:
                    for (int i = 0; i < 3; i++) {
                        subNum[i]=numeros[i].substring(3, 6);
                    }
                    break;
                case 7:
                    for (int i = 0; i < 3; i++) {
                        subNum[i]=numeros[i].substring(6, 9);
                    }
                    break;
                case 6:
                    for (int i = 0; i < 3; i++) {
                        subNum[i]=numeros[i].substring(9, 12);
                    }
                    break;
                case 5:
                    for (int i = 0; i < 3; i++) {
                        subNum[i]=numeros[i].substring(12, 15);
                    }
                    break;
                case 4:
                    for (int i = 0; i < 3; i++) {
                        subNum[i]=numeros[i].substring(15, 18);
                    }
                    break;
                case 3:
                    for (int i = 0; i < 3; i++) {
                        subNum[i]=numeros[i].substring(18, 21);
                    }
                    break;
                case 2:
                    for (int i = 0; i < 3; i++) {
                        subNum[i]=numeros[i].substring(21, 24);
                    }
                    break;
                case 1:
                    for (int i = 0; i < 3; i++) {
                        subNum[i]=numeros[i].substring(24);
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            /*for (int i = 0; i < 3; i++) {
                System.out.println(subNum[i]);
            }*/
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso datos");
            ex.printStackTrace(System.out);
        }
        return subNum;
    }
    public String convesion(){
        String numCta="";
        for (int i = 9; i >= 1; i--) {
            if (Arrays.equals(convertirOcr(i), NumeroLeido.cero)) {
                numCta=numCta+"0";
            } else if (Arrays.equals(convertirOcr(i), NumeroLeido.uno)) {
                numCta=numCta+"1";
            }  else if (Arrays.equals(convertirOcr(i), NumeroLeido.dos)) {
                numCta=numCta+"2";
            }  else if (Arrays.equals(convertirOcr(i), NumeroLeido.tres)) {
                numCta=numCta+"3";
            }  else if (Arrays.equals(convertirOcr(i), NumeroLeido.cuatro)) {
                numCta=numCta+"4";
            }  else if (Arrays.equals(convertirOcr(i), NumeroLeido.cinco)) {
                numCta=numCta+"5";
            }  else if (Arrays.equals(convertirOcr(i), NumeroLeido.seis)) {
                numCta=numCta+"6";
            }  else if (Arrays.equals(convertirOcr(i), NumeroLeido.siete)) {
                numCta=numCta+"7";
            }  else if (Arrays.equals(convertirOcr(i), NumeroLeido.ocho)) {
                numCta=numCta+"8";
            }  else if (Arrays.equals(convertirOcr(i), NumeroLeido.nueve)) {
                numCta=numCta+"9";
            } else {
                numCta=numCta+"?";
            }
        }
        return numCta;
    }
    public void esCta(){
        if (convesion().contains("?")) {
            System.out.println(convesion()+" ILL");
        } else {
            int checksum=Integer.parseInt(convesion().substring(0, 1))*9+
                    Integer.parseInt(convesion().substring(1, 2))*8+
                    Integer.parseInt(convesion().substring(2, 3))*7+
                    Integer.parseInt(convesion().substring(3, 4))*6+
                    Integer.parseInt(convesion().substring(4, 5))*5+
                    Integer.parseInt(convesion().substring(5, 6))*4+
                    Integer.parseInt(convesion().substring(6, 7))*3+
                    Integer.parseInt(convesion().substring(7, 8))*2+
                    Integer.parseInt(convesion().substring(8))*1;
            if (checksum%11==0) {
                System.out.println(convesion()+" Es Cta");
            }else{
                System.out.println(convesion()+" ERR");
            }
        }
    }
}
