package org.fundacionjala.at15.katas.bankocr.vladimir;

import java.util.Arrays;

public class MostrarDatosImpl {
    private final AccesoDatosImpl datos;
    private final String nombreRecurso = "src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCR.txt";
    private static final int TAM = 3;
    private static final int CASE0 = 0;
    private static final int CASE1 = 1;
    private static final int CASE2 = 2;
    private static final int CASE3 = 3;
    private static final int CASE4 = 4;
    private static final int CASE5 = 5;
    private static final int CASE6 = 6;
    private static final int CASE7 = 7;
    private static final int CASE8 = 8;
    private static final int CASE9 = 9;
    private static final int SUBSTR0 = 0;
    private static final int SUBSTR3 = 3;
    private static final int SUBSTR6 = 6;
    private static final int SUBSTR9 = 9;
    private static final int SUBSTR12 = 12;
    private static final int SUBSTR15 = 15;
    private static final int SUBSTR18 = 18;
    private static final int SUBSTR21 = 21;
    private static final int SUBSTR24 = 24;
    private static final int MOD11 = 11;

    public MostrarDatosImpl() {
        this.datos = new AccesoDatosImpl();
    }

    public String[] listarNumeros() {
        String[] numeros = new String[CASE3];
        try {
            numeros = this.datos.listar(nombreRecurso);
        } catch (AccesoDatosEx e) {
            e.printStackTrace();
        }
        return numeros;
    }

    public String[] convertirOcr(int ent) {
        String[] subNum = new String[TAM];
        try {
            String[] numeros = this.datos.listar(nombreRecurso);
            switch (ent) {
                case CASE9:
                    for (int ind = 0; ind < TAM; ind++) {
                        subNum[ind] = numeros[ind].substring(SUBSTR0, SUBSTR3);
                    }
                    break;
                case CASE8:
                    for (int ind = 0; ind < TAM; ind++) {
                        subNum[ind] = numeros[ind].substring(SUBSTR3, SUBSTR6);
                    }
                    break;
                case CASE7:
                    for (int ind = 0; ind < TAM; ind++) {
                        subNum[ind] = numeros[ind].substring(SUBSTR6, SUBSTR9);
                    }
                    break;
                case CASE6:
                    for (int ind = 0; ind < TAM; ind++) {
                        subNum[ind] = numeros[ind].substring(SUBSTR9, SUBSTR12);
                    }
                    break;
                case CASE5:
                    for (int ind = 0; ind < TAM; ind++) {
                        subNum[ind] = numeros[ind].substring(SUBSTR12, SUBSTR15);
                    }
                    break;
                case CASE4:
                    for (int ind = 0; ind < TAM; ind++) {
                        subNum[ind] = numeros[ind].substring(SUBSTR15, SUBSTR18);
                    }
                    break;
                case CASE3:
                    for (int ind = 0; ind < TAM; ind++) {
                        subNum[ind] = numeros[ind].substring(SUBSTR18, SUBSTR21);
                    }
                    break;
                case CASE2:
                    for (int ind = 0; ind < TAM; ind++) {
                        subNum[ind] = numeros[ind].substring(SUBSTR21, SUBSTR24);
                    }
                    break;
                case CASE1:
                    for (int ind = 0; ind < TAM; ind++) {
                        subNum[ind] = numeros[ind].substring(SUBSTR24);
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso datos");
            ex.printStackTrace(System.out);
        }
        return subNum;
    }

    public String convesion() {
        String numCta = "";
        for (int ind = CASE9; ind >= 1; ind--) {
            if (Arrays.equals(convertirOcr(ind), NumeroLeido.getCero())) {
                numCta = numCta + "0";
            } else if (Arrays.equals(convertirOcr(ind), NumeroLeido.getUno())) {
                numCta = numCta + "1";
            } else if (Arrays.equals(convertirOcr(ind), NumeroLeido.getDos())) {
                numCta = numCta + "2";
            } else if (Arrays.equals(convertirOcr(ind), NumeroLeido.getTres())) {
                numCta = numCta + "3";
            } else if (Arrays.equals(convertirOcr(ind), NumeroLeido.getCuatro())) {
                numCta = numCta + "4";
            } else if (Arrays.equals(convertirOcr(ind), NumeroLeido.getCinco())) {
                numCta = numCta + "5";
            } else if (Arrays.equals(convertirOcr(ind), NumeroLeido.getSeis())) {
                numCta = numCta + "6";
            } else if (Arrays.equals(convertirOcr(ind), NumeroLeido.getSiete())) {
                numCta = numCta + "7";
            } else if (Arrays.equals(convertirOcr(ind), NumeroLeido.getOcho())) {
                numCta = numCta + "8";
            } else if (Arrays.equals(convertirOcr(ind), NumeroLeido.getNueve())) {
                numCta = numCta + "9";
            } else {
                numCta = numCta + "?";
            }
        }
        return numCta;
    }

    public int checkSum(String numCta) {
        int checksum = Integer.parseInt(numCta.substring(CASE0, CASE1)) * CASE9
            + Integer.parseInt(numCta.substring(CASE1, CASE2)) * CASE8
            + Integer.parseInt(numCta.substring(CASE2, CASE3)) * CASE7
            + Integer.parseInt(numCta.substring(CASE3, CASE4)) * CASE6
            + Integer.parseInt(numCta.substring(CASE4, CASE5)) * CASE5
            + Integer.parseInt(numCta.substring(CASE5, CASE6)) * CASE4
            + Integer.parseInt(numCta.substring(CASE6, CASE7)) * CASE3
            + Integer.parseInt(numCta.substring(CASE7, CASE8)) * CASE2
            + Integer.parseInt(numCta.substring(CASE8)) * CASE1;
        return checksum;
    }

    public String esCta() {
        if (convesion().contains("?")) {
            return convesion() + " ILL";
        } else {
            int checksum = checkSum(convesion());
            if (checksum % MOD11 == 0) {
                return convesion() + " Es Cta";
            } else {
                return convesion() + " ERR";
            }
        }
    }

    public void verifMod(String shortnum) {
        if (checkSum(shortnum) % MOD11 == 0) {
            System.out.print(shortnum + " ");
        }
    }

    public void verifModForTwo(String shortnum, String shortnum1) {
        if (checkSum(shortnum) % MOD11 == 0) {
            System.out.print(shortnum + " ");
        } else if (checkSum(shortnum1) % MOD11 == 0) {
            System.out.print(shortnum1 + " ");
        }
    }

    public void verifModForThree(String shortnum, String shortnum1, String shortnum2) {
        if (checkSum(shortnum) % MOD11 == 0) {
            System.out.print(shortnum + " ");
        } else if (checkSum(shortnum1) % MOD11 == 0) {
            System.out.print(shortnum1 + " ");
        } else if (checkSum(shortnum2) % MOD11 == 0) {
            System.out.print(shortnum2 + " ");
        }
    }

    public void err() {
        String shortnum = "";
        String shortnum1 = "";
        String shortnum2 = "";
        System.out.print(esCta() + " => ");
        for (int ind = 0; ind < CASE9; ind++) {
            if (ind == 0) {
                if (convesion().substring(ind, ind + 1).equals("1")) {
                    shortnum = "7" + convesion().substring(1);
                    verifMod(shortnum);
                } else if (convesion().substring(ind, ind + 1).equals("7")) {
                    shortnum = "1" + convesion().substring(1);
                    verifMod(shortnum);
                } else if (convesion().substring(ind, ind + 1).equals("0")) {
                    shortnum = "8" + convesion().substring(1);
                    verifMod(shortnum);
                } else if (convesion().substring(ind, ind + 1).equals("3")) {
                    shortnum = "9" + convesion().substring(1);
                    verifMod(shortnum);
                } else if (convesion().substring(ind, ind + 1).equals("5")) {
                    shortnum = "9" + convesion().substring(1);
                    shortnum1 = "6" + convesion().substring(1);
                    verifModForTwo(shortnum, shortnum1);
                } else if (convesion().substring(ind, ind + 1).equals("6")) {
                    shortnum = "8" + convesion().substring(1);
                    shortnum1 = "5" + convesion().substring(1);
                    verifModForTwo(shortnum, shortnum1);
                } else if (convesion().substring(ind, ind + 1).equals("8")) {
                    shortnum = "0" + convesion().substring(1);
                    shortnum1 = "6" + convesion().substring(1);
                    shortnum2 = "9" + convesion().substring(1);
                    verifModForThree(shortnum, shortnum1, shortnum2);
                } else if (convesion().substring(ind, ind + 1).equals("9")) {
                    shortnum = "3" + convesion().substring(1);
                    shortnum1 = "5" + convesion().substring(1);
                    shortnum2 = "8" + convesion().substring(1);
                    verifModForThree(shortnum, shortnum1, shortnum2);
                }
            } else if (ind == CASE8) {
                if (convesion().substring(ind).equals("1")) {
                    shortnum = convesion().substring(0, CASE8) + "7";
                    verifMod(shortnum);
                } else if (convesion().substring(ind).equals("7")) {
                    shortnum = convesion().substring(0, CASE8) + "1";
                    verifMod(shortnum);
                } else if (convesion().substring(ind).equals("0")) {
                    shortnum = convesion().substring(0, CASE8) + "8";
                    verifMod(shortnum);
                } else if (convesion().substring(ind).equals("3")) {
                    shortnum = convesion().substring(0, CASE8) + "9";
                    verifMod(shortnum);
                } else if (convesion().substring(ind).equals("5")) {
                    shortnum = convesion().substring(0, CASE8) + "9";
                    shortnum1 = convesion().substring(0, CASE8) + "6";
                    verifModForTwo(shortnum, shortnum1);
                } else if (convesion().substring(ind).equals("6")) {
                    shortnum = convesion().substring(0, CASE8) + "8";
                    shortnum1 = convesion().substring(0, CASE8) + "5";
                    verifModForTwo(shortnum, shortnum1);
                } else if (convesion().substring(ind).equals("8")) {
                    shortnum = convesion().substring(0, CASE8) + "0";
                    shortnum1 = convesion().substring(0, CASE8) + "6";
                    shortnum2 = convesion().substring(0, CASE8) + "9";
                    verifModForThree(shortnum, shortnum1, shortnum2);
                } else if (convesion().substring(ind).equals("9")) {
                    shortnum = convesion().substring(0, CASE8) + "3";
                    shortnum1 = convesion().substring(0, CASE8) + "5";
                    shortnum2 = convesion().substring(0, CASE8) + "8";
                    verifModForThree(shortnum, shortnum1, shortnum2);
                }
            } else {
                if (convesion().substring(ind, ind + 1).equals("1")) {
                    shortnum = convesion().substring(0, ind) + "7" + convesion().substring(ind + 1);
                    verifMod(shortnum);
                } else if (convesion().substring(ind, ind + 1).equals("7")) {
                    shortnum = convesion().substring(0, ind) + "1" + convesion().substring(ind + 1);
                    verifMod(shortnum);
                } else if (convesion().substring(ind, ind + 1).equals("0")) {
                    shortnum = convesion().substring(0, ind) + "8" + convesion().substring(ind + 1);
                    verifMod(shortnum);
                } else if (convesion().substring(ind, ind + 1).equals("3")) {
                    shortnum = convesion().substring(0, ind) + "9" + convesion().substring(ind + 1);
                    verifMod(shortnum);
                } else if (convesion().substring(ind, ind + 1).equals("5")) {
                    shortnum = convesion().substring(0, ind) + "9" + convesion().substring(ind + 1);
                    shortnum1 = convesion().substring(0, ind) + "6" + convesion().substring(ind + 1);
                    verifModForTwo(shortnum, shortnum1);
                } else if (convesion().substring(ind, ind + 1).equals("6")) {
                    shortnum = convesion().substring(0, ind) + "8" + convesion().substring(ind + 1);
                    shortnum1 = convesion().substring(0, ind) + "5" + convesion().substring(ind + 1);
                    verifModForTwo(shortnum, shortnum1);
                } else if (convesion().substring(ind, ind + 1).equals("8")) {
                    shortnum = convesion().substring(0, ind) + "0" + convesion().substring(ind + 1);
                    shortnum1 = convesion().substring(0, ind) + "6" + convesion().substring(ind + 1);
                    shortnum2 = convesion().substring(0, ind) + "9" + convesion().substring(ind + 1);
                    verifModForThree(shortnum, shortnum1, shortnum2);
                } else if (convesion().substring(ind, ind + 1).equals("9")) {
                    shortnum = convesion().substring(0, ind) + "3" + convesion().substring(ind + 1);
                    shortnum1 = convesion().substring(0, ind) + "5" + convesion().substring(ind + 1);
                    shortnum2 = convesion().substring(0, ind) + "8" + convesion().substring(ind + 1);
                    verifModForThree(shortnum, shortnum1, shortnum2);
                }
            }
        }
        System.out.println();
    }

    public void ill() {
        String shortnum = "";
        String test = "";
        System.out.print(esCta() + " => Opciones: ");
        for (int ind = 0; ind < CASE9; ind++) {
            if (ind == 0) {
                if (convesion().substring(ind, ind + 1).equals("?")) {
                    for (int indj = 0; indj <= CASE9; indj++) {
                        test = indj + convesion().substring(1);
                        if (checkSum(test) % MOD11 == 0) {
                            shortnum = test;
                            System.out.print(shortnum + " ");
                        }
                    }
                }
            } else if (ind == CASE8) {
                if (convesion().substring(ind).equals("?")) {
                    for (int indj = 0; indj <= CASE9; indj++) {
                        test = convesion().substring(0, CASE8) + indj;
                        if (checkSum(test) % MOD11 == 0) {
                            shortnum = convesion().substring(0, CASE8) + indj;
                            System.out.print(shortnum + " ");
                        }
                    }
                }
            } else {
                if (convesion().substring(ind, ind + 1).equals("?")) {
                    for (int indj = 0; indj <= CASE9; indj++) {
                        test = convesion().substring(0, ind) + indj + convesion().substring(ind + 1);
                        if (checkSum(test) % MOD11 == 0) {
                            shortnum = test;
                            System.out.print(shortnum + " ");
                        }
                    }
                }
            }
        }
        System.out.println();
    }
}
