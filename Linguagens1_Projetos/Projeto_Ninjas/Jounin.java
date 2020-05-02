public class Jounin extends RankedNinja {
    public Jounin(String name, String family, Mission mission) {
        super(name, family,mission);    
    }
    @Override
    public void train(){
        System.out.println("Treinando para "+mission);
    }
}