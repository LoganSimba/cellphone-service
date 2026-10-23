package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone phone1 = new CellPhone();
        CellPhone phone2 = new CellPhone();


        Scanner input = new Scanner(System.in);

        phone1.setOwner("Steph curry");
        phone1.setPhoneNumber("66666");
        phone2.setOwner("Lebron James");
        phone2.setPhoneNumber("207772222");

        //example of using dail for a number
        phone1.dial("2073312332");

        //example of calling another calss
        phone1.dial(phone2.getPhoneNumber());


//        phone1.setModel(askQuestion(input, "What is your phone model"));
//
//        phone1.setSerialNumber(Integer.parseInt(askQuestion(input, "What is your serial Number")));
//        phone1.setPhoneNumber(askQuestion(input, "What is your phone number"));
//        phone1.setCareer(askQuestion(input, "Who is your career"));
//        phone1.setOwner(askQuestion(input, "Who is the owner:"));
//
//        String myphone = phone1.toString();
//        System.out.println(myphone);
    }


    public static String askQuestion(Scanner scanner, String question){
        System.out.println(question + ":");
        return scanner.nextLine().trim();
    }


    public static void display(CellPhone thisPhone){

    }



}
