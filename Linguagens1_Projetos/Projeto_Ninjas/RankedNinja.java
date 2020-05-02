public class RankedNinja extends Ninja {
    protected Mission mission;
    protected String rank;

    //Construtor do RankedNinja
    public RankedNinja(String name, String family, Mission mission){
        super(name, family);
        this.mission = mission;
    }

    public void goToMission(){
        System.out.println("Indo para missao:" + mission.getObjetivo());
    }
    @Override
    public void train(){
        System.out.println("No pain no gain");
    }
}