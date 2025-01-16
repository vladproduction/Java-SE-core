package com.vladproduction.date;


import java.util.Date;

public class DateExamples {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date); //data & time in compilation moment


        //указать точное количество миллисекунд,
        // которое прошло с 00:00 1 января 1970 года до требуемой даты
        Date date1 = new Date(1212121212121L);
        System.out.println(date1);

        //Cравнение. Определить была ли одна дата позже или раньше другой.
        Date dateA = new Date();
        Date dateB = new Date();
        if (dateA.getTime() > dateB.getTime()) {
            System.out.println("dateA позже dateB");
        } else {
            System.out.println("dateB позже dateA");
        }

        //Cравнение. using before(), after(), equals()
        //return boolean:true/false
        Date date11 = new Date();
        try {
            Thread.sleep(2000);//приостановим работу программы на 2 секунды
            Date date22 = new Date();
            Date date33 = new Date();
            System.out.println(date11.before(date22)); //true
            System.out.println(date11.after(date33));  //false
            System.out.println(date.equals(date33));  //false
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
