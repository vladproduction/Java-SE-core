package chapters.finalize_AND_garbage_collector;

public class Garbage {
    public static void main(String[] args) {
        //till the flag does not set,
        //creating chairs and Strings
        while (!Chair.f){
            new Chair();
            new String("To take up space");
        }
        System.out.println( "After all Chairs have been created:\n" +
                "total created = " + Chair.created +
                ", total finalized = " + Chair.finalized);
        //unnecessary arguments forced Garbage Collector and finalization:
        if (args.length>0){
            if (args[0].equals("gc") || args[0].equals("all")){
                System.out.println("gc():");
                System.gc();
            }
            if(args[0].equals("finalize") || args[0].equals("all")){
                System.out.println("runFinalization:");
                System.runFinalization();
            }
        }
        System.out.println("...bye!");
    }
}
