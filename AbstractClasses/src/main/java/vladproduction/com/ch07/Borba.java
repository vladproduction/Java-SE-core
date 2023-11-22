package vladproduction.com.ch07;

public class Borba extends Sport {

    @Override
    public void describeRules() {
        System.out.println("Borba.rules");
    }

    @Override
    public boolean isTeamSport() {
        return false;
    }
}
