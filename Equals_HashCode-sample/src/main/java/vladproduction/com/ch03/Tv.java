package vladproduction.com.ch03;

public class Tv {
    public int price;
    public String model;

    public int hashCode(){
        return price+model.length();
    }

    public boolean equals(Object other){
        if(other==null){
            return false;
        }
        if(other==this){
            return true;
        }
        if(other.getClass()==Tv.class){
            Tv otherTv = (Tv)other;
            if(price!= otherTv.price){
                return false;
            }
            if(!model.equals(otherTv.model)){
                return false;
            }
            return true;
        }
        return false;
    }

}
