public class SpecialJounin extends RankedNinja {
    public SpecialJounin(String name, String family, Mission mission) {
        super(name, family,mission);
        this.rank = "AB";
    }
    @Override
    public void train(){
        System.out.println("Treinando para "+mission);
    }
}