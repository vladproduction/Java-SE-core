package vladproduction.com.football_example;

public class Football2 {

    private String country;
    public String tournament;
    protected String colorTsh;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int tourSquad(){
       return calcTourSquad();
    }

    private int calcTourSquad(){
        int line = 0;
        if("local".equals(tournament)){
            line = 40;
        }else{
            if("district".equals(tournament)){
                line = 30;
            }else{
                if("country".equals(tournament)){
                    line = 25;
                }
            }
        }
        return line;
    }

    public void team_Info(String nameTeam, int squad){
        System.out.println("Team name: "+nameTeam);
        System.out.println("Amount of players: "+squad);
        System.out.println("Shirt color: "+colorTsh);
        System.out.println("Country: "+getCountry());
    }

}
