package classes;


import enums.Country;
import enums.Gender;

import java.time.LocalDate;

public class Person {




    private String LastName;
    private String FistName;
    private int id;
    private int number;
    private Country country;

    private Gender gender;

    public Country getCountry() {
        return country;
    }

    public Country setCountry(Country country) {
        this.country = country;
        return country;
    }

    public Gender getGender() {
        return gender;
    }

    public Gender setGender(Gender gender) {
        this.gender = gender;
        return gender;
    }

    public Person() {
    }

    public Person(String lastName, String fistName, int id, int number, Country country, Gender gender) {
        LastName = lastName;
        FistName = fistName;
        this.id = id;
        this.number = number;
        this.country = country;
        this.gender = gender;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Person(int id) {
        this.id = id;
    }

    public String getLastName() {

        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFistName() {
        return FistName;
    }

    public void setFistName(String fistName) {
        FistName = fistName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(String lastName, String fistName, int id) {

        LastName = lastName;
        FistName = fistName;
        this.id = id;
    } public Person(String lastName, String fistName, int id,Country country,Gender gender) {

        LastName = lastName;
        FistName = fistName;
        this.id = id;
        this.country=country;
        this.gender=gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "LastName='" + LastName + '\'' +
                ", FistName='" + FistName + '\'' +
                ", id=" + id +
                ", country=" + country +
                ", gender=" + gender +
                '}';
    }

    public void setCountry(String nextLine) {
        System.out.println(getCountry());
    }
}
