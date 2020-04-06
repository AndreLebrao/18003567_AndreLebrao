/**
 * André Lebrão - 18.00356-7
 * 06/04/2020
 */
public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("All Might", "number1@hero.com", "123456");
        Usuario u2 = new Usuario("One For All", "number1@villian.com", "123456");
        Usuario u3 = new Usuario("Bakugo", "shine@hero.com", "123456");
        Conta c1 = new Conta(u1,1000);
        Conta c2 = new Conta(u2,250);
        Conta c3 = new Conta(u3,3000);
        
        System.out.println(c1.getInfo());
        System.out.println(c2.getInfo());
        System.out.println(c3.getInfo());
        
        String QR1 = Transacoes.gerarQRCode(c1, 250);
        Transacoes.realizarPagamento(c2, c1, QR1);
        Transacoes.realizarPagamento(c3, c1, QR1);
        Transacoes.realizarPagamento(c2, c1, QR1);
        String QR2 = Transacoes.gerarQRCode(c2, 1000);
        Transacoes.realizarPagamento(c3, c2, QR2);

        System.out.println(c1.getInfo());
        System.out.println(c2.getInfo());
        System.out.println(c3.getInfo());
    }
}