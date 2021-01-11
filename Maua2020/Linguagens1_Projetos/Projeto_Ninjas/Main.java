/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Mission mission = new Mission("S", "descricao", "objetivo", "local");
        Ninja ninja = new Ninja("Naruto", "Uzumaki");
        // ninja.train();
        // AcademicStudent academicStudent = new AcademicStudent("Sasuke", "Uchiha");
        // academicStudent.train();
        Chuunin chuunin = new Chuunin("Iruka","Umino",mission);
        // chuunin.train();
        // chuunin.goToMission();
        Jounin jounin = new Jounin("Kakashi", "Hatake",mission);
        jounin.mission.getSummary();

        System.out.println(jounin.goToMission(mission)); 

    }
}