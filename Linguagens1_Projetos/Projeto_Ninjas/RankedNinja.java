public class RankedNinja extends Ninja {
    protected Mission mission;
    protected String rank;

    //Construtor do RankedNinja
    public RankedNinja(String name, String family, Mission mission){
        super(name, family);
        this.mission = mission;
    }

    public boolean goToMission(Mission mission){
        if (this.rank.contains(mission.getRankMission()))
            return true;
        else
        return false;
    }

    @Override
    public void train(){
        System.out.println("No pain no gain");
    }
}