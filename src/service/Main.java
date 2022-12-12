package service;

import classes.Pasport;
import classes.Person;
import classes.WhatsApp;
import enums.Country;
import enums.Gender;

import java.util.*;
import java.util.List;

import static enums.Country.*;
import static enums.Gender.FAMALE;
import static enums.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> peoples = new ArrayList<>();
        List<WhatsApp> whatsAppsList = new ArrayList<>();
        Pasport pasport = new Pasport();
PersonServiceImpl personService = new PersonServiceImpl();
        Person person = new Person();
        Person person1 = new Person();
        WhatsApp whatsApp = new WhatsApp();
        WhatsAppServiceImpl whatsAppService = new WhatsAppServiceImpl();
        Country country;



        while (true) {

            System.out.println("~~~~~~~~~~WhatsApp~~~~~~~~~~~~");
            System.out.println("~~~~~~~~CHOOSSE A TEAM~~~~~~~~");
            System.out.println("1. GET A PASSPORT");
            System.out.println("2.CREATE A WHATSAPP");
            System.out.println("3.WhatsApp profilge kiruu");
            System.out.println("4.Bazada Passportu bar adamdardy aluu");
            System.out.println("5.Chatka kiruu");
            System.out.println("6.Get all WhatsApp");
            System.out.println("7.Get WhatsApp Group");
            System.out.println("8.Person WhatsApp Group ");
            System.out.println("9.Get Person By First name");
            System.out.println("10: MESSEG ");
            System.out.println("11: Get WhatsApp Status");


            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    personService.CreatePasport();
                    System.out.println("COMAND END!");
                    System.out.println("============================");
                    System.out.println();

//                    // pasport.Passports();
//                    System.out.println("~~~~~~GET A PASSPORT~~~~~~");
//                    System.out.println("FirtsName jaz:");
//                    String n1 = scanner.nextLine();
//                    person.setFistName(scanner.nextLine());
//                    System.out.println("LastName jaz:");
//                    person.setLastName(scanner.nextLine());
//
//                    System.out.println("ID jaz:");
//                    person.setId(scanner.nextInt());
//
//                    System.out.println("PhoneNumber jaz:");
//                    person.setNumber(scanner.nextInt());
//
//                    System.out.println("Выбери страну:");
//                    System.out.println("1: " + KYRGYZSTAN);
//                    System.out.println("2: " + KAZAKSTAN);
//                    System.out.println("3: " + CHINA);
//                    System.out.println("4: " + KOREAN);
//                    System.out.println("5: " + JAPAN);
//                    System.out.println("6: " + USA);
//                    System.out.println("7: " + RUSSIAN);
//
//
//                    int numb = scanner.nextInt();
//                    //person.setCountry(scanner.nextLine());
//                    //int  s = scanner.nextInt();
//                    if (numb == 1) System.out.println("Country: " + person.setCountry(KYRGYZSTAN));
//                    else if (numb == 2) System.out.println("Country: " + person.setCountry(KAZAKSTAN));
//                    else if (numb == 3) System.out.println("Country: " + person.setCountry(CHINA));
//                    else if (numb == 4) System.out.println("Country: " + person.setCountry(KOREAN));
//                    else if (numb == 5) System.out.println("Country: " + person.setCountry(JAPAN));
//                    else if (numb == 6) System.out.println("Country: " + person.setCountry(USA));
//                    else if (numb == 7) System.out.println("Country: " + person.setCountry(RUSSIAN));
//
//                    System.out.println("Выбери пол: ");
//                    System.out.println("1: " + MALE);
//                    System.out.println("2: " + Gender.FAMALE);
//
//                    int sanw = scanner.nextInt();
//                    if (sanw == 1) System.out.println("Gender: " + person.setGender(MALE));
//                    else if (sanw == 2) System.out.println("Gender: " + person.setGender(FAMALE));
//
//
//                    System.out.println("============================");
//
//
//                    System.out.println("FirstName: " + person.getFistName() + "\n" + "LastName: " + person.getLastName() + "\n" + "ID: " + person.getId() +
//                            "\n" + "PhoneNumber: " + person.getNumber() + "\nCountry: " + person.getCountry() + "\nGender: " + person.getGender());
//                    System.out.println();
//                    System.out.println("COMAND END!");
//                    System.out.println("============================");
//                    System.out.println();
                    break;

                case 2:
                    whatsAppService.getAllWatsApp();
//                    System.out.println("~~~~~~CREATE A WHATSAPP~~~~~~");
//                    System.out.println("ID:");
//                    whatsApp.setId(scanner.nextInt());
//                    // int id2 = scanner.nextInt();
//                    System.out.println("PhonaNumber:");
//                    whatsApp.setPhoneNumber(scanner.nextLine());
//                    //int phoneNumber = scanner.nextInt();
//                    whatsApp.setPhoneNumber(scanner.nextLine());
//                    System.out.println("UserName:");
//                    // String n2 = scanner.nextLine();
//                    whatsApp.setUserName(scanner.nextLine());
//
//                    //String userName = scanner.nextLine();
//                    System.out.println("Password:");
//                    whatsApp.setPassword(scanner.nextLine());
//
//                    //String password = scanner.nextLine();
//                    System.out.println();
//
//                    System.out.println("==================================");
//
//                    System.out.println("ID: " + whatsApp.getId() + "\n" + "UserName:" + whatsApp.getUserName() + "\nIMAGE: " + "image" +
//                            "\n" + "PhoneNumber: " + whatsApp.getPhoneNumber() + "\n" + "Password: " + whatsApp.getPassword());
//                    System.out.println("COMAND END!");
//                    System.out.println("===================================");
//                    System.out.println();
                    break;
                case 3:
                    System.out.println("~~~~~~~WhatsApp profilge kiruu~~~~~~~");

                    System.out.println("Write WhatsApp ID:");
                    String san = scanner.nextLine();
                    int num = scanner.nextInt();
                    String saan = scanner.nextLine();
                    if (num == (person.getId())) {
                        System.out.println("FirstName: " + person.getFistName() + "\n" + "LastName: " + person.getLastName() + "\n" + "ID: " + person.getId() +
                                "\n" + "PhoneNumber: " + person.getNumber() + "\nCountry: " + person.getCountry() + "\nGender: " + person.getGender());

                        System.out.println();
                    }

                    break;
                case 4:
                    System.out.println("~~~~~~~~Bazada Passportu bar adamdardy aluu~~~~~~~~~");
                    System.out.println("Write ID: ");
                    int ds = scanner.nextInt();
                    //String v = scanner.nextLine();
                    if (ds == (person.getId()))
                        System.out.println("FirstName: " + person.getFistName() + "\n" + "LastName: " + person.getLastName() + "\n" + "ID: " + person.getId() +
                                "\n" + "PhoneNumber: " + person.getNumber() + "\nCountry: " + person.getCountry() + "\nGender: " + person.getGender());
                    System.out.println();
                    System.out.println("COMAND END!");
                    System.out.println("============================");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("~~~~~~~~~~ Chatka kiruu ~~~~~~~~~~");
                    System.out.println("Выбери отправителя по ID:");

                    int get = scanner.nextInt();
                    if (get == person.getId()) System.out.println(whatsApp.getUserName());
                    System.out.println("Выбери получателя по ID:");
                    int g = scanner.nextInt();
                    if (g == person.getId()) System.out.println(whatsApp.getUserName());
                    System.out.println("Напиши  смс : ");
                    String SSSS = scanner.nextLine();
                    String sms = scanner.nextLine();
                    System.out.println("Получил:  " + person.getFistName() + ": " + "'" + sms + "'");
                    System.out.println();
                    break;
                case 6:System.out.println("~~~~~~~~~Get all WhatsApp~~~~~~~~~~~");
                    System.out.println(person);
                    System.out.println(whatsApp);
                    break;
                case 7:
                    System.out.println("~~~~~~Get WhatsApp Group~~~~~~~");
                    break;
                case 8:
                    System.out.println("~~~~~Person WhatsApp Group~~~~~~ ");
                    break;
                case 9:
                    System.out.println("~~~~Get Person By First name~~~~");
                    String names = scanner.nextLine();
                    String namess = scanner.nextLine();
                    if (namess.equals(person.getFistName())) System.out.println(person);
                    break;
                case 11:
                    System.out.println();


            }

        }



    }
}