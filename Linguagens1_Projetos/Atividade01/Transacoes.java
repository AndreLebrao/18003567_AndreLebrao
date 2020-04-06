import java.util.Random;

/**
 * André Lebrão - 18.00356-7 06/04/2020
 */
public class Transacoes {

    public static String gerarQRCode(Conta conta, double valor){
        int idConta = conta.getIdConta();
        String nome = conta.getUserNome();
        int idTransacao = getRandomNumberInRange(1000, 9999);
        return String.format("%d;%s;%.2f;%d",idConta,nome,valor,idTransacao);
    }

    public static void realizarPagamento(Conta pagador, Conta recebedor, String QRCode){
        String[] dados = QRCode.split(";");

        int idRecebedor = Integer.parseInt(dados[0]);
        String nome = dados[1];
        double valor = Double.parseDouble(dados[2].replace(",","."));
        int idTransacao = Integer.parseInt(dados[3]);

        if (valor<=pagador.getSaldo()){
            boolean sacou = pagador.sacar(valor);
            recebedor.depositar(valor);
            System.out.println("Pagamento realizado!");
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    private static int getRandomNumberInRange(int min, int max) {
    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
}
}