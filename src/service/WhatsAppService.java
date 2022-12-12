package service;

import classes.Person;
import classes.Profil;
import classes.WhatsApp;
import enums.WhatsAppStatus;

import java.util.List;

public interface WhatsAppService {

    void getAllWatsApp();
    void getMessage();
    String greatWhatsAppUserAccount(List<WhatsApp> whatsAppUserServices, List<Person>people);

    List<WhatsApp>getWhatsAppUserService();

    WhatsApp getProfil(String password, List<WhatsApp>whatsAppUserServices);

    String getMassage(String password,String name,String massage, List<WhatsApp>userServices);
    List<WhatsApp> getAllWhatsapp(List<WhatsApp> whatsApps);



    List<WhatsAppStatus> getAllStatus(List<WhatsAppStatus>whatsAppStatuses);

    boolean InstallPassport();


}
