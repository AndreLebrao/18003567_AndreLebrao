/**
 * Mission
 */
public class Mission {

    private String rankMission;
    private String descricao;
    private String objetivo;
    private String local;

    public Mission(String rankMission, String descricao, String objetivo, String local) {
        this.rankMission = rankMission.toUpperCase();
        this.descricao = descricao;
        this.objetivo = objetivo;
        this.local = local;
    }

    public void getSummary(){
        System.out.println(String.format("Rank: %s\nDescrição: %s\nObjetivo: %s\nLocal: %s\n", rankMission,descricao,objetivo,local));
    }

    /**
     * @return the rankMission
     */
    public String getRankMission() {
        return rankMission;
    }
    /**
     * @return the objetivo
     */
    public String getObjetivo() {
        return objetivo;
    }
}