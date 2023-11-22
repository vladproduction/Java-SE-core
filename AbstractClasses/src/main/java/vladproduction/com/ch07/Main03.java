package vladproduction.com.ch07;

public class Main03 {

    public static void main(String[] args) {
        Sport sport1 = new Borba();
        sport1.makePresentation();
        sport1.describeRules();
        boolean isTeamSport = sport1.isTeamSport();
        System.out.println("isTeamSport="+isTeamSport);
        System.out.println("-------------------------");
        Sport sport2 = new Football();
        sport2.makePresentation();
        System.out.println("-------------------------");
        Sport sport3 = new Basketball();
        sport3.makePresentation();
    }

}
