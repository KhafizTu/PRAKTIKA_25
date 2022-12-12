package service;

import classes.Pasport;
import enums.Country;

import java.util.List;


public interface PersonService {
    List<Pasport> getAllPassport();

    List<Pasport> FirstNamePassport();

    List<Country> getAllCity();

    String CreatePasport();
}
