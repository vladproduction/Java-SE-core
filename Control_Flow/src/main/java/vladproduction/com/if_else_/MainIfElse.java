package vladproduction.com.if_else_;

public class MainIfElse {
    public static void main(String[] args) {
        String result = defineType(15);
        System.out.println("result="+result);

System.out.println("Let's check the first table...");
		boolean food = hotFood();
		boolean table = tableServed();
		/*hotFood() && tableServed()*/ /*tableServed() && hotFood()*/   /*tableServed() || hotFood()*/ /*hotFood() || tableServed()*/
		if(table && food ){
			System.out.println("Time to eat");
		}else{
			System.out.println("Let's wait");
		}

    }

public static boolean hotFood(){
		System.out.println("Evaluating hotFood!");
		return true;
	}

	public static boolean tableServed(){
		System.out.println("Evaluating tableServered!");
		return false;
	}
    private static String defineType(int points){
        String type = null;
        if(points == 100){
            type = "World Class";
        } else if(points>50){
            type = "Country Class";
        } else if(points>10){
            type = "Region Class";
        } else {
            type= "Amator";
        }
        return type;
    }
}
