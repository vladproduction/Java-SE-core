package vladproduction.com.ch07;

public abstract class Sport {

    public abstract void describeRules();

    public abstract boolean isTeamSport();

    public void makePresentation(){
        System.out.println("Sport.makePresentation()");
        if(isTeamSport()){
            System.out.println("######SPORT IS FOR TEAM#####");
            describeRules();
            System.out.println("######COOL!#####");
        }
    }

}
