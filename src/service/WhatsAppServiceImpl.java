package service;

import classes.Person;
import classes.Profil;
import classes.WhatsApp;
import enums.WhatsAppStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhatsAppServiceImpl implements WhatsAppService{
    WhatsApp whatsApp =new WhatsApp();

    Scanner scanner = new Scanner(System.in);
    List<WhatsApp>whatsApps = new ArrayList<>();

    @Override
    public void whatsAppProfile() {

    }

    @Override
    public void messageSend() {

    }

    @Override
    public void whatsAppTransfer() {

    }

    @Override
    public void addContact() {

    }

    @Override
    public void changeStatus() {

    }

    @Override
    public List<WhatsAppStatus> getAllWatsAppStatus(List<WhatsAppStatus> whatsAppStatuses) {
        return null;
    }

    @Override
    public void getAllWatsApp() {
        System.out.println("~~~~~~CREATE A WHATSAPP~~~~~~");
        System.out.println("ID:");
        whatsApp.setId(scanner.nextInt());
        // int id2 = scanner.nextInt();
        System.out.println("PhonaNumber:");
        whatsApp.setPhoneNumber(scanner.nextLine());
        //int phoneNumber = scanner.nextInt();
        whatsApp.setPhoneNumber(scanner.nextLine());
        System.out.println("UserName:");
        // String n2 = scanner.nextLine();
        whatsApp.setUserName(scanner.nextLine());

        //String userName = scanner.nextLine();
        System.out.println("Password:");
        whatsApp.setPassword(scanner.nextLine());

        //String password = scanner.nextLine();
        System.out.println();

        System.out.println("==================================");

        System.out.println("ID: " + whatsApp.getId() + "\n" + "UserName:" + whatsApp.getUserName() + "\nIMAGE: " + "image" +
                "\n" + "PhoneNumber: " + whatsApp.getPhoneNumber() + "\n" + "Password: " + whatsApp.getPassword());
        System.out.println("COMAND END!");
        System.out.println("===================================");
        System.out.println();
    }

    @Override
    public void getMessage() {

    }

    @Override
    public String greatWhatsAppUserAccount(List<WhatsApp> whatsAppUserServices, List<Person> people) {
        return null;
    }

    @Override
    public List<WhatsApp> getWhatsAppUserService() {
        return null;
    }

    @Override
    public WhatsApp getProfil(String password, List<WhatsApp> whatsAppUserServices) {
        return null;
    }

    @Override
    public String getMassage(String password, String name, String massage, List<WhatsApp> userServices) {
        return null;
    }

    @Override
    public List<WhatsApp> getAllWhatsapp(List<WhatsApp> whatsApps) {
        return whatsApps;
    }


    public WhatsApp LoginToProfil(int id ,List<WhatsApp>whatsApps) {

        for (WhatsApp app : whatsApps) {
            if(app.getId()==id){
                return app;
            }
        }
        return null;
    }public  void LogintoProfil(){

    }

    @Override
    public List<WhatsAppStatus> getAllStatus(List<WhatsAppStatus> whatsAppStatuses) {
        return whatsAppStatuses;
    }

    @Override
    public boolean InstallPassport() {
        return false;
    }

    @Override
    public void ChangeStatus() {

    }

    @Override
    public void AddContact() {

    }

    @Override
    public void SendMessage(String passport, String name, String message, List<Profil> profils, List<Profil> profils1) {

    }

}
