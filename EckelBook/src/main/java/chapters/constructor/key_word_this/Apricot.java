package chapters.constructor.key_word_this;

public class Apricot {
    void pick(){
        /**/
    }
    void pit(){
        this.pick();
        /**/
    }
    //or we can say:
    void pit2(){
        pick(); //no use key word "this"
        /**/
    }
}
