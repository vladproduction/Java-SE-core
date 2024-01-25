package chapters.finalize_AND_garbage_collector;

public class Chair {
    static boolean garbCollRun = false;
    static boolean f = false;
    static int created = 0;
    static int finalized = 0;
    int i;

    public Chair() {
        i = ++created;
        if(created==47){
            System.out.println("Created 47");
        }
    }
    public void finalize(){
        if(!garbCollRun){
            //first time invoke finalize()
            garbCollRun = true;
            System.out.println("Beginning to finalize after "+created+
                    "= Chairs have been created");
        }
        if (i==47){
            System.out.println("Finalizing Chair#47"+
                    " Flag to stop creating Chair");
            f = true;
        }
        finalized++;
        if(finalized>=created){
            System.out.println("All "+finalized+": finalized");
        }
    }
}
