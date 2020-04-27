
public class Peixe extends Animal implements Locomover{

    @Override
    public void comer() {
        System.out.println("Bolhas bolhas...");
    }

    @Override
    public void comoMeLocomovo() {
        System.out.println("nadando");
    }
    
}