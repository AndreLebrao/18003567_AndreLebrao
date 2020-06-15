package br.maua.interfaces;

public interface LerNumero {
    public static int lerInt(String numString) {
        try {
            return Integer.parseInt(numString);
        } catch (Exception e) {
            return 9999;
        }
    }

    public static double lerDouble(String numString) {
        try {
            return Integer.parseInt(numString);
        } catch (Exception e) {
            return 0;
        }
    }
}