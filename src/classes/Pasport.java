package classes;

import enums.Country;
import enums.Gender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import static enums.Country.*;
import static enums.Country.RUSSIAN;
import static enums.Gender.FAMALE;
import static enums.Gender.MALE;

public class Pasport  {

    private  int id;
    private  String LastName;
    private String FirstName;
    private LocalDate Birthday;
    private Country country;
    private Gender gender;

    public Pasport(int id, String lastName, String firstName, LocalDate birthday, Country country, Gender gender) {
        this.id = id;
        LastName = lastName;
        FirstName = firstName;
        Birthday = birthday;
        this.country = country;
        this.gender = gender;
    }
    public Pasport(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public LocalDate getBirthday() {
        return Birthday;
    }

    public void setBirthday(LocalDate birthday) {
        Birthday = birthday;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Pasport{" +
                "id=" + id +
                ", LastName='" + LastName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", Birthday=" + Birthday +
                ", country=" + country +
                ", gender=" + gender +
                '}';
    }
}
