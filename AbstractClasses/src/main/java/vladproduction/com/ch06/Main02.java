package vladproduction.com.ch06;

public class Main02 {

    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.play();

        Guitar guitar = new Guitar();
        guitar.play();

        Accordion accordion = new Accordion();
        accordion.play();
        System.out.println("------other methods not from abstract class-----------");
        guitar.printColor();
        piano.printPrice();
        accordion.weight();

        System.out.println("-------------IS-A------------------");
        // Guitar IS-A MusicInstrument
        MusicInstrument instrument1 = new Guitar();
        instrument1.play();
        //instrument1.printColor();

        MusicInstrument instrument2 = new Piano();
        instrument2.play();
        //instrument2.printPrice();

        MusicInstrument instrument3 = new Accordion();
        //instrument3.weight();
        instrument3.play();

        System.out.println("----------------------------------------");
        //makeMusic(instrument2);
        MusicInstrument instrument4 = new Viola();
        makeMusic(instrument4);

        System.out.println("------------Factory----------------------------");
        MusicInstrument musicInstrument = getMusicInstrument(2);
        musicInstrument.play();
    }


    public static MusicInstrument getMusicInstrument(int type){
        MusicInstrument instrument = null;
        if(type==0){
            instrument = new Guitar();
        }else if(type==1){
            instrument = new Piano();
        } else if(type==2){
            instrument = new Accordion();
        } else {
            instrument = new Viola();
        }
        return instrument;
    }

    public static void makeMusic(MusicInstrument musicInstrument){
        System.out.println("Consert is going to begin");
        musicInstrument.play();
        System.out.println("Consert is going to end");
    }
}
