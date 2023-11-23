package vladproduction.com.switch_;

public class MainDemo {
    public static void main(String[] args) {
        System.out.println("---------------switch----------------");
        String result2 = defineType2(100);
        System.out.println("result2="+result2);
    }

    private static String defineType2(int points){
        String type = null;
        switch (points){
            case 100:
                type = "World Class";
                break;
            case 60:
                type = "Country";
                break;
            case 10:
                type = "Region";
                break;
            default:
                type = "Amateur";
        }
        return type;
    }
}
