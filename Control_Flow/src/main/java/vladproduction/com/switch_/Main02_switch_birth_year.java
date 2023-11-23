package vladproduction.com.switch_;

public class Main02_switch_birth_year {
    public static void main(String[] args) {

        int yearOfBirth = IdentityBirthYear(36);
        System.out.println("Year of birth: "+yearOfBirth);

    }

    private static int IdentityBirthYear (int years){
        int idy=0;
        switch (years){
            case 36:
                idy = 1986;
                break;
            case 19:
                idy=2003;
                break;
            case 18:
                idy=2004;
                break;
            case 17:
                idy=2005;
                break;
            case 16:
                idy=2006;
                break;
        }
        return idy;
    }
}
