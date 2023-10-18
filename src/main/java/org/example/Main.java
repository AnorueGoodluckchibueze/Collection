package org.example;

import java.util.ArrayList;
import java.util.Iterator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> listOfPhone = new ArrayList<String>();
        listOfPhone.add("iphone");
        listOfPhone.add("samsung");
        listOfPhone.add("infinix");
        listOfPhone.add("techno");
        listOfPhone.add("oppo");


       Iterator<String> itr = listOfPhone.iterator();
       while (itr.hasNext())
           System.out.println(itr.next());

        //--------------------------------------------------------------------------------------------
        //iterating Arraylist using for each loop
        ArrayList<String> listOfFruits = new ArrayList<String>();
        listOfFruits.add("mango");
        listOfFruits.add("sweetOrange");
        listOfFruits.add("Grape");
        listOfFruits.add("banana");
        listOfFruits.add("plum");
        listOfFruits.add("pineApple");
        listOfFruits.add("watermelon");

        //Transversing list through for each loop
        for (String fruits:listOfFruits)
        System.out.println(fruits);

        ArrayList<String> listOfCountry = new ArrayList<String>();
        listOfCountry.add("japan");
        listOfCountry.add("china");
        listOfCountry.add("nigeria");
        listOfCountry.add("malta");
        listOfCountry.add("USA");
        listOfCountry.add("Niger");
        listOfCountry.add("Ghana");
        listOfCountry.add("brazil");

        System.out.println(listOfCountry);
        listOfCountry.remove(3);
        System.out.println(listOfCountry);

        ArrayList<String> listOfCountry2 = new ArrayList<String>();
        listOfCountry2.add("gambia");
        listOfCountry2.add("denmark");
        listOfCountry2.add("Germany");
        listOfCountry2.add("USA");
        listOfCountry2.add("Niger");
        listOfCountry.addAll(listOfCountry2);
        System.out.println(listOfCountry);

        ////Retain all method//
        listOfCountry.retainAll(listOfCountry2);
        System.out.println(listOfCountry);

        Iterator it = listOfCountry.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        }
    ///ArrayList example to remove element


    }
