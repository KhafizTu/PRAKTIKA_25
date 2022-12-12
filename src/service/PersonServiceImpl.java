package service;

import classes.Pasport;
import classes.Person;
import enums.Country;
import enums.Gender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static enums.Country.*;
import static enums.Country.RUSSIAN;
import static enums.Gender.FAMALE;
import static enums.Gender.MALE;

public class PersonServiceImpl implements PersonService{
    List<Pasport> passports = new ArrayList<>();
    @Override
    public List<Pasport> getAllPassport() {

        return passports;
    }

    @Override
    public List<Pasport> FirstNamePassport() {
        System.out.println("Write the first name:");
        String firstName = new Scanner(System.in).next();
        for (Pasport pasport : passports) {
            if (pasport.getFirstName().equals(firstName)) {
                System.out.println(pasport);
            }
        }
        return null;
    }

    @Override
    public List<Country> getAllCity() {
        return List.of(Country.values());
    }

    @Override
    public String CreatePasport() {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        System.out.println("~~~~~~GET A PASSPORT~~~~~~");
        System.out.println("FirtsName jaz:");
        //String n1 = scanner.nextLine();
        person.setFistName(scanner.nextLine());
        System.out.println("LastName jaz:");
        person.setLastName(scanner.nextLine());

        System.out.println("ID jaz:");
        person.setId(scanner.nextInt());

        System.out.println("PhoneNumber jaz:");
        person.setNumber(scanner.nextInt());

        System.out.println("Выбери страну:");
        System.out.println("1: " + KYRGYZSTAN);
        System.out.println("2: " + KAZAKSTAN);
        System.out.println("3: " + CHINA);
        System.out.println("4: " + KOREAN);
        System.out.println("5: " + JAPAN);
        System.out.println("6: " + USA);
        System.out.println("7: " + RUSSIAN);


        int numb = scanner.nextInt();
        //person.setCountry(scanner.nextLine());
        //int  s = scanner.nextInt();
        if (numb == 1) System.out.println("Country: " + person.setCountry(KYRGYZSTAN));
        else if (numb == 2) return "Country: " + person.setCountry(KAZAKSTAN);
        else if (numb == 3) return "Country: " + person.setCountry(CHINA);
        else if (numb == 4) return "Country: " + person.setCountry(KOREAN);
        else if (numb == 5) return "Country: " + person.setCountry(JAPAN);
        else if (numb == 6) return "Country: " + person.setCountry(USA);
        else if (numb == 7) return "Country: " + person.setCountry(RUSSIAN);

        System.out.println("Выбери пол: ");
        System.out.println("1: " + MALE);
        System.out.println("2: " + Gender.FAMALE);

        int sanw = scanner.nextInt();
        if (sanw == 1) return "Gender: " + person.setGender(MALE);
        else if (sanw == 2) return "Gender: " + person.setGender(FAMALE);


        System.out.println("============================");

        System.out.println( "FirstName: " + person.getFistName() + "\n" + "LastName: " + person.getLastName() + "\n" + "ID: " + person.getId() +
                "\n" + "PhoneNumber: " + person.getNumber() + "\nCountry: " + person.getCountry() + "\nGender: " + person.getGender());

//        System.out.println("COMAND END!");
//        System.out.println("============================");
//        System.out.println();
     return null;
    }
}
