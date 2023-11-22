package vladproduction.com.app02;


import vladproduction.com.app01.Phone;

public class MobilePhone extends Phone {

    public void createColor(String colorValue){
        color=colorValue;
    }

    public void alarm(){
        System.out.println("MobilePhone.alarm()");
    }


    public void call(){
        System.out.println("MobilePhone.call()");
    }

    public void parentCall(){
        super.call();
        sms();
    }

    public void sms(){
        System.out.println("MobilePhone.sms()");
    }



    public void makePhoto(){
        System.out.println("Phone.makePhoto()");
    }








}
