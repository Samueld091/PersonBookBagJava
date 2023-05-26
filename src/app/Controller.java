//======================================================
//PROGRAMMER:    Samuel Rodriguez
//PANTHER ID:    6295459
//
//CLASS: 		 COP2210
//SECTION: 	     U03C
//SEMESTER: 	 Summer 2022
//CLASSTIME: 	 T/TH 5:00-7:40pm
//
//Assignment:  Lab 9
//
//CERTIFICATION:
//I understand FIU's academic policies, and I certify
//that this work is my own and that none of it is the
//work of any other person.
//======================================================

package app;

import living.Person;
import things.*;

import java.util.Random;

public class Controller {
    public static void main(String[] args)
    {
        yourInfoHeader();

        Random rndGen = new Random();
        Person person = new Person("Mike", "Johnson");
        BookBag bookBag = new BookBag(person);

        person.setBookBag(bookBag);

        for(int i = 0; i < 5; i++)
        {
            int areaCode = 100 + rndGen.nextInt(900);
            int threeDigit = 100 + rndGen.nextInt(900);
            int fourDigit = 1000 + rndGen.nextInt(9000);
            String number = "(" + areaCode + ")-" + threeDigit + "-" + fourDigit;
            Phone phone = new Phone(number);

            bookBag.getItems().add(phone);
        }

        String[] subjects = {"Math", "Chemistry", "Economics", "CS", "Physics", "History"};

        for(int i = 0; i < 4;i++)
        {
            Book book = new Book(subjects[rndGen.nextInt(6)], 50 + rndGen.nextInt(200 - 50) + rndGen.nextDouble());

            bookBag.getItems().add(book);

        }

        PencilBag pencilBag = new PencilBag();
        bookBag.getItems().add(pencilBag);
        String[] colors = {"Red", "Black", "Green", "Blue"};

        for(int i = 0; i < 5; i++)
        {
            Pen pen = new Pen(colors[rndGen.nextInt(4)], 1 + rndGen.nextInt(4 - 1) + rndGen.nextDouble());

            pencilBag.getPens().add(pen);
        }

        bookBag.displayItems();

        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Total Price Of Possessions");
        System.out.println("----------------------------");
        System.out.printf("Total: $%-10.2f\n", person.totalPriceOfPossesions());

    }

    public static void yourInfoHeader()
    {
        System.out.println("======================================================");
        System.out.println("PROGRAMMER: " + "Samuel Rodriguez");
        System.out.println("PANTHER ID: " + "6295459");
        System.out.println();
        System.out.println("CLASS: \t\t COP2210  ");
        System.out.println("SECTION: \t " + "U03C");
        System.out.println("SEMESTER: \t " + "Summer 2022");
        System.out.println("CLASSTIME: \t " + "T/TH 5:00-7:40pm");
        System.out.println();
        System.out.println("Assignment:  " + "Lab 9");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person.");
        System.out.println("======================================================");
        System.out.println();
    }




}
