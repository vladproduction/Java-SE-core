package com.app.vp.chapter_6_generics.fruit_example;

import java.util.ArrayList;
import java.util.List;

public class FruitMain {
    public static void main(String[] args) {

        //PRODUCER EXTENDS (only for reading)
        //Says that I can be a list of any object as long as this object extends Fruit.
        List<? extends Fruit> fruitExtendedList = new ArrayList<>();
//        fruitExtendedList.add(new Fruit("Fruit"));  //we can`t add fruit or something, compiler confused of defining type to add
        //but if we try to get some value: it`s legal
        Fruit fruit = fruitExtendedList.get(0); //This is valid as it can only return Fruit or its subclass.
        //ok, lets try to get object that extends Fruit:
//        Melon melon = (Melon) fruitExtendedList.get(0); //it`s possible if we know exactly what kind of fruit is (downcasting)
        /*This is not valid because fruitExtendedList can be a list of Fruit only, it may not be
          list of Melon or WaterMelon and in java we cannot assign sub class object to
          super class object reference without explicitly casting it.*/
        //same is case for :
//        WaterMelon waterMelon = fruitExtendedList.get(0);  //if we are sure we can cast it

        //let`s try to set some object to fruitExtendedList:
        //1) adding Fruit object:
//                fruitExtendedList.add(new Fruit("Fruit"));
        /*This in not valid because as we know fruitExtendedList can be a list of any
          object as long as this object extends Fruit. So what if it was the list of
          WaterMelon or Melon you cannot add Fruit to the list of WaterMelon or Melon.*/
        //2)Adding Melon object:
//                fruitExtendedList.add(new Melon("Melon"));
        /*This would be valid if fruitExtendedList was the list of Fruit but it may
          not be, as it can also be the list of WaterMelon object. So, we see an invalid
          condition already.*/
        //3)Finally let try to add WaterMelon object:
//                fruitExtendedList.add(new WaterMelon("WaterMelon"));
        /*Ok, we got it now we can finally write to fruitExtendedList as WaterMelon
          can be added to the list of Fruit or Melon as any superclass reference can point
          to its subclass object.*/
        /*
        * CONCLUSION:
        *   Basically we can say that we cannot write anything to a fruitExtendedList.
            This sums up List<? extends Fruit>*/

        //CONSUMER SUPER (available to add)
        //Says that I can be a list of anything as long as its object has super class of Melon.
        List<? super Melon> melonSuperList = new ArrayList<>();
        //Now lets try to get some value from melonSuperList:
//        Fruit fruit1 = melonSuperList.get(0);
        /*This is not valid as melonSuperList can be a list of Object as in java all
          the object extends from Object class. So, Object can be super class of Melon and
          melonSuperList can be a list of Object type*/
        //Similarly Melon, WaterMelon or any other object cannot be read.

        //But note that we can read Object type instances
        Object myObject = melonSuperList.get(0);
        /*This is valid because Object cannot have any super class and above statement
          can return only Fruit, Melon, WaterMelon or Object they all can be referenced by
          Object type reference.*/

        //Now, lets try to set some value from melonSuperList.
        //1)Adding Object type object
//              melonSuperList.add(new Object());
        /*This is not valid as melonSuperList can be a list of Fruit or Melon.
          Note that Melon itself can be considered as super class of Melon.*/
        //2)Adding Fruit type object
        //      melonSuperList.add(new Fruit())
        //This is also not valid as melonSuperList can be list of Melon
        //3)Adding Melon type object
                melonSuperList.add(new Melon("Melon"));
        /*This is valid because melonSuperList can be list of Object, Fruit or Melon and in
          this entire list we can add Melon type object.*/
        //4)Adding WaterMelon type object
                melonSuperList.add(new WaterMelon("WaterMelon"));
        //This is also valid because of same reason as adding Melon

        /*
        * CONCLUSION:
        * To sum it up we can add Melon or its subclass in melonSuperList and read only Object type object.*/

    }
}
