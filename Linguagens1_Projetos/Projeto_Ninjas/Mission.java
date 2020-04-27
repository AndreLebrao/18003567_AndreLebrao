/**
 * Mission
 */
public class Mission {

    private String rankMission;
    private String descricao;
    private String objetivo;
    private String local;

    public Mission(String rankMission, String descricao, String objetivo, String local) {
        this.rankMission = rankMission;
        this.descricao = descricao;
        this.objetivo = objetivo;
        this.local = local;
    }

    /**
     * @return the objetivo
     */
    public String getObjetivo() {
        return objetivo;
    }
}