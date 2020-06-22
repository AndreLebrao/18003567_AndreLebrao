package br.maua.interfaces;

public interface LerNumero {
    /**
     * 
     * @param numString String que se deseja converter para um numero inteiro
     * @return o numero inteiro parseado para int, em caso de erro retorna 9999
     */
    public static int lerInt(String numString) {
        try {
            return Integer.parseInt(numString);
        } catch (Exception e) {
            return 9999;
        }
    }
    /**
     * 
     * @param numString String que se deseja converter para um double
     * @return um numero parseado para double, em caso de erro retorna 0
     */
    public static double lerDouble(String numString) {
        try {
            return Integer.parseInt(numString);
        } catch (Exception e) {
            return 0;
        }
    }
}