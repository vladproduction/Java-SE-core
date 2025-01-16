package com.vladproduction.calendar;
//Прибавить к текущей дате месяц или день
//Проверить, является ли год високосным;
//Получить отдельные компоненты даты (например, получить из целой даты номер месяца)
//А также — внутри него разработана очень удобная система констант


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import static java.util.Calendar.*;

public class CalendarExamples {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2023, 0 , 16);  //16.01.2023
        System.out.println(calendar); //объект Calendar в консоль

        Date date = calendar.getTime();
        System.out.println(date);

        GregorianCalendar calendar1 = new GregorianCalendar(2023, JANUARY , 16);
        System.out.println(calendar1);

        Calendar calendar2 = new GregorianCalendar();
        calendar2.set(Calendar.YEAR, 2023);
        calendar2.set(MONTH, 0);
        calendar2.set(Calendar.DAY_OF_MONTH, 16);
        calendar2.set(Calendar.HOUR_OF_DAY, 8);
        calendar2.set(Calendar.MINUTE, 5);
        calendar2.set(Calendar.SECOND, 5);
        System.out.println(calendar2.getTime());

        System.out.println("---------------------------------------------------");
        calendar2.add(Calendar.YEAR, -2);//чтобы отнять значение - в метод нужно передать отрицательное число
        System.out.println(calendar2.getTime());
        calendar2.roll(MONTH, -2);// метод roll() может прибавлять и убавлять значения,не
        System.out.println(calendar2.getTime());//затрагивая при этом другие значения, year does`t change
        calendar2.add(MONTH,+4);
        System.out.println(calendar2.getTime()); //year change
        System.out.println();

        System.out.println("---------------------------------------------------");
        //все поля объекта Calendar можно получить по отдельности. За это отвечает метод get():
        System.out.println("Год: " + calendar2.get(Calendar.YEAR));
        System.out.println("Месяц: " + calendar2.get(MONTH));
        System.out.println("Порядковый номер недели в месяце: " + calendar2.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Число: " + calendar2.get(Calendar.DAY_OF_MONTH));
        System.out.println("Часы: " + calendar2.get(Calendar.HOUR));
        System.out.println("Минуты: " + calendar2.get(Calendar.MINUTE));

        System.out.println("---------------------------------------------------");
        // 6 сентября 776 г. до н. э. - в Древней Греции проведены первые Олимпийские игры
        GregorianCalendar firstOlympicGames = new GregorianCalendar(776,Calendar.SEPTEMBER,6);
        firstOlympicGames.set(Calendar.ERA,GregorianCalendar.BC);
        DateFormat dateFormat = new SimpleDateFormat("dd MM yyy GG");
        String content = new String(" - в Древней Греции проведены первые Олимпийские игры");
        System.out.println(dateFormat.format(firstOlympicGames.getTime())+content);
        // класс SimpleDateFormat - дата в более понятном нам формате,
        // (буквы “GG” отвечают как раз за вывод эры)



        //-------------------------------------------------
        //пример создания объекта SimpleDateFormat и форматирования Date:
        System.out.println("---------------------------------------------------");
        SimpleDateFormat myFormat = new SimpleDateFormat("dd-MMMM-yyyy HH:mm");
        Calendar calendar3 = new GregorianCalendar();
        Date todayNow = calendar3.getTime();
        System.out.println("dd-MMMM-yyyy HH:mm");
        System.out.println(myFormat.format(todayNow));

        //----------------------------------------------------
        // transforming string to date
        System.out.println("---------------------------------------------------");
        String strDate = "02-June-2022, 08:05";
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy, HH:mm", Locale.ENGLISH); //has to be same
        try {
            Date dataPars = formatter.parse(strDate);
            System.out.println(dataPars);
            System.out.println(formatter.format(dataPars));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("---------------------------------------------------");
        SimpleDateFormat df = new SimpleDateFormat("EEEE, d MMMM yyyy");
        Calendar calendar4 = new GregorianCalendar(2023, JANUARY, 31);
        calendar4.set(MONTH, FEBRUARY);
        System.out.println(df.format(calendar4.getTime()));
        calendar4.set(DAY_OF_MONTH, 28);
        System.out.println(df.format(calendar4.getTime()));



    }
}
